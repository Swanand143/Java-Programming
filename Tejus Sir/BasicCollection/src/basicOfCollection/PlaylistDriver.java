package basicOfCollection;

public class PlaylistDriver {
	
	public static void main(String[] args) {
		
		Playlist p1 = new Playlist("Punjabi Song", 6);
		
		p1.addSong("Lahore", "Guru Randhawa", "3:45", "Guru Randhawa", "Single");
		p1.addSong("High Rated Gabru", "Guru Randhawa", "3:30", "Guru Randhawa", "Nawabzaade");
		p1.addSong("Desi Kalakaar", "Yo Yo Honey Singh", "4:20", "Honey Singh", "Desi Kalakaar");
		p1.addSong("Brown Rang", "Yo Yo Honey Singh", "3:50", "Honey Singh", "International Villager");
		p1.addSong("DJ Waley Babu", "Badshah", "3:15", "Badshah", "Single");
		p1.addSong("Genda Phool", "Badshah", "3:35", "Badshah", "Single");
		
		//p1.removeSong("Genda Phool", "Single");
		
		//p1.nextSong();
		
		//p1.playNext("Desi Kalakaar", "Desi Kalakaar");
		
		p1.shuffle();
		
		p1.showPlaylist();
	}

}
