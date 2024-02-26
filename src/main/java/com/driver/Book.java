package com.driver;

public class Book extends MediaItem {
	private String author;

    public Book(String title, int year, String author) {
        super(title, year);
        this.author = author;
     // your code goes here
    }

    public String getAuthor() {
    	// your code goes here
        return author;
    }

    @Override
    public void displayInfo() {
    	// your code goes here
    }
}
