package com.driver;

public class Music extends MediaItem {
	private final String artist;

	public Music(String title, int year, String artist) {
		super(title, year);
		this.artist = artist;
	}

	public String getArtist() {
		return artist;
	}

	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Artist: " + artist);
	}
}