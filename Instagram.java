class Instagram{
	
	public static void main(String [] reels){
		System.out.println("main statred");
	String ref =signin("xyz@gmail.com",8885676756l);
	System.out.println(ref);
	boolean ref1=register("monika","moni","mona@!45");
	System.out.println(ref1);
	String ref2= logIn("varsha@gmail.com","varsh!@67",9821346702l);
	System.out.println(ref2);
	System.out.println("main ended");
}


   public static String signin(String email ,long phoneNumber){
	   System.out.println("signin statred");
     String message="signin successfull";
	 if(email !=null || phoneNumber>0){
		 System.out.println("email/phoneNumber is checked");
		 message = "signin successfull";
	 }
	 else{
		 System.out.println("email/phoneNumber is invalid");
		 message="signin unsuccessfull";
	 }
	 
     System.out.println("signin ended");
	 return message;
}	 
   public static boolean register(String firstName,String userName,String passWord){
	   System.out.println("user register firstName:"+firstName);
	   System.out.println("user register userName:"+userName);
	   System.out.println("user register passWord:"+passWord);
	   return true;
   }
   public static String logIn(String email , String passWord , long phoneNumber){
	   System.out.println("logIn started");
	   String message = "logIn successfull";
	   if(email !=null || passWord !=null || phoneNumber>0){
		   System.out.println("email/passWord/phoneNumber is checked");
		   message = "logIn successfull";
	   }
	   else{
		   System.out.println("email/passWord/phoneNumber is invalid");
		   message = "logIn unsuccessfull";
	   }
	   System.out.println("logIn ended");
	   return message;
   }
}