package com.vidya.services;

import java.util.List;

import com.vidya.dao.TradeDAO;
import com.vidya.model.Trade;

public class TradeServiceImpl implements TradeService
{
    private TradeDAO tradeDAO;

    public TradeDAO getTradeDAO()
    {
        return tradeDAO;
    }

    public void setTradeDAO(TradeDAO tradeDAO)
    {
        this.tradeDAO = tradeDAO;
    }

    @Override
    public List<Trade> getAllTrades()
    {
        return tradeDAO.getAllTrades();
    }

    @Override
    public void saveOrUpdate(Trade trade)
    {
        tradeDAO.saveOrUpdate(trade);
    }
}
