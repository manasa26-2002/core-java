class DrivingLicence{
  
String dlNo;
String validTill;
String name;
String dateOfBirth;
String bloodGroup;
String fatherName;
long rtoOfficeNumber;

public DrivingLicence(){
	
	System.out.println("licence constructor invoked");
}
public DrivingLicence(String dn , String vT , String name, String dob, String bg, long rtn){
	dlNo = dn;
	validTill = vT;
	name = n;
	dateOfBirth = dob;
	bloodGroup = bg;
	rtoOfficeNumber = rtn;
}
public void fetchDrivingLicences(){
	System.out.println("the driving licences dlNo is :"+dlNo);
	System.out.println("the driving licences validTill is :"+validTill);
	System.out.println("the driving licences name is :"+name);
	System.out.println("the driving licences dateOfBirth is :"+dateOfBirth);
	System.out.println("the driving licences bloodGroup is :"+bloodGroup);
	System.out.println("the driving licences fatherName is :"+fatherName);
	System.out.println("the driving licences rtoOfficeNumber is :"+rtoOfficeNumber);
}

}