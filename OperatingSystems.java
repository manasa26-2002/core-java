class OperatingSystems{
 
long phoneNumber;
String version;

public  OperatingSystems(){
	System.out.println("system constructor is invoked");
}
public OperatingSystems( long pN,String V){
	phoneNumber = pN;
	version = V;
}
public void displayOperatingSystemDetails(){
	System.out.println("the OperatingSystem phoneNumber is :"+phoneNumber);
	System.out.println("the OperatingSystem version is :"+version);
}
}