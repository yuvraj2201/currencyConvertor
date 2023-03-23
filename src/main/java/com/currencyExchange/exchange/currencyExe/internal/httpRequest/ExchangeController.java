package com.currencyExchange.exchange.currencyExe.internal.httpRequest;

import com.currencyExchange.exchange.currencyExe.api.ExchangeReciept;
import com.currencyExchange.exchange.currencyExe.api.request.ExchanageRequest;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.RequestBean;

import java.math.BigDecimal;

@Controller
public class ExchangeController {


    public ExchangeReciept exchangeAmount(@Body ExchanageRequest request){



        return null;

    }


}
