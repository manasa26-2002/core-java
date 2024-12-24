class Zoo{
	public static double search(String foodName){
		if(foodName == "pizza"){
		return 50.0;
		}
		if(foodName == "burger"){
		return 180.80;
		}else{
			System.out.println("foodName not found");
		}
		return 0.0;
	}
	
	 public static double  search (String foodName , int quantity){
		 
		 if(foodName == "pizza"){
			 return 50.0 * quantity;
		 }
		 return 0.0;
	 }
}