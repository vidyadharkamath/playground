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
@RequestMapping("/addTrade.do")
public class AddTradeController
{
    private TradeService tradeService;

    public TradeService getTradeService()
    {
        return tradeService;
    }

    public void setTradeService(TradeService tradeService)
    {
        this.tradeService = tradeService;
    }

    @RequestMapping(method = RequestMethod.POST)
    public String processForm(@ModelAttribute("trade") Trade trade,
            BindingResult result, Map<String, Object> model)
    {
        System.out.println("trade: " + trade.getTicker());
        model.put("addTrade", trade);

        tradeService.saveOrUpdate(trade);

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

    @RequestMapping(method = RequestMethod.GET)
    public String showForm(Map<String, Trade> model)
    {
        Trade trade = new Trade();
        model.put("addTrade", trade);
        return "addTrade";
    }
}
