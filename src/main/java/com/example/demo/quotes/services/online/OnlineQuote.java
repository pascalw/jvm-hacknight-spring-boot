package com.example.demo.quotes.services.online;

import java.util.Objects;

public class OnlineQuote {
    private String id;
    private String author;
    private String quote;
    private String permalink;

    public String getAuthor() {
        return author;
    }

    public String getQuote() {
        return quote;
    }

    public String getId() {
        return id;
    }

    public String getPermalink() {
        return permalink;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OnlineQuote that = (OnlineQuote) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(author, that.author) &&
                Objects.equals(quote, that.quote) &&
                Objects.equals(permalink, that.permalink);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, author, quote, permalink);
    }

    @Override
    public String toString() {
        return "OnlineQuote{" +
                "id='" + id + '\'' +
                ", author='" + author + '\'' +
                ", quote='" + quote + '\'' +
                ", permalink='" + permalink + '\'' +
                '}';
    }
}
