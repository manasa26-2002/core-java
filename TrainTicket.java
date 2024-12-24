class TrainTicket{
  long trainPnrNo;
  int age;
  String name;
  String gender;
  
  public TrainTicket(){
	  System.out.println("Pen constructor is invoked");
  }
  
  public  TrainTicket(String tpn,int ag,String n,String gn){
	  System.out.println("Pen constructor is invoked");
	  trainPnrNo = tpn;
	  age = ag;
	  name = n;
	  gender = gn;
  }
  public void displayTrainTicketDetails(){
	  System.out.println("the train details are----");
	  System.out.println("the train ticket pnrno is:"+trainPnrNo);
	  System.out.println("the train ticket age is:"+age);
	  System.out.println("the train ticket name is:"+name);
	  System.out.println("the train ticket gender is:"+gender);
  }
}