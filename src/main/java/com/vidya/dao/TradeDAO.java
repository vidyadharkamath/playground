package com.vidya.dao;

import java.util.Date;
import java.util.List;

import com.vidya.model.Trade;

public interface TradeDAO
{
    public void saveOrUpdate(Trade trade);

    public void delete(Trade trade);

    public List<Trade> getAllTrades();

    public Trade getTradeById(String id);

    public void getBetween(Date date1, Date date2);
}
