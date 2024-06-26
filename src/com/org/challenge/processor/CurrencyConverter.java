package com.org.challenge.processor;

import com.google.gson.Gson;
import com.org.challenge.api.ApiConnect;
import com.org.challenge.models.Currency;
import com.org.challenge.models.CurrencyDTO;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class CurrencyConverter {
    public void converter(String from, String to, List<Currency> currencies, Scanner scanner) throws IOException, InterruptedException {
        System.out.println("Enter an amount: ");
        Float amount = scanner.nextFloat();
        scanner.nextLine();

        String response = new ApiConnect().search(from, to);
        CurrencyDTO currencyDTO = new Gson().fromJson(response, CurrencyDTO.class);
        Currency currency = new Currency(currencyDTO, amount);

        currencies.add(currency);
        System.out.printf("The value %s [%s] corresponds to the final value %s [%s]", amount, from, currency.getConversionResult(), to);
        System.out.println("\n");
    }
}
