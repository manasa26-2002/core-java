class TubeLight{
  
  long id;
  int price;
  String brand;
  int voltage;
  
  public TubeLight()
  {
	  System.out.println("constructor is invoked");
  }  
  public TubeLight( long i , int p , String b , int vlt){
	  System.out.println("light constructor invoked");
	  id =  i;
	  price = p;
	  brand = b;
	  voltage = vlt;
  }
  
  public void fetchDetails(){
	  System.out.println("the tublight id is:"+id);
	  System.out.println("the tublight price is:"+price);
	  System.out.println("the tublight brand is:"+brand);
	  System.out.println("the tublight voltage is:"+voltage);
	  
	  
  }
  
}