class Swiggy{

public static void main(String [] args){
	
double price = search("idli");
System.out.println("the price of idli is:"+price);

double price1 = search("dosa");
System.out.println("the price of dosa is:"+price1);

double price2 = search("puri");
System.out.println("the price of puri is:"+price2);

double price3 = search("poha");
System.out.println("the price of poha is:"+price3);

double price4 = search("vada");
System.out.println("the price of vada is:"+price4);

double price5 = search("ravaIdli");
System.out.println("the price of ravaIdli is:"+price5);

double price6 = search("kichadi");
System.out.println("the price of kichadi is:"+price6);

double price7 = search("onion Uttappam");
System.out.println("the price of onion uttapam is:"+price7);

double price8 = search("parotta");
System.out.println("the price of parotta is:"+price8);

double price9 = search("pongal");
System.out.println("the price of pongal is:"+price9);

double price10 = search("appam");
System.out.println("the price of appam is:"+price10);

double price11 = search("chapathi");
System.out.println("the price of chapathi is:"+price11);

double price12 = search("aloo paratha");
System.out.println("the price of aloo paratha is:"+price12);

double price13 = search("puttu");
System.out.println("the price of puttu is:"+price13);

double price14 = search("ravaKesari");
System.out.println("the price of ravaKesari is:"+price14);

}
 public static double search(String foodName){
 
 if(foodName == "idli"){
 return 56.90;
 }
 if(foodName == "dosa"){
 return 65.78;
 }
 if(foodName == "puri"){
 return 35.89;
 }
 if(foodName == "poha"){
 return 30.00; 
 }
 if(foodName == "vada"){
 return 45.78;
 }
 if(foodName == "ravaIdli"){
 return 50.00;
 }
 if(foodName == "kichadi"){
 return 35.45;
 }
 if(foodName == "onion uttapam"){
 return 55.34;
 }
 if(foodName == "parotta"){
 return 60.20;
 }
 if(foodName == "pongal"){
 return 38.76;
 }
 if(foodName == "appam"){
 return 40.00;
 }
 if(foodName == "chapati"){
 return 35.12;
 }
 if(foodName == "aloo paratha"){
 return 55.89;
 }
 if(foodName == "puttu"){
 return 25.89;
 }
 if(foodName == "ravaKesari"){
 return 35.78;
 }
 else
 {
 System.out.println("foodName not found");
 }
 return 123.89;
    }

}