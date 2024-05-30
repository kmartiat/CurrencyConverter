package com.org.challenge.utils;

public class Literals {

    private Literals() {

    }

    public static final String CONVERSION_MENU = """
            *********************************************

            Type one of the following options:
                            
             1) Dollar (USD) =>> Peso Argentino (ARS).
             2) Peso Argentino (ARS) =>> Dollar (USD).
             3) Dollar (USD) =>> Real Brasileño (BRL).
             4) Real Brasileño (BRL) =>> Dollar (USD).
             5) Dollar (USD) =>> Peso Colombiano (COP).
             6) Peso Colombiano (COP) =>> Dollar (USD).
             7) Go back.
                                
            """;

    public static final String PRINCIPAL_MENU = """
            ****************************************************************
                        
             1. Perform a new conversion.
             2. View conversion history.
             0. End program.
                        
            Choose a valid option:         \s
            """;

    public static final String WELCOME = """
            ****************************************************************
                      *** Welcome to the Currency Converter ***""";

    public static final String INVALID_MESSAGE = "Invalid option. Please choose a valid option. \n";

    public static final String FINAL_MESSAGE = "Thank you for using the currency converter.";
}
