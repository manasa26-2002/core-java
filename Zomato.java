class Zoo{
	public static double search(String foodName){
		if(foodName == "pizza"){
		return 150.0;
		}
		if(foodName == "burger"){
		return 180.80;
		}else{
			System.out.println("foodName not found");
		}
		return 0.0;
	}
}