package com.driver;

import java.util.ArrayList;
import java.util.Scanner;
public class MediaLibrary {
	private ArrayList<MediaItem> mediaItems;

    public MediaLibrary() {
    	// your code goes here
    }

    public void addMediaItem(MediaItem item) {
    	// your code goes here
    }

    public int getMediaItems(){
    	// your code goes here
        return mediaItems.size();
    }
    public void displayMediaItems() {
    	// your code goes here
    }

    public static void main(String[] args) {
        MediaLibrary library = new MediaLibrary();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nSelect the media type to add:");
            System.out.println("1. Book");
            System.out.println("2. Music");
            System.out.println("3. Movie");
            System.out.println("4. Display Media Items");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            if (choice == 5) {
                break;
            }
            if(choice == 4) {
                library.displayMediaItems();
                break;
            }

            System.out.print("Enter title: ");
            String title = scanner.nextLine();
            System.out.print("Enter year: ");
            int year = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();
                    library.addMediaItem(new Book(title, year, author));
                    break;
                case 2:
                    System.out.print("Enter artist: ");
                    String artist = scanner.nextLine();
                    library.addMediaItem(new Music(title, year, artist));
                    break;
                case 3:
                    System.out.print("Enter director: ");
                    String director = scanner.nextLine();
                    library.addMediaItem(new Movie(title, year, director));
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
