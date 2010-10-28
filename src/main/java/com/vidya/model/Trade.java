package com.vidya.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import org.hibernate.annotations.GenericGenerator;

@Entity(name = "trades")
@NamedQueries( {
        @NamedQuery(name = "Trade.findAll", query = " SELECT t FROM trades t"),
        @NamedQuery(name = "Trade.findById", query = " SELECT t FROM trades t where t.id = :id"),
        @NamedQuery(name = "Trade.findByDate", query = "SELECT t FROM trades t where t.date between :date1 and :date2") })
public class Trade implements java.io.Serializable
{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(name = "id")
    private String id;

    private Date date;
    private String type;
    private String ticker;
    private float unitPrice;
    private float quantity;
    private float commission;

    public Date getDate()
    {
        return date;
    }

    public void setDate(Date date)
    {
        this.date = date;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public String getTicker()
    {
        return ticker;
    }

    public void setTicker(String ticker)
    {
        this.ticker = ticker;
    }

    public float getUnitPrice()
    {
        return unitPrice;
    }

    public void setUnitPrice(float unitPrice)
    {
        this.unitPrice = unitPrice;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getId()
    {
        return id;
    }

    public void setQuantity(float quantity)
    {
        this.quantity = quantity;
    }

    public float getQuantity()
    {
        return quantity;
    }

    public void setCommission(float commission)
    {
        this.commission = commission;
    }

    public float getCommission()
    {
        return commission;
    }

}
