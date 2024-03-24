package com.bilgeadam.lesson020;

import java.io.Serializable;

public class Movie implements Serializable {
    private String title;
    private String genre;
    private String year;

    public Movie(String title, String genre, String year) {
        this.title = title;
        this.genre = genre;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Movie{");
        sb.append("title='").append(title).append('\'');
        sb.append(", genre='").append(genre).append('\'');
        sb.append(", year='").append(year).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
