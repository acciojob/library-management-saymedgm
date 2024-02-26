package com.driver;

public class Movie extends MediaItem {
    private String director;

    public Movie(String title, int year, String director) {
        super(title, year);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Director: " + director);
    }
}