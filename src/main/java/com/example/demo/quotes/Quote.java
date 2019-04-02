package com.example.demo.quotes;

import java.util.Objects;

public class Quote {
    public final String text;
    public final String author;

    public Quote(String text, String author) {
        this.text = text;
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quote quote = (Quote) o;
        return Objects.equals(text, quote.text) &&
                Objects.equals(author, quote.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, author);
    }

    @Override
    public String toString() {
        return "Quote{" +
                "text='" + text + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
