package com.org.challenge;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
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
            int option;
            try {
                option = scanner.nextInt();
            } catch (InputMismatchException e) {
                option = 0;
            }
            scanner.nextLine();

            switch (option) {
                case 1:
                    new CurrencyConverter().converter("USD", "ARS", currencies, scanner);
                    break;
                case 2:
                    new CurrencyConverter().converter("ARS", "USD", currencies, scanner);
                    break;
                case 3:
                    new CurrencyConverter().converter("USD", "BRL", currencies, scanner);
                    break;
                case 4:
                    new CurrencyConverter().converter("BRL", "USD", currencies, scanner);
                    break;
                case 5:
                    new CurrencyConverter().converter("USD", "COP", currencies, scanner);
                    break;
                case 6:
                    new CurrencyConverter().converter("COP", "USD", currencies, scanner);
                    break;
                case 7:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option. Please choose a valid option.");
            }
        }
        System.out.println("Thank you for using the currency converter.");

        /*System.out.println(currencies);
        System.out.println(gson.toJson(currencies));*/
        scanner.close();
    }
}