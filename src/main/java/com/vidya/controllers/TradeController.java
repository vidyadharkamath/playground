package com.vidya.controllers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vidya.model.Trade;
import com.vidya.model.User;
import com.vidya.services.TradeService;

@Controller
public class TradeController extends BaseController
{
    private TradeService tradeService;

    @RequestMapping(value = "/trade/add.do", method = RequestMethod.POST)
    public String add(@ModelAttribute("trade") Trade trade,
            BindingResult result, Map<String, Object> model)
    {
        User user = getLoggedInUser();
        if (user != null)
        {
            Set<Trade> trades = user.getTrades();
            trades.add(trade);
            userService.saveOrUpdate(user);
        }

        return "redirect:/trade/list.do";

    }

    @RequestMapping(value = "/trade/delete.do", method = RequestMethod.POST)
    public String delete(@ModelAttribute("trade") Trade trade,
            BindingResult result, Map<String, Object> model)
    {
        User user = getLoggedInUser();
        if (user != null)
        {
            Set<Trade> trades = user.getTrades();

            List<Trade> lookedUpTrade = tradeService.findTradeById(trade
                    .getTradeId());
            for (int i = 0; i < lookedUpTrade.size(); i++)
            {
                trades.remove(lookedUpTrade.get(0));
            }

            userService.saveOrUpdate(user);
        }
        return "redirect:/trade/list.do";

    }

    @RequestMapping(value = "/trade/list.do", method = RequestMethod.GET)
    public String showForm(Map<String, Object> model)
    {
        User user = getLoggedInUser();

        if (user != null)
        {
            String username = user.getUsername();

            model.put("userName", username);

            Collection<Trade> trades = tradeService.getAllTrades();
            model.put("trades", trades);

            List<String> tradeTypes = new ArrayList<String>();
            tradeTypes.add("Buy");
            tradeTypes.add("Sell");
            tradeTypes.add("Short To Sell");
            tradeTypes.add("Buy To Cover");

            model.put("tradeTypes", tradeTypes);
        }

        model.put("trade", new Trade());

        return "tradeList";
    }

    public void setTradeService(TradeService tradeService)
    {
        this.tradeService = tradeService;
    }

    public TradeService getTradeService()
    {
        return tradeService;
    }

}
