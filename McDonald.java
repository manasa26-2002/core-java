class McDonald{
	
	static String foodItems[] = {"fries","crispy veg burger","non veg burger","potato pockets","thumps up","sprite","coco cola"};
	
	public static void main(String [] args){
		System.out.println("no of foodItems present are:"+foodItems.length);
		for(int cheese=0; cheese<foodItems; cheese++){
			String ref=foodItems[cheese];
			System.out.println(ref);
		}
	}
}