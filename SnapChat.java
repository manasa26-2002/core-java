class SnapChat{
	
	public static void main(String [] streeks){
		System.out.println("main statred");
	String ref =login("asha@gmail.com","ash@567");
	System.out.println(ref);
	boolean ref2=register("madhu","maddy","31/05/2008",8097352164l);
	System.out.println(ref2);
	System.out.println("main ended");
}
String message="login successfull";
	 if(email !=null || password !=null){
		 System.out.println("email/password is checked");
		 message = "login successfull";
	 }
	 else{
		 System.out.println("email/password is invalid");
		 message="login unsuccessfull";
	 }

     
		 System.out.println("email/password is invalid");
		 message="login unsuccessfull";
	 }
	 
     System.out.println("login ended");
	 return message;
}	 
      public static boolean register(String firstName,String userName,String dob,long phoneNumber){
	   System.out.println("user  firstName:"+firstName);
	   System.out.println("user  userName:"+userName);
	   System.out.println("user  passWord:"+dob);
	   System.out.println("user phoneNumber:"+phoneNumber);
	   return true;
   }
}