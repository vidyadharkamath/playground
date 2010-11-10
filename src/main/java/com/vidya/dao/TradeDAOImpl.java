package com.vidya.dao;

import java.util.Date;
import java.util.List;

import com.vidya.model.Trade;

public class TradeDAOImpl extends BaseDAO implements TradeDAO
{
    @Override
    public void delete(Trade trade)
    {
        hibernateTemplate.delete(trade);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Trade> getAllTrades()
    {
        return (List<Trade>) hibernateTemplate
                .findByNamedQuery("Trade.findAll");
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Trade> getTradeById(String id)
    {

        return hibernateTemplate.findByNamedQuery("Trade.findById", id);
    }

    @Override
    public void saveOrUpdate(Trade trade)
    {
        hibernateTemplate.save(trade);
    }

    public void getBetween(Date date1, Date date2)
    {
        hibernateTemplate.findByNamedQuery("Trade.findByDate", date1, date2);
    }
}
