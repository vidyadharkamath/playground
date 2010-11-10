package com.vidya.services;

import java.util.List;

import com.vidya.model.Trade;

public interface TradeService
{
    public List<Trade> getAllTrades();

    public void saveOrUpdate(Trade trade);

    public void delete(Trade trade);

    public List<Trade> findTradeById(String Id);

}
