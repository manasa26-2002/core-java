class Tv1{
     static  boolean isConnected;
	  static int currentVolume;
	  static int maximumVolume = 2;
	  static int minimumVolume;
   public static void main(String [] args){
	   System.out.println("main started");
	   boolean ref = isConnected;
	   System.out.println(ref);
	   
	   ref = isConnected;
	   System.out.println(ref);
	   
	   increaseVolume();
	   increaseVolume();
	   increaseVolume();
	   
	   System.out.println("main ended");
   
   }
   
   public static boolean isConnected(){
   System.out.println("start of turnon");
   isConnected = !isConnected ? true : false ;
   System.out.println("end of turnon");
   return isConnected;
   
   }
   public static void increaseVolume(){
	   System.out.println("start of increaseVolume");
	   if(isConnected){
		   
		   if(currentVolume<maximumVolume){
			   currentVolume = currentVolume + 1;
		   System.out.println("currentVolume is:" +currentVolume);
		   
	   }else{
		   System.out.println("maximum volume reached");
		     
	   }
	   }else {
		   System.out.println("turnon on tv");
	   }
   
   
}

}

