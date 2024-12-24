class FaceBook{
	
	public static void main(String [] socialMedia){
		System.out.println("main statred");
	String ref =login("mansa@gmail.com","mansa@123");
	System.out.println(ref);
	boolean ref1=userRegistration("asha","hm","female","26/09/2001");
	System.out.println(ref1);
	boolean ref2=logIn("maddy@!34",9834210723l , "mad@56");
	System.out.println(ref2);
	System.out.println("main ended");
}


   public static String login(String email , String password){
	   System.out.println("login statred");
     String message="login successfull";
	 if(email !=null || password !=null){
		 System.out.println("email/password is checked");
		 message = "login successfull";
	 }
	 else{
		 System.out.println("email/password is invalid");
		 message="login unsuccessfull";
	 }
	 
     System.out.println("login ended");
	 return message;
}	
    public static boolean userRegistration(String fristName,String surName,String gender,String dob){
		System.out.println("userRegistration fristName:"+fristName);
		System.out.println("userRegistration surName:"+surName);
		System.out.println("userRegistration gender:"+gender);
		System.out.println("userRegistration dob:"+dob);
		return true;
}

   public static boolean logIn(String email , long phoneNumber , String password){
	   System.out.println("login started");
	   String message = "login successfull";
   if(email !=null || phoneNumber>0 || password !=null){
	   System.out.println("email/phoneNumber/password is checked");
	   message = "login successfull";
	   
   }else{
	   System.out.println("email/phoneNumber/password is invalid");
	   message ="login unsuccessfull";
   }
   System.out.println("login ended");
   return true;
   }
} 
     
