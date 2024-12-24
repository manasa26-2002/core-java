import java.util.Arrays;
class  PhonePe{
	
	static String insurances[] = {null , null , null , null , null};
	static  int index;
	
	public static boolean addInsurance(String insurance){
		System.out.println("addInsurance started");
		boolean isInsuranceAdded = false;
		if(insurance !=null){
			System.out.println("insurance proceed ");
			insurances[index] = insurance;
			index++;
			isInsuranceAdded = true;
		}else{
			System.out.println("insurance is null");
		}
		System.out.println("addInsurance ended");
		return isInsuranceAdded;
		
	}
	public static void getInsurance(){
		System.out.println("getInsurance started");
		System.out.println("list of insurance are");
		for(String insurance : insurances){
			System.out.println(insurance);
		}
	}
	
	public static boolean updateInsuranceByName(String newInsuranceName , String oldInsuranceName){
		boolean isInsuranceUpdated = false;
		for(int start=0; start<insurances.length;start++){
			if(insurances[start]==oldInsuranceName){
				insurances[start] = newInsuranceName;
				isInsuranceUpdated = true;
				break;
			}
		}
		
		if(isInsuranceUpdated == false) System.out.println(oldInsuranceName + "not found");
		return isInsuranceUpdated;
	}
	
	public static boolean deleteInsuranceByName(String insuranceName){
		System.out.println("deleteInsuranceByName started");
		boolean isInsuranceDeleted = false;
		int index , newIndex;
		for(index =0, newIndex=0; index<insurances.length; index++){
			String existingInsuranceName = insurances[index];
			if(existingInsuranceName !=insuranceName){
				insurances[newIndex++] =existingInsuranceName;
			}else{
				isInsuranceDeleted = true;
			}
		}
		insurances = Arrays.copyOf(insurances , newIndex);
		return isInsuranceDeleted;
	}
	
}