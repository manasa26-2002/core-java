class Netflix{
	
	public static void main(String [] socialMedia){
		System.out.println("main statred");
	String ref =login("mansa@gmail.com","mansa@123",90765143);
	System.out.println(ref);
	boolean ref3=register("sujith","gouda","25/08/1997","male","27");
	System.out.println(ref3);
	System.out.println("main ended");
}


   public static String login(String email , String password,long phonenumber){
	   System.out.println("login statred");
     String message="login successfull";
	 if(email !=null || password !=null ||phonenumber>0){
		 System.out.println("email/password/phonenumber is checked");
		 message = "login successfull";
	 }
	 else{
		 System.out.println("email/password/phonenumber is invalid");
		 message="login unsuccessfull";
	 }
	 
     System.out.println("login ended");
	 return message;
}	 
    public static boolean register(String firstName,String lastName,String dob,String gender,String age){
	   System.out.println("user  firstName:"+firstName);
	   System.out.println("user  lastName:"+lastName);
	   System.out.println("user  dob:"+dob);
	   System.out.println("user gender:"+gender);
	   System.out.println("user age:"+age);
	   return true;
   }
}