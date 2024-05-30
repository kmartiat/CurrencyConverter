package com.org.challenge.processor;

import com.org.challenge.models.Currency;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import static com.org.challenge.utils.Literals.CONVERSION_MENU;

public class Processor {
    public void conversionProcess(Scanner scanner, List<Currency> currencies) throws IOException, InterruptedException {
        boolean exit = false;
        while (!exit) {
            System.out.println(CONVERSION_MENU);
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
    }

    public void generateConversionHistory(List<Currency> currencies) {
        System.out.println("\033[0;1m" + "conversion date" + "   " +
                "conversion rate" + " | " +
                "amount" + " | " +
                "conversion result" + "\033[0m");
        System.out.println("\033[0;1m" + "---------------" + "   " +
                "---------------" + "   " +
                "------" + "   " +
                "-----------------" + "\033[0m");
        currencies.forEach(System.out::println);
        System.out.println();
    }
}
