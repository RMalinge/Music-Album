/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MalingeT;

import MalingeT.MusicAlbum;

/**
 *
 * @author Siqhamo Malinge
 */
public class MusicAlbumApplication extends MusicAlbum {
    public static void main(String[] args)
	{
		MusicAlbum obj = new MusicAlbum();

		//REGISTER ALBUM
		obj.set("Tamia", "Beautiful Surprise", 11);
		//Songs
		obj.setTrackNameAndMinutes("Lose my mind", "04:00");
		obj.setTrackNameAndMinutes("Give me you", "03:34");
		obj.setTrackNameAndMinutes("It's not fair", "03:52");
		obj.setTrackNameAndMinutes("Believe in love", "03:30");
		obj.setTrackNameAndMinutes("Beautiful surprise", "03:36");
		obj.setTrackNameAndMinutes("Is it over yet", "03:58");
		obj.setTrackNameAndMinutes("Love I'm yours", "05:28");
		obj.setTrackNameAndMinutes("Him", "04:04");
		obj.setTrackNameAndMinutes("Still love you", "03:21");
		obj.setTrackNameAndMinutes("Because of you", "03:21");
		obj.setTrackNameAndMinutes("Still", "04:07");
		
		

		//Display Album
		System.out.println("Artist: " + obj.getArtist() + "\n" + "Album Name: " + obj.getAlbumTitle() + "\n" + "Number of songs: " + obj.getNumberOfTracks());
		obj.printTrackNameAndMinutes();

		obj.clearMap();

		

		//REGISTER ALBUM
		obj.set("Gyakie", "Seed-EP", 5);
		//Songs
		obj.setTrackNameAndMinutes("Joy and happiness(Intro)", "01:16");
		obj.setTrackNameAndMinutes("Forever", "03:17");
		obj.setTrackNameAndMinutes("Whine", "02:49");
		obj.setTrackNameAndMinutes("Vacation", "03:10");
		obj.setTrackNameAndMinutes("The journey(Outro)", "02:16");
		
		

		//Display Album
		System.out.println("Artist: " + obj.getArtist() + "\n" + "Album Name: " + obj.getAlbumTitle() + "\n" + "Number of songs: " + obj.getNumberOfTracks());
		obj.printTrackNameAndMinutes();

		obj.clearMap();

		//REGISTER ALBUM
		obj.set("J. Cole", "The Off-Season", 12);
		//Songs
		obj.setTrackNameAndMinutes("98 South", "03:16");
		obj.setTrackNameAndMinutes("Amari", "02:28");
		obj.setTrackNameAndMinutes("My Life", "03:38");
		obj.setTrackNameAndMinutes("Applying Pressure", "02:57");
		obj.setTrackNameAndMinutes("Punchin' the Clock", "01:57");
		obj.setTrackNameAndMinutes("100 Mil'", "02:43");
		obj.setTrackNameAndMinutes("Pride Is the Devil", "03:38");
		obj.setTrackNameAndMinutes("Let Go My Hand", "04:26");
		obj.setTrackNameAndMinutes("Interlude", "02:13");
		obj.setTrackNameAndMinutes("The Climb Back", "05:06");
		obj.setTrackNameAndMinutes("Close", "02:48");
		obj.setTrackNameAndMinutes("Hunger on Hillside", "03:58");
		
		//Display Album
		System.out.println("Artist: " + obj.getArtist() + "\n" + "Album Name: " + obj.getAlbumTitle() + "\n" + "Number of songs: " + obj.getNumberOfTracks());
		obj.printTrackNameAndMinutes();

		obj.clearMap();
	}
    
}
