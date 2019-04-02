package com.example.demo.quotes;

import com.example.demo.quotes.services.RandomQuoteService;
import org.junit.Test;

import static org.junit.Assert.assertNotEquals;

public class RandomQuoteServiceTest {
    private final RandomQuoteService quoteService = new RandomQuoteService();

    @Test
    public void returnsRandomQuote() {
        var randquote1 = quoteService.getRandomQuote();
        var randquote2 = quoteService.getRandomQuote();

        assertNotEquals(randquote1, randquote2);
    }

}