import java.util.Arrays;
class OlympicZ{
static String SportNames[] = {null , null , null, null, null, null, null, null, null, null, null, null, null, null, null };
	static int index;
	
	public static boolean addSportNames(String SportName){
		
		System.out.println("add sportName started");
		boolean isSportNameAdded = false;
		if(SportName !=null){
		System.out.println("sport name proceed");
	    SportNames[index] = SportName;
		index++;
		isSportNameAdded = true;
	}else{
		System.out.println("sportName is null");
	}
	System.out.println("addSportNames ended");
	return isSportNameAdded;
	}
	public static void getSportName(){
		System.out.println("getSportNames started");
		System.out.println("list of Sports are:");
		for(String SportName : SportNames){
			System.out.println(SportName);
		}
	}
	public static boolean updateSportName(String newSportName , String oldSportName){
		System.out.println("updateSportName started");
		boolean isSportNameUpdated = false;
		for(int bat=0; bat<SportNames.length; bat++){
			if(SportNames[bat] == oldSportName){
				SportNames[bat] = newSportName;
				isSportNameUpdated = true;
				break;
			}
		}
		System.out.println("updateSportName ended");
		return isSportNameUpdated;
	}
     public static boolean deleteSportByName(String spoName){
		System.out.println("deleteSportByName started");
		boolean isSportDeleted = false;
		int  index , newIndex;
		for( index=0,newIndex =0; index<SportNames.length; index++) {
		String existingSportName = SportNames[index];
       if(existingSportName != spoName){
		   SportNames[newIndex++] =existingSportName;
		   
	   }else{
		isSportDeleted = true;
	}		
	}
	SportNames = Arrays.copyOf(SportNames , newIndex);
	return isSportDeleted;
}
}