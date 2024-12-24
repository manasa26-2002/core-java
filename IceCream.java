class IceCream{
  
  long id;
  int quantity;
  String brand;
  String flavors;
  String type;
  
  public IceCream(){
	  System.out.println("ice constructor is invoked");
  }
  
  public IceCream(long i , int qn , String b , String fl , String tp){
	  System.out.println("ice constructor is invoked");
	  id = i;
	  quantity = qn;
	  brand = b;
	  flavors =fl;
	  type = tp;
  } 
  public void displayDetails(){
	  System.out.println("the ice cream id is :"+id);
	  System.out.println("the ice cream quantity is :"+quantity);
	  System.out.println("the ice cream brand is :"+brand);
	  System.out.println("the ice cream flavors is :"+flavors);
	  System.out.println("the ice cream type is :"+type);
	  
  }
  
}