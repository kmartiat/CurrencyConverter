package com.org.challenge;

import com.org.challenge.models.Currency;
import com.org.challenge.models.CurrencyConverter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import static com.org.challenge.utils.Literals.MENU;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        boolean exit = false;
        List<Currency> currencies = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (!exit) {
            System.out.println(MENU);
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

        System.out.println("\033[0;1m" + "conversion date" + " | " +
                "conversion rate" + " | " +
                "amount" + " | " +
                "conversion result" + "\033[0m");
        currencies.forEach(System.out::println);
        System.out.println("Thank you for using the currency converter.");
        scanner.close();
    }
}