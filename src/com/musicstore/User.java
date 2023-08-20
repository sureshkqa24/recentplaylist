package com.musicstore;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class User {
	
	String name;
	List<String> recentSongs = new LinkedList<String>(Arrays.asList(new String[3]));
	
	public User(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public List<String> getRecentSongsList()
	{
		return recentSongs.stream().filter(element -> (element !=null)).toList();
	}
	
	public void playSong(Song song)
	{
		if(recentSongs.size()==3)
		{
			recentSongs.remove(0);	
		}
		recentSongs.add(song.getSongName());
		
	}

}
