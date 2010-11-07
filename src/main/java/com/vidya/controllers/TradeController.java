package com.vidya.controllers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vidya.model.Trade;
import com.vidya.model.User;
import com.vidya.services.TradeService;
import com.vidya.services.UserService;

@Controller
public class TradeController
{
    private TradeService tradeService;
    private UserService userService;

    @RequestMapping(value = "/trade/add.do", method = RequestMethod.POST)
    public String add(@ModelAttribute("trade") Trade trade,
            BindingResult result, Map<String, Object> model)
    {

        Object principal = SecurityContextHolder.getContext()
                .getAuthentication().getPrincipal();

        if (principal instanceof User)
        {
            User user = (User) principal;

            user.getTrades().add(trade);

            userService.saveOrUpdate(user);
        }

        return "redirect:/trade/list.do";

    }

    @RequestMapping(value = "/trade/delete.do", method = RequestMethod.POST)
    public String delete(@ModelAttribute("trade") Trade trade,
            BindingResult result, Map<String, Object> model)
    {
        tradeService.delete(trade);

        return "redirect:/trade/list.do";

    }

    @RequestMapping(value = "/trade/list.do", method = RequestMethod.GET)
    public String showForm(Map<String, Object> model)
    {
        Object principal = SecurityContextHolder.getContext()
                .getAuthentication().getPrincipal();

        model.put("trade", new Trade());

        String username;
        if (principal instanceof UserDetails)
        {
            User user = (User) principal;
            username = user.getUsername();

            model.put("userName", username);

            Collection<Trade> trades = user.getTrades();
            model.put("trades", trades);

            List<String> tradeTypes = new ArrayList<String>();
            tradeTypes.add("Buy");
            tradeTypes.add("Sell");
            tradeTypes.add("Short To Sell");
            tradeTypes.add("Buy To Cover");

            model.put("tradeTypes", tradeTypes);
        }
        else
        {
            username = principal.toString();
        }
        return "tradeList";
    }

    public TradeService getTradeService()
    {
        return tradeService;
    }

    public void setTradeService(TradeService tradeService)
    {
        this.tradeService = tradeService;
    }

    public void setUserService(UserService userService)
    {
        this.userService = userService;
    }

    public UserService getUserService()
    {
        return userService;
    }
}
