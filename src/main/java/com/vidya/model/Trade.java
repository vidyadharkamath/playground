package com.vidya.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "trades")
@NamedQueries( {
        @NamedQuery(name = "Trade.findAll", query = "SELECT t FROM Trade t"),
        @NamedQuery(name = "Trade.findById", query = " SELECT t FROM Trade t where t.tradeId = ?"),
        @NamedQuery(name = "Trade.findByDate", query = "SELECT t FROM Trade t where t.date between ? and ?") })
public class Trade implements Serializable
{
    private static final long serialVersionUID = 1L;

    private String tradeId;
    private Date date;
    private String type;
    private String ticker = "";
    private float unitPrice;
    private float quantity;
    private float commission;

    @Temporal(TemporalType.DATE)
    @Column(name = "TRADE_DATE", nullable = false)
    public Date getDate()
    {
        return date;
    }

    public void setDate(Date date)
    {
        this.date = date;
    }

    @Column(name = "TYPE", nullable = false)
    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    @Column(name = "TICKER", nullable = false)
    public String getTicker()
    {
        return ticker.toUpperCase();
    }

    public void setTicker(String ticker)
    {
        this.ticker = ticker;
    }

    @Column(name = "UNIT_PRICE", nullable = false)
    public float getUnitPrice()
    {
        return unitPrice;
    }

    public void setUnitPrice(float unitPrice)
    {
        this.unitPrice = unitPrice;
    }

    @Column(name = "QUANTITY", nullable = false)
    public void setQuantity(float quantity)
    {
        this.quantity = quantity;
    }

    public float getQuantity()
    {
        return quantity;
    }

    @Column(name = "COMMISSION")
    public void setCommission(float commission)
    {
        this.commission = commission;
    }

    public float getCommission()
    {
        return commission;
    }

    public void setTradeId(String tradeId)
    {
        this.tradeId = tradeId;
    }

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(name = "TRADE_ID", unique = true, nullable = false)
    public String getTradeId()
    {
        return tradeId;
    }

    public boolean equals(Object other)
    {
        if (this == other)
            return true;
        if (!(other instanceof Trade))
            return false;

        final Trade trade = (Trade) other;

        if (!trade.getTradeId().equals(getTradeId()))
            return false;

        return true;
    }

    public int hashCode()
    {
        int result = 20;

        result = 29 * result + getTicker().hashCode() + getDate().hashCode();

        return result;
    }
}
