class Pg{
  String pgOwner;
  int rent;
  int noOfFloors;
  String pgAddress;
  
  public Pg(){
	  System.out.prinltn("pg constructor invoked");
  }
  public Pg(String pO,int r, int nOF,String Pa){
	  pgOwner = pO;
	  rent = r;
	  noOfFloors = nOF;
	  pgAddress = Pa;
  }
  public void fetchPgDetails(){
	  System.out.println("the pg owner name is :"+pgOwner);
	  System.out.println("the pg  rent is :"+rent);
	  System.out.println("the pg  noOfFloors is :"+noOfFloors);
	  System.out.println("the pg  pgAddress is :"+pgAddress);
  }
  
}