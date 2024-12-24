class 	InductionStove{
	static boolean isOn ;
	static int currentTemp;
	static int maximumTemp=10;
	static int minimumTemp;
	
	public static void main(String [] args){
		System.out.println("main started");
    boolean anything = onOrOff ();
    System.out.println("is stove on:"+anything);
	
         anything = onOrOff ();
    System.out.println("is stove on:"+anything);
	      
	           increaseTemp();
			   increaseTemp();
			   increaseTemp();
			   increaseTemp();
			   increaseTemp();
			   increaseTemp();
			   
     System.out.println("main ended");

		
	}
	public static boolean onOrOff(){
		System.out.println("start of turnOn");
		isOn = !isOn ? true : false ;   // ternary operation
			System.out.println("end of onOrOff");
			return isOn;
	}
	    public static void increaseTemp(){
			System.out.println("start of increaseTemp method");
			if(isOn == true){
				if(currentTemp < maximumTemp){
					currentTemp = currentTemp + 1;
					System.out.println("currentTemp is"+currentTemp);
				}else{
					System.out.println("maximum temp reached");
				}
					
				
				
			}else{
				System.out.println("turnOn stove");
			}
			
			
		}
	
	
}	
