class PhoneRunner{
public static void main(String [] cell){
System.out.println("main started");
boolean isApplicationAdded = Phone.addApplication("Instagram");
System.out.println("isApplicationAdded :"+isApplicationAdded);
isApplicationAdded = Phone.addApplication("Snapchat");
System.out.println("isApplicationAdded :"+isApplicationAdded);
isApplicationAdded = Phone.addApplication("kotak");
System.out.println("isApplicationAdded :"+isApplicationAdded);
isApplicationAdded = Phone.addApplication("threads");
System.out.println("isApplicationAdded :"+isApplicationAdded);
isApplicationAdded = Phone.addApplication("zepto");
System.out.println("isApplicationAdded :"+isApplicationAdded);

Phone.getApplication();

boolean applicationNameUpdated =Phone.updateApplicationByName("My kotak" , "kotak");
System.out.println("ApplicationNameUpdated :" +applicationNameUpdated);

Phone.getApplication();

boolean appDeleted = Phone.deleteApplicationByName("threads");

Phone.getApplication();

System.out.println("main ended");
}

}