class FanTest3{
     
		 boolean isturnOn;
		  int currentSpeed;
		  int maxSpeed = 1;
		  int minSpeed ;
		 
	 public static void main(String [] args){
	 System.out.println("main started");
	 
    boolean ref = onOrOff ();
    System.out.println("isturnOn :"+ref);
	
         ref = onOrOff ();
    System.out.println("isturnOn :"+ref);
	
	 ref = onOrOff ();
    System.out.println("isturnOn :"+ref);
	      
	           increaseSpeed();
			   increaseSpeed();
			   increaseSpeed();
			   increaseSpeed();
			   
			   
			   decreaseSpeed();
			   decreaseSpeed();
			   decreaseSpeed();
			   
	System.out.println("main ended");		   
	 }
	 
	 public static  boolean onOrOff(){
		System.out.println("start of turnOn");
		isturnOn = !isturnOn ? true : false ;   
			System.out.println("end of onOrOff");
			return isturnOn;
			
	 }		
			
       public static void increaseSpeed(){
		   System.out.println("start of increaseSpeed");
		   if(isturnOn == true){
			   if(currentSpeed < maxSpeed){
				   currentSpeed = currentSpeed + 1;
				   System.out.println("the currentSpeed :"+currentSpeed);
			   }else{
				   System.out.println("maxSpeed reached");
			   }
		   }else{
			   System.out.println("turnOn fan");
		   }
	   }
      
	  public static void decreaseSpeed(){
		   System.out.println("start of deccreaseSpeed");
		   if(isturnOn == true){
			   if(currentSpeed > minSpeed){
				   currentSpeed = currentSpeed - 1;
				   System.out.println("the currentSpeed :"+currentSpeed);
			   }else{
				   System.out.println("minSpeed reached");
			   }
		   }else{
			   System.out.println("turnOn fan");
		   }
	   }

       
}