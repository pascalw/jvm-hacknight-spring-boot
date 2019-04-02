package com.example.demo.quotes.services;

import com.example.demo.quotes.Quote;
import com.example.demo.quotes.QuoteService;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;

public class RandomQuoteService implements QuoteService {
    private final List<Quote> quotes;

    public RandomQuoteService() {
        this.quotes = Arrays.asList(
                new Quote("Get busy living or get busy dying.", "Stephen King"),
                new Quote("If you want to live a happy life, tie it to a goal, not to people or things.", "Albert Einstein"),
                new Quote("The question isn’t who is going to let me; it’s who is going to stop me.", "Ayn Rand")
        );
    }
    @Override
    public Optional<Quote> getRandomQuote() {
        var randInt = new Random().nextInt(3);
        return Optional.of(this.quotes.get(randInt));
    }
}
