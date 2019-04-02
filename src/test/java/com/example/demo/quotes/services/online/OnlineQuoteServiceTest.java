package com.example.demo.quotes.services.online;

import org.junit.Test;

public class OnlineQuoteServiceTest {
    private final OnlineQuoteService onlineQuoteService = new OnlineQuoteService();

    @Test
    public void getsOnlineQuotes() {
        var quote = onlineQuoteService.getRandomQuote();
        System.out.println(quote);
    }
}