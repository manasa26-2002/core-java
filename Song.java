import java.util.Arrays;
class Song{
	static String songs[] = {null , null , null, null, null};
	static int index;
	public static boolean addSongs(String song){
		System.out.println("add songs started");
		boolean isSongAdded = false;
		if(songs !=null){
			System.out.println("add songs will proceed...");
			songs[index++]=song;
			
		}else{
			System.out.println("add song is null");
		}
		System.out.println("add song ended");
		return isSongAdded;
	}
	public static void getSong(){
		System.out.println("get started");
		System.out.println("list of songs are:");
		for(String song : songs){
			System.out.println(song);
		}
	}
	public static boolean updateSong(String newSong , String oldSong){
		System.out.println("updateSong started");
		boolean isSongUpdated = false;
		for(int sing=0; sing<songs.length;sing++){
			if(songs[sing]==oldSong){
				songs[sing]=newSong;
			isSongUpdated = true;
			break;
		}
	}
	  System.out.println("updateSong ended");
	  return isSongUpdated;
}
  public static boolean deleteSongByName(String sonName){
		System.out.println("deleteSongByName started");
		boolean isSongDeleted = false;
		int  index , newIndex;
		for( index=0,newIndex =0; index<songs.length; index++) {
		String existingSongName = songs[index];
       if(existingSongName != sonName){
		   songs[newIndex++] =existingSongName;
		   
	   }else{
		isSongDeleted = true;
	}		
	}
	songs = Arrays.copyOf(songs , newIndex);
	return isSongDeleted;
}
}