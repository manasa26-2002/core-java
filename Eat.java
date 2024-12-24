class Eat{
	public static void main(String [] args){
		
		double price = search("cheeseBalls");
		System.out.println("the price of cheeseBalls is:" +price);
		double price1 = search("paneerTikka");
		System.out.println("the price of paneerTikka is:" +price1);
		
	}
	
	public static double search(String foodName){
		if(foodName == "cheeseBalls"){
			return 120.0;
		}
		if(foodName == "paneerTikka"){
			return 150.00;
		}
		else{
			System.out.println("foodName not found");
		}
		return 0.0;
	}
	
	
	
}