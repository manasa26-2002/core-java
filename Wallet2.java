class Wallet2{
  
  String id;
  String color;
  String brand;
  int noOfCompartments;
  
  public Wallet2(){
	  System.out.println("wallet constructor is invoked");
	 
  }
  public Wallet2( String i , String clr, String brn, int nc){
	  System.out.println("wallet invoked");
	  id = i;
	  color = clr;
	  brand = brn;
	  noOfCompartments = nc;
  }
  public void getDetails(){
	  System.out.println("the wallet id is :"+id);
	   System.out.println("the wallet color is :"+color);
	    System.out.println("the wallet brand is :"+brand);
		 System.out.println("the wallet noOfCompartments is :"+noOfCompartments);
  }
  
}