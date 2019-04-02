package com.example.demo.configuration;

import com.example.demo.quotes.services.FixedQuotesService;
import com.example.demo.quotes.QuoteService;
import com.example.demo.quotes.services.RandomQuoteService;
import com.example.demo.quotes.services.online.OnlineQuoteService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Bean
    @ConditionalOnProperty(name = "quote.source", havingValue = "random", matchIfMissing = true)
    public QuoteService randomQuoteService() {
        logger.info("Using random quotes service");
        return new RandomQuoteService();
    }

    @Bean
    @ConditionalOnProperty(name = "quote.source", havingValue = "online")
    public QuoteService onlineQuoteService() {
        logger.info("Using online quotes service");
        return new OnlineQuoteService();
    }

    @Bean
    @ConditionalOnProperty(name = "quote.source", havingValue = "fixed")
    public QuoteService fixedQuoteService() {
        logger.info("Using fixed quotes service");
        return new FixedQuotesService();
    }
}
