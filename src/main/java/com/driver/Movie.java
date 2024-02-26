package com.driver;

public class Movie extends MediaItem {
	private String director;

    public Movie(String title, int year, String director) {
        super(title, year);
        this.director = director;
     // your code goes here
    }

    public String getDirector() {
    	// your code goes here
        return director;
    }

    @Override
    public void displayInfo() {
    	// your code goes here
    }
}
