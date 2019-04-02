package com.example.demo.quotes.services.online;

import com.example.demo.quotes.Quote;
import com.example.demo.quotes.QuoteService;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.Random;

public class OnlineQuoteService implements QuoteService {

    @Override
    public Optional<Quote> getRandomQuote() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://quotes.stormconsultancy.co.uk")
                .addConverterFactory(JacksonConverterFactory.create())
                .build();

        QuotesApi service = retrofit.create(QuotesApi.class);
        Call<List<OnlineQuote>> quotes = service.getQuotes();

        try {
            Response<List<OnlineQuote>> response = quotes.execute();
            List<OnlineQuote> onlineQuotes = response.body();

            return Optional.of(getRandom(onlineQuotes));
        } catch (IOException e) {
            e.printStackTrace();
            return Optional.empty();
        }
    }

    private Quote getRandom(List<OnlineQuote> onlineQuotes) {
        var randInt = new Random().nextInt(onlineQuotes.size());
        var quote = onlineQuotes.get(randInt);

        return new Quote(quote.getQuote(), quote.getAuthor());
    }
}
