class Glass{
  
  int id;
  String type;
  
  public Glass(){
	  System.out.println("glass constructor invoked");
  }
  public Glass(int i,String tp){
	  id = i;
	  type = tp;
  }
  public void getGlassDetails(){
	  System.out.println("the glass id is:"+id);
	  System.out.println("the glass type is :"+type);
  }
  
}