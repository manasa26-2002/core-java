class Pen{
	
	String brandName;
	double price;
	String color;
	String material;
	String type;
	
	public Pen(){
		this("cello",500.70);
		System.out.println("pen constructor is invoked");
	}
	
	public Pen (String brandName,double price){
		this("gel","blue","plastic");
		System.out.println("pen constructor is invoked");
		brandName = brandName;
		Price = price;
		type = type;
		color = color;
		material = material;
	}
	public Pen(String type,String color,String material){
		
	}
	
	public void displayDteails(){
		System.out.println("Pen details are:----");
		System.out.println("pen brand is :"+brandName);
		System.out.println("pen price is:"+price);
		System.out.println("pen type is:"+type);
		System.out.println("pen color is:"+color);
		System.out.println("pen material is" +material);
	}
}