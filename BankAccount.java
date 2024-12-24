class BankAccount{
	
	public static void main(String [] args){
		
		boolean ref =userAccountDetails("lasya", "rai", "23/09/2000",9980572412l, 347823190865l,"pf5690mr35"," 62nd cross 5th block rajajinagar bangalore karnataka",
		                                 false,"2nd link road parvathi nagar ballari karnataka 583101","savings account","ashok","asha","vijay nagar","female");
		System.out.println("Is userAccountDetails="+ref);
		
	}
	
	public static boolean userAccountDetails(String firstName,String lastName,String dob,long phoneNumber,
											long adharNumber,String panNumber,String currentAddress,boolean  currentAddressSameAsPermanentAddress,
											String permanentAddress,String accountType,String fatherName,String motherName,String branch,String gender){
												
		System.out.println("the user firstName is:"+firstName);
		System.out.println("the user lastName is:"+lastName);
		System.out.println("the user dob is:"+dob);
		System.out.println("the user phoneNumber is:"+phoneNumber);
		System.out.println("the user adharNumber is:"+adharNumber);
		System.out.println("the user panNumber is:"+panNumber);
		System.out.println("the user currentAddress is:"+currentAddress);
		System.out.println("the user is currentAddress same as permanentAddress is:"+ currentAddressSameAsPermanentAddress);
		System.out.println("the user permanentAddress is:"+permanentAddress);
		System.out.println("the user accountType is:"+accountType);
		System.out.println("the user fatherName is:"+fatherName);
		System.out.println("the user motherName is:"+motherName);
		System.out.println("the user branch is:"+branch);
		System.out.println("the user gender is:"+gender);
		return true;
		
	}
}