class PassportSeva1{
	public static void main(String [] args){
		
		boolean ref=userRegistration("PO","bengaluru","mansa","nelludi","26/02/2002","nsmansa12@gmail.com" ,false,
									  "mansa123","mans@!45","mans@!45","favourite color","black","fy23g7");
		System.out.println("Is user registered="+ref);
		
	}
	public static boolean userRegistration(String cpvLocation,String dcdrLocation,String userName,String surName,String dob,String email,boolean emailloginSame,
											String loginId,String password,String confirmPassword,String hintQuestion,String hintAnswer,String captcha){
		System.out.println("the CPVlocation is:"+ cpvLocation);
		System.out.println("the DCDR location is:"+ dcdrLocation);
		System.out.println("the username is :"+userName);
		System.out.println("the surname is:"+surName);
		System.out.println("the user email is:"+email);
		System.out.println("the user emailloginSame :"+emailloginSame);
		System.out.println("the user loginId is:"+loginId);
		System.out.println("the user password is:"+password);
		System.out.println("the user confirmPassword is:"+confirmPassword);
		System.out.println("the user hintQuestion is:"+hintQuestion);
		System.out.println("the user hintAnswer is :"+hintAnswer);
		System.out.println("the user captcha is:"+captcha);
	return true;	
	}
}