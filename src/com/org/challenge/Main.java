package com.org.challenge;

import com.org.challenge.models.Currency;
import com.org.challenge.processor.Processor;

import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import static com.org.challenge.utils.Literals.*;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        boolean exit = false;
        List<Currency> currencies = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println(WELCOME);

        while (!exit) {
            System.out.println(PRINCIPAL_MENU);
            int option;
            try {
                option = scanner.nextInt();
            } catch (InputMismatchException e) {
                option = 4;
            }
            scanner.nextLine();

            switch (option) {
                case 1 -> new Processor().conversionProcess(scanner, currencies);
                case 2 -> new Processor().generateConversionHistory(currencies);
                case 0 -> exit = true;
                default -> System.out.println(INVALID_MESSAGE);
            }
        }
        System.out.println(FINAL_MESSAGE);
        scanner.close();
    }
}