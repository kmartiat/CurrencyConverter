package com.org.challenge;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        boolean exit = false;
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        List<Currency> currencies = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        String menu = """
                *********************************************
                Welcome to the Currency Converter =]
                                
                1) Dollar (USD) =>> Peso Argentino (ARS).
                2) Peso Argentino (ARS) =>> Dollar (USD).
                3) Dollar (USD) =>> Real Brasileño (BRL).
                4) Real Brasileño (BRL) =>> Dollar (USD).
                5) Dollar (USD) =>> Peso Colombiano (COP).
                6) Peso Colombiano (COP) =>> Dollar (USD).
                7) Exit.
                                
                Choose a valid option:
                *********************************************
                """;

        while (!exit) {
            System.out.println(menu);
            int option = scanner.nextInt();
            scanner.nextLine();

            String response = "";

            switch (option) {
                case 1:
                    new CurrencyConverter().converter("USD", "ARS", currencies);
                    //response = new ApiConnect().search("USD", "ARS");
                    break;
                case 2:
                    new CurrencyConverter().converter("ARS", "USD", currencies);
                    //response = new ApiConnect().search("ARS", "USD");
                    break;
                case 3:
                    new CurrencyConverter().converter("USD", "BRL", currencies);
                    //response = new ApiConnect().search("USD", "BRL");
                    break;
                case 4:
                    response = new ApiConnect().search("BRL", "USD");
                    break;
                case 5:
                    response = new ApiConnect().search("USD", "COP");
                    break;
                case 6:
                    response = new ApiConnect().search("COP", "USD");
                    break;
                case 7:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option. Please choose a valid option.");
            }

            /*Currency currency = new Gson().fromJson(response, Currency.class);
            currencies.add(currency);
            System.out.println(currency.conversion_result());*/
        }
        System.out.println("Thank you for using the currency converter.");

        System.out.println(currencies);
        System.out.println(gson.toJson(currencies));
        scanner.close();
    }
}