package com.driver;

public class Music extends MediaItem {
	 private final String artist;

	    public Music(String title, int year, String artist) {
	        super(title, year);
	        this.artist = artist;
	     // your code goes here
	    }

	    public String getArtist() {
	    	// your code goes here
	        return artist;
	    }

	    @Override
	    public void displayInfo() {
	    	// your code goes here
	    }
}
