package com.vidya.services;

import java.util.List;

import com.vidya.model.Trade;

public interface TradeService
{
    public List<Trade> getAllTrades();

    public void saveOrUpdate(Trade trade);

}