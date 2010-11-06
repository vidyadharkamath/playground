package com.vidya.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vidya.model.Trade;
import com.vidya.services.TradeService;

@Controller
public class TradeController
{
    private TradeService tradeService;

    @RequestMapping(value = "/trade/add.do", method = RequestMethod.POST)
    public String add(@ModelAttribute("trade") Trade trade,
            BindingResult result, Map<String, Object> model)
    {
        tradeService.saveOrUpdate(trade);

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
        Trade trade = new Trade();
        model.put("trade", trade);

        List<Trade> trades = tradeService.getAllTrades();
        model.put("trades", trades);

        List<String> tradeTypes = new ArrayList<String>();
        tradeTypes.add("Buy");
        tradeTypes.add("Sell");
        tradeTypes.add("Short To Sell");
        tradeTypes.add("Buy To Cover");

        model.put("tradeTypes", tradeTypes);

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
}
