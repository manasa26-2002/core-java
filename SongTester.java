class SongTester{
	public static void main(String [] args){
	System.out.println("main started");
	boolean isSongAdded = Song.addSongs("hey rama");
	System.out.println("isSongAdded:" +isSongAdded);
	
	isSongAdded = Song.addSongs("pasoori");
	System.out.println("isSongAdded:" +isSongAdded);
	
	isSongAdded = Song.addSongs("cheap thrills");
	System.out.println("isSongAdded:" +isSongAdded);
	
	isSongAdded = Song.addSongs("kolaveri di");
	System.out.println("isSongAdded:" +isSongAdded);
	
	isSongAdded = Song.addSongs("allok");
	System.out.println("isSongAdded:" +isSongAdded);
	
	Song.getSong();
	
	boolean isSongUpdated = Song.updateSong("o priya" , "cheap thrills");
	System.out.println("isSongUpdated:" +isSongUpdated);
	
	Song.getSong();
	
	boolean isDeleted = Song.deleteSongByName("kolaveri di");
	
	Song.getSong();
	}
}