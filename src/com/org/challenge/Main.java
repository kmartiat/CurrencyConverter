package com.org.challenge;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        String url = new ApiConnect().search();
        System.out.println(url);
    }
}