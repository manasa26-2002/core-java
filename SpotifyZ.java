import java.util.Arrays;
class SpotifyZ{
static String zoners[] = {null, null, null, null, null, null, null, null};
static int index;
public static boolean addZoners(String zoner){
System.out.println("addZoners started");
boolean isZonerAdded = false;
if(zoners != null){
System.out.println("adding zoners will proceed");
zoners[index] = zoner;
index++;
}else{
System.out.println("addZoners is null");
}
System.out.println("addZoners ended");
return isZonerAdded;
}
public static void getZoner(){
System.out.println("getZoner started");
System.out.println("list of zoners are:");
for(String zoner: zoners){
System.out.println(zoner);
}
}
public static boolean updateZoner(String newZoner ,  String oldZoner){
	System.out.println("updateZoner started");
	boolean isZonerUpdated = false;
	for(int song =0; song<zoners.length; song++){
		if(zoners[song] == oldZoner){
			zoners[song] = newZoner;
			isZonerUpdated = true;
			break;
		}
	}
	System.out.println("updateZoner ended");
	return isZonerUpdated;
}

public static boolean deleteZonerByName(String zonerName){
		System.out.println("deleteZonerByName started");
		boolean isZonerDeleted = false;
		int  index , newIndex;
		for( index=0,newIndex =0; index<zoners.length; index++) {
		String existingZonerName = zoners[index];
       if(existingZonerName != zonerName){
		   zoners[newIndex++] =existingZonerName;
		   
	   }else{
		isZonerDeleted = true;
	}		
	}
	zoners = Arrays.copyOf(zoners , newIndex);
	return isZonerDeleted;
}
}