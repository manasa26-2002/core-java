class Fridge{
      

		 static boolean isturnOn;
		 static int currentTemp;
		 static int maxTemp = 6;
		 static int minTemp ;
		 
	 public static void main(String [] args){
	 System.out.println("main started");
	 
    boolean anything = onOrOff ();
    System.out.println("isturnOn :"+anything);
	
         anything = onOrOff ();
    System.out.println("isturnOn :"+anything);
	
	 anything = onOrOff ();
    System.out.println("isturnOn :"+anything);
	
	
	      
	           increaseTemp();
			   increaseTemp();
			   increaseTemp();
			   increaseTemp();
			   
			   deccreaseTemp();
			   deccreaseTemp();
			   deccreaseTemp();
			   
	System.out.println("main ended");		   
	 }
	 
	 public static boolean onOrOff(){
		System.out.println("start of turnOn");
		isturnOn = !isturnOn ? true : false ;
			System.out.println("end of onOrOff");
			return isturnOn;
			
	 }		
			
       public static void increaseTemp(){
		   System.out.println("start of increaseTemp");
		   if(isturnOn == true){
			   if(currentTemp < maxTemp){
				   currentTemp = currentTemp + 1;
				   System.out.println("the currentTemp :"+currentTemp);
			   }else{
				   System.out.println("maxTemp reached");
			   }
		   }else{
			   System.out.println("turnOn fridge");
		   }
	   }
      
	  public static void deccreaseTemp(){
		   System.out.println("start of deccreaseTemp");
		   if(isturnOn == true){
			   if(currentTemp > minTemp){
				   currentTemp = currentTemp - 1;
				   System.out.println("the currentTemp :"+currentTemp);
			   }else{
				   System.out.println("minTemp reached");
			   }
		   }else{
			   System.out.println("turnOn fridge");
		   }
	   }

       
}