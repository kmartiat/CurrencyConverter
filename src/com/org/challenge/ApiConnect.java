package com.org.challenge;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiConnect {
    public String search(String from, String to) throws IOException, InterruptedException {
        String url = "https://v6.exchangerate-api.com/v6/497df45a09cd507d54ce3d24/pair/%s/%s/200000000".formatted(from, to);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(URI.create(url)).build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
        return response.body();
    }
}
