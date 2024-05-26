package com.org.challenge;

import com.google.gson.Gson;

import java.io.IOException;
import java.util.List;

public class CurrencyConverter {
    public void converter(String from, String to, List<Currency> currencies) throws IOException, InterruptedException {
        String response = new ApiConnect().search(from, to);
        Currency currency = new Gson().fromJson(response, Currency.class);
        currencies.add(currency);
        System.out.println(currency.conversion_result());
    }
}
