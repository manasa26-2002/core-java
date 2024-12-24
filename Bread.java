class Bread{
  String type;
  int noOfSlices;
  String brandName;
  public Bread(){
	  System.out.println("bread constructor is invoked");
  }
  public Bread(String tp,int nOS , String bN){
	  type= tp;
	  noOfSlices = nOS;
	  brandName = bN;
  }
  public void getBreadDetails(){
	  System.out.println("the bread type is :"+type);
	  System.out.println("the bread noOfSlices is :"+noOfSlices);
	  System.out.println("the bread brandName is :"+brandName);
	  
  }
  
}