class Library{
  
  long libraryId;
  String address;
  String type;
  String libraryOwnerName;
  
  public Library(){
	  System.out.println("library constructor invoked");
  }
  public Library(long lI,String add,String tp,String lON){
	  libraryId=lI;
	  address = add;
	  type=tp;
	  libraryOwnerName = lON;
  }
  public void fetchLibraryDetails(){
	  System.out.println("the library id is:"+libraryId);
	   System.out.println("the library address is:"+address);
	    System.out.println("the library type is:"+type);
		 System.out.println("the library libraryOwnerName is:"+libraryOwnerName);
  }
}