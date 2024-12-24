class HeadSets{
	static boolean isConnected ;
	static int currentVolume;
	static int maximumVolume=8;
	static int minimumVolume;
	
	public static void main(String [] args){
		System.out.println("main started");
    boolean anything = onOrOff ();
    System.out.println("is headset connected:"+anything);
	
         anything = onOrOff ();
    System.out.println("is headset connected:"+anything);
	      
	           increaseVolume();
			   increaseVolume();
			   increaseVolume();
			   increaseVolume();
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
		isConnected = !isConnected ? true : false ;   // ternary operation
			System.out.println("end of onOrOff");
			return isConnected;
	}
	    public static void increaseVolume(){
			System.out.println("start of increaseVolume method");
			if(isConnected == true){
				if(currentVolume < maximumVolume){
					currentVolume = currentVolume + 1;
					System.out.println("currentVolume is"+currentVolume);
				}else{
					System.out.println("maximum volume reached");
				}
					
				
				
			}else{
				System.out.println("turnOn headset");
			}
			
			
		}
	
	
}	
