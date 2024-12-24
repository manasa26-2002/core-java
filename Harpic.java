class Harpic{
  int quantity;
  long id;
  int price;
  String color;
  
  public Harpic(){
	  System.out.println("harpic constructorn invoked");
  }
  public  Harpic(int qn,long i, int pr , String clr){
	  System.out.println("harpic constructorn invoked");
	  quantity = qn;
	  id = i;
	  price = pr;
	  color = clr;
	  
  }
  public void fetchHarpicDetails(){
	  System.out.println("the harpic quantity is :"+quantity);
	  System.out.println("the harpic id is :"+id);
	  System.out.println("the harpic price is :"+price);
	  System.out.println("the harpic color is :"+color);
  }
  
}