class PassportSeva{
	
	public static void main(String [] pass){
		System.out.println("main statred");
	String ref =login("lasya129","las@675");
	System.out.println(ref);
	System.out.println("main ended");
}


   public static String login(String loginId , String password){
	   System.out.println("login statred");
     String message="login successfull";
	 if(loginId !=null || password !=null){
		 System.out.println("loginId/password is checked");
		 message = "login successfull";
	 }
	 else{
		 System.out.println("loginId/password is invalid");
		 message="login unsuccessfull";
	 }
	 
     System.out.println("login ended");
	 return message;
}	 

}