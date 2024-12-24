import java.util.Arrays;
class Galaxy{
	static String PlanetNames[] = {null, null, null, null, null, null, null, null};
	static int index;
	
	public static boolean addPlanetNames(String PlanetName){
		System.out.println("addPlanetNames started");
		boolean isPlanetNameAdded = false;
		if(PlanetName !=null){
			System.out.println("addPlanetNames will proceed");
				PlanetNames[index] = PlanetName;
				index++;
		}else{
			System.out.println("planet name is null");
		}
		System.out.println("addPlanetNames ended");
		return isPlanetNameAdded;
	}
	public static void getPlanetNames(){
		System.out.println("getPlanetNames started");
		System.out.println("planet names are:");
		for(String PlanetName : PlanetNames){
			System.out.println(PlanetName);
		}
	}
	
	public static boolean updatePlanetName(String newPlanetName , String oldPlanetName){
		System.out.println("updatePlanetName started");
		boolean isPlanetNameUpdated = false;
		for(int stars=0; stars<PlanetNames.length; stars++){
			if(PlanetNames[stars] == oldPlanetName){
				PlanetNames[stars] = newPlanetName;
				isPlanetNameUpdated = true;
				break;
			}
		}

		System.out.println("updatePlanetName ended");
		return isPlanetNameUpdated;
	}
	
	public static boolean deletePlanetByName(String planetName){
		System.out.println("deletePlanetByName started");
		boolean isPlanetDeleted = false;
		int  index , newIndex;
		for( index=0,newIndex =0; index<PlanetNames.length; index++) {
		String existingPlanetName = PlanetNames[index];
       if(existingPlanetName != planetName){
		   PlanetNames[newIndex++] =existingPlanetName;
		   
	   }else{
		isPlanetDeleted = true;
	}		
	}
	PlanetNames = Arrays.copyOf(PlanetNames , newIndex);
	return isPlanetDeleted;
}
}