class FanTest{
	boolean isConnected;
	String maxSpeed;
	String minSpeed;
	String currentSpeed;
		 public  void main(String [] args){
	 System.out.println("main started");
	 
    boolean ref = isConnected ();
    System.out.println("isConnected :"+ref);
	
         ref = isConnected ();
    System.out.println("isConnected :"+ref);

	           increaseSpeed();
			   increaseSpeed();

			   decreaseSpeed();
			   decreaseSpeed();
			   
			   
	System.out.println("main ended");		   
	 }
	public boolean isConnected(){
		System.out.println("onOrOff started");
		boolean isConnected=false;
		isConnected = !isConnected ? true : false ; 
		System.out.println("onOrOff ended");
		return isConnected;
	}
	public void increaseSpeed(){
		   System.out.println("start of increaseSpeed");
		   if(isConnected == true){
			   if(currentSpeed < maxSpeed){
				   currentSpeed = currentSpeed + 1;
				   System.out.println("the currentSpeed :"+currentSpeed);
			   }
		   }else{
			   System.out.println("turnOn fan");
		   }
	   }
   public void decreaseSpeed(){
		   System.out.println("start of deccreaseSpeed");
		   if(isConnected == true){
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