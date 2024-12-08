package ua.edu.ucu.apps;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class BrandFetchReader {

    public static final String BRAND_FETCH_URL = "https://api.brandfetch.io/v2/brands/";
    private static final String API_KEY = "KqbMfBmFlxFiRxVy4Scp+6hZQNewW4c+9lChAwxP0Is=";

    @SneakyThrows
    public Company fetch(String companyName) throws IOException, InterruptedException, URISyntaxException {
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder().GET().uri(new URI(BRAND_FETCH_URL + companyName)).header("Authorization", "Bearer" + API_KEY).build();

        HttpResponse<String> response =
         httpClient.send(httpRequest, BodyHandlers.ofString());
        System.out.println((response.body()));
        return new Company();
    }
}
