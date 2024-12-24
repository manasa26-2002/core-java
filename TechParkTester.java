class TechParkTester{
public static void main (String [] args){

boolean isCompanyNameAdded = TechPark.addCompanyNames("tcs");
System.out.println("isCompanyNameAdded :"+isCompanyNameAdded);

isCompanyNameAdded = TechPark.addCompanyNames("infosys");
System.out.println("isCompanyNameAdded :"+isCompanyNameAdded);

isCompanyNameAdded = TechPark.addCompanyNames("ibm");
System.out.println("isCompanyNameAdded :"+isCompanyNameAdded);

isCompanyNameAdded = TechPark.addCompanyNames("hcl");
System.out.println("isCompanyNameAdded :"+isCompanyNameAdded);

isCompanyNameAdded = TechPark.addCompanyNames("cognizant");
System.out.println("isCompanyNameAdded :"+isCompanyNameAdded);

isCompanyNameAdded = TechPark.addCompanyNames("dell");
System.out.println("isCompanyNameAdded :"+isCompanyNameAdded);

isCompanyNameAdded = TechPark.addCompanyNames("microsoft");
System.out.println("isCompanyNameAdded :"+isCompanyNameAdded);

isCompanyNameAdded = TechPark.addCompanyNames("meta");
System.out.println("isCompanyNameAdded :"+isCompanyNameAdded);

isCompanyNameAdded = TechPark.addCompanyNames("apple");
System.out.println("isCompanyNameAdded :"+isCompanyNameAdded);

isCompanyNameAdded = TechPark.addCompanyNames("simens");
System.out.println("isCompanyNameAdded :"+isCompanyNameAdded);

isCompanyNameAdded = TechPark.addCompanyNames("amazon");
System.out.println("isCompanyNameAdded :"+isCompanyNameAdded);

isCompanyNameAdded = TechPark.addCompanyNames("nvidia");
System.out.println("isCompanyNameAdded :"+isCompanyNameAdded);

isCompanyNameAdded = TechPark.addCompanyNames("google");
System.out.println("isCompanyNameAdded :"+isCompanyNameAdded);

isCompanyNameAdded = TechPark.addCompanyNames("accenture");
System.out.println("isCompanyNameAdded :"+isCompanyNameAdded);

isCompanyNameAdded = TechPark.addCompanyNames("dxc");
System.out.println("isCompanyNameAdded :"+isCompanyNameAdded);

TechPark.getCompanyName();

boolean companyName = TechPark.updateCompanyName("capgemini" , "accenture");
System.out.println("companyName : "+ companyName);

TechPark.getCompanyName();

boolean isDeleted = TechPark.deleteCompanyByName("nvidia");

TechPark.getCompanyName();
}

}