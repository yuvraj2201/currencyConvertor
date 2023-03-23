package com.currencyExchange.exchange.currencyExe.api.request;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

public class ExchanageRequest {

    @NotNull
    private String from;

    @NotNull
    private String to;

    @NotNull
    private BigDecimal amount;

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
}
