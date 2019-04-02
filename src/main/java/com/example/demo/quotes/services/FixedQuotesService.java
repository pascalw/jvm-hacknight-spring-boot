package com.example.demo.quotes.services;

import com.example.demo.quotes.Quote;
import com.example.demo.quotes.QuoteService;

import java.util.Optional;

public class FixedQuotesService implements QuoteService {
    private final Quote quote = new Quote("The question isn’t who is going to let me; it’s who is going to stop me.", "Ayn Rand");
;
    public Optional<Quote> getRandomQuote() {
        return Optional.of(quote);
    }
}
