class Tv{
	static boolean isOn ;
	static int currentVolume;
	static int maximumVolume=5;
	static int minimumVolume;
	
	public static void main(String [] args){
		System.out.println("main started");
    boolean anything = onOrOff ();
    System.out.println("is tv on:"+anything);
	
         anything = onOrOff ();
    System.out.println("is tv on:"+anything);
	
	         anything = onOrOff ();
    System.out.println("is tv on:"+anything);
	      
	           increaseVolume();
			   increaseVolume();
			   increaseVolume();
			   increaseVolume();
			   increaseVolume();
			   increaseVolume();

     System.out.println("main ended");

		
	}
	public static boolean onOrOff(){
		System.out.println("start of turnOn");
		isOn = !isOn ? true : false ;   
			System.out.println("end of onOrOff");
			return isOn;
	}
	    public static void increaseVolume(){
			System.out.println("start of increaseVolume method");
			if(isOn){
				if(currentVolume < maximumVolume){
					currentVolume = currentVolume + 1;
					System.out.println("currentVolume is"+currentVolume);
					
				}else{
					System.out.println("maximum volume reached");
				}
					
			}
				
			else{
			 System.out.println("turnOn tv");
			}
			
			
		}
	
	
}	
