package com.currencyExchange.exchange.currencyExe.api;

import java.math.BigDecimal;
import java.util.Date;

public class ExchangeReciept {

    private String from;

    private String to;

    private BigDecimal amount;

    private Date date;

    private BigDecimal exchangeTotal;

    private Double taxRate;

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public BigDecimal getExchangeTotal() {
        return exchangeTotal;
    }

    public void setExchangeTotal(BigDecimal exchangeTotal) {
        this.exchangeTotal = exchangeTotal;
    }

    public Double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(Double taxRate) {
        this.taxRate = taxRate;
    }
}
