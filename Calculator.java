class Calculator  {



      public static void main(String[] calculate){
	  System.out.println("main started");
	  
	  // invoke 
	   add(89 ,74);
       add(79,103);	
	   
	     subtract(56, 4);
		 subtract(109,45);
		 
		 multiply(15,3);
		 multiply(7,2);
		 
		 division(24,2);
		 division(72,9);
		 
		 modulus(5,2);
		 modulus(27,6);

   // statement
	    System.out.println("main ended");
	  
	  }

 
  // method 
        public   static  void  add(int dev , int singh){
		      int devSingh      = dev + singh ; 
			  System.out.println(devSingh);
}



	  public static void subtract(int num1 , int num2)
		   {
             int total=   num1 - num2;
             System.out.println(total);
		   }
       public static void multiply(int num3 , int num4)
	   {
		   int product= num3 *num4;
		   System.out.println(product);
	   }
	   public static void division(int num5 , int num6)
	   {
		   int quo=num5/num6;
		   System.out.println(quo);
	   }
	   public static void modulus(int num7 , int num9)
	   {
		   int sum=num7 | num9;
		   System.out.println(sum);
	   }
}	   
	   //multipl
	   
	   //division
	   
	   //mod




