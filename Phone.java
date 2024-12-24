import java.util.Arrays;

class Phone{
	
	static String applications[] ={null,null,null,null,null};
	static int index;
	public static boolean addApplication(String application){
		
		System.out.println("addApplication started");
		boolean isApplicationAdded = false;
		if(application !=null){
			System.out.println("application contain value..proceed");
			applications[index] = application;
			index++;
			isApplicationAdded = true;
		}else{
			
			System.out.println("application is null");
		}
		System.out.println("addApplication ended");
		return isApplicationAdded;
	}
	public static void getApplication(){
		System.out.println("getApplication started");
		System.out.println("list of application are");
		for(String application : applications){
			System.out.println(application);
		}
		System.out.println("getApplication ended");
	}
	
	public static boolean updateApplicationByName(String newAppName , String oldAppName){
		boolean isAppUpdated = false;
		for(int start=0; start<applications.length; start++){    // looping
			if(applications[start] == oldAppName){  // validation
				applications[start] = newAppName;
				isAppUpdated = true;
				break;
			}
		}
		
		if(isAppUpdated == false) System.out.println(oldAppName + "not found");
		
		return isAppUpdated;
	}
	public static boolean deleteApplicationByName(String appName){
		System.out.println("deleteApplicationByName started");
		boolean isAppDeleted = false;
		int  index , newIndex;
		for( index=0,newIndex =0; index<applications.length; index++) {
		String existingAppName = applications[index];
       if(existingAppName != appName){
		   applications[newIndex++] =existingAppName;
		   
	   }else{
		isAppDeleted = true;
	}		
	}
	applications = Arrays.copyOf(applications , newIndex);
	return isAppDeleted;
}

// public static void getNewApplication(){
		// System.out.println("getNewApplication started");
		// System.out.println("list of application are");
		// for(String application : newApplications){
			// System.out.println(application);
		// }
		// System.out.println("getNewApplication ended");
	// }
}