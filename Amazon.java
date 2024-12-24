class Amazon{
	
	public static void main(String [] shopping){
		System.out.println("main statred");
	String ref =signin("xyz@gmail.com",85676541);
	System.out.println(ref);
	boolean ref2=registration("sujith","gouda","25/08/1997","male","27");
	System.out.println(ref2);
	System.out.println("main ended");
}


   public static String signin(String email  ,long phoneNumber){
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
   public static boolean registration(String firstName,String lastName,String dob,String gender,String age){
	   System.out.println("user  firstName:"+firstName);
	   System.out.println("user  lastName:"+lastName);
	   System.out.println("user  dob:"+dob);
	   System.out.println("user gender:"+gender);
	   System.out.println("user age:"+age);
	   return true;
   }
}