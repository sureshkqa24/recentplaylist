package com.musicstore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Playlist {

	static List<Song> songLists = new ArrayList<>();
	static Map<String, List<String>> usersongsMap = new HashMap<>();

	public static void main(String[] args) {

		User user1 = new User("suresh");
		User user2 = new User("priyanka");
		User user3 = new User("seema");
		User user4 = new User("uddhav");

		Song song1 = new Song("Tere naina");
		Song song2 = new Song("Khalibali");
		Song song3 = new Song("Udja Kale Kawan");
		Song song4 = new Song("Bella chao");
		Song song5 = new Song("Maa tuze salam");

		user1.playSong(song1);
		user1.playSong(song2);
		user1.playSong(song3);
		user1.playSong(song4);

		user2.playSong(song1);
		user2.playSong(song4);

		user3.playSong(song3);
		user3.playSong(song4);

		user4.playSong(song5);
		user4.playSong(song4);
		user4.playSong(song3);
		user4.playSong(song2);
		user4.playSong(song1);

		usersongsMap.put(user1.getName(), user1.getRecentSongsList());
		usersongsMap.put(user2.getName(), user2.getRecentSongsList());
		usersongsMap.put(user3.getName(), user3.getRecentSongsList());
		usersongsMap.put(user4.getName(), user4.getRecentSongsList());

		Scanner sc = new Scanner(System.in);
		
		System.out.println("******** Welcome to Suresh's Musical Store*******");
		System.out.println("Please select one of the option below");
		System.out.println("1 - get Recent playlist by user name");
		System.out.println("2 - Exit");
		int choice = sc.nextInt();

		while(choice!=2)
		{

			switch (choice) {
			case 1: 
			{
				System.out.println("Enter the user name to see his/her recentsongList");
				String uname = sc.next();
				if(usersongsMap.containsKey(uname))
				{
					System.out.println("recentSongList of user "+uname+" is "+usersongsMap.get(uname));
				}
				else
				{
					System.out.println("Please enter valid user name");
				}
				
				break;
			}
			default: 
			{
				System.out.println("This is invalid option please Enter correct option");
			}	 

			}
			System.out.println("Please select one of the option below");
			System.out.println("1 - get Recent playlist by user name");
			System.out.println("2 - Exit");
			choice = sc.nextInt();
		}
		
		sc.close();
	}

}
