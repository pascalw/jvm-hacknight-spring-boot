package com.example.demo.quotes.services.online;

import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface QuotesApi {
    @GET("/quotes.json")
    Call<List<OnlineQuote>> getQuotes();
}
