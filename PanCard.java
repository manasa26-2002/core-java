class PanCard{
	
  String panNumber;
  String name;
  String fatherName;
  String dateOfBirth;
  public PanCard(){
	  System.out.println("pancard constructor invoked");
  }
  public PanCard(String pN , String N,String fN,String DOB){
	  panNumber = pN;
	  name = N;
	  fatherName = fN;
	  dateOfBirth = DOB;
  }
  public void getPanCardDetails(){
	  System.out.println("the pan card panNumber is:"+panNumber);
	  System.out.println("the pan card name is:"+name);
	  System.out.println("the pan card fatherName is:"+fatherName);
	  System.out.println("the pan card dateOfBirth is:"+dateOfBirth);
  }
}