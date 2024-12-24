import java.util.Arrays;
class TechPark{
static String companyNames[] = {null , null , null, null, null, null, null, null, null, null, null, null, null, null, null };
	static int index;
	
	public static boolean addCompanyNames(String companyName){
		
		System.out.println("add companyName started");
		boolean isCompanyNameAdded = false;
		if(companyName !=null){
		System.out.println("company name proceed");
	    companyNames[index] = companyName;
		index++;
		isCompanyNameAdded = true;
	}else{
		System.out.println("companyName is null");
	}
	System.out.println("addCompanyNames ended");
	return isCompanyNameAdded;
	}
	public static void getCompanyName(){
		System.out.println("getCompanyNames started");
		System.out.println("list of companys are:");
		for(String companyName : companyNames){
			System.out.println(companyName);
		}
	}
	public static boolean updateCompanyName(String newCompanyName , String oldCompanyName){
		System.out.println("update company started");
		boolean isCompanyNameUpdated = false;
		for(int ref = 0; ref<companyNames.length; ref++){
			if(companyNames[ref] == oldCompanyName){
				companyNames[ref] = newCompanyName;
				isCompanyNameUpdated = true;
				break;
			}
		}
		return isCompanyNameUpdated;
	}
    public static boolean deleteCompanyByName(String comName){
		System.out.println("deleteCompanyByName started");
		boolean isCompanyDeleted = false;
		int  index , newIndex;
		for( index=0,newIndex =0; index<companyNames.length; index++) {
		String existingCompanyName = companyNames[index];
       if(existingCompanyName != comName){
		   companyNames[newIndex++] =existingCompanyName;
		   
	   }else{
		isCompanyDeleted = true;
	}		
	}
	companyNames = Arrays.copyOf(companyNames , newIndex);
	return isCompanyDeleted;
}
}