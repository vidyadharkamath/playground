package com.vidya.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "trades")
public class Trade
{
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(name = "id")
    private String id;

    private Date date;
    private String type;
    private String ticker;
    private float unitPrice;
    private float numShares;
    private float comission;

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

    public float getNumShares()
    {
        return numShares;
    }

    public void setNumShares(float numShares)
    {
        this.numShares = numShares;
    }

    public float getComission()
    {
        return comission;
    }

    public void setComission(float comission)
    {
        this.comission = comission;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getId()
    {
        return id;
    }

}
