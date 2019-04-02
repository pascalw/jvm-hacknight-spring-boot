package com.example.demo.quotes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(value = "/quotes")
public class QuotesController {
    private final QuoteService quotesService;

    @Autowired
    public QuotesController(QuoteService quotesService) {
        this.quotesService = quotesService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public Optional<Quote> getRandomQuote() {
        return this.quotesService.getRandomQuote();
    }
}
