package com.example.demo.quotes;

import java.util.Optional;

public interface QuoteService {
    Optional<Quote> getRandomQuote();
}
