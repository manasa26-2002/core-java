class Zepto{
	
	public static void main(String [] args){
	
double price = search("vegBiriyani");
System.out.println("the price of vegBiriyani is:"+price);

double price1 = search("eggBiriyani");
System.out.println("the price of eggBiriyani is:"+price1);

double price2 = search("kacchiBiriyani");
System.out.println("the price of kacchiBiriyani is:"+price2);

double price3 = search("muttonBiriyani");
System.out.println("the price of muttonBiriyani is:"+price3);

double price4 = search("hydrabadiBiriyani");
System.out.println("the price of hydrabadiBiriyani is:"+price4);

double price5 = search("dindigulBiriyani");
System.out.println("the price of dindigulBiriyani is:"+price5);

double price6 = search("lucknowBiriyani");
System.out.println("the price of lucknowBiriyani is:"+price6);

double price7 = search("kolkataBiriyani");
System.out.println("the price of  kolkataBiriyani is:"+price7);

double price8 = search("malabarBiriyani");
System.out.println("the price of malabarBiriyani is:"+price8);

double price9 = search("bombayBiriyani");
System.out.println("the price of bombayBiriyani is:"+price9);

double price10 = search("chickenBiriyani");
System.out.println("the price of chickenBiriyani is:"+price10);

double price11 = search("sindhiBiriyani");
System.out.println("the price of sindhiBiriyani is:"+price11);

double price12 = search("tahriBiriyani");
System.out.println("the price of tahriBiriyani is:"+price12);

double price13 = search("chettinadChickenBiriyani");
System.out.println("the price of chettinadChickenBiriyani is:"+price13);

double price14 = search("raanBiriyani");
System.out.println("the price of raanBiriyani is:"+price14);

}
 public static double search(String foodName){
 
 if(foodName == "vegBiriyani"){
 return 170.90;
 }
 if(foodName == "eggBiriyani"){
 return 150.78;
 }
 if(foodName == "kacchiBiriyani"){
 return 156.35;
 }
 if(foodName == "muttonBiriyani"){
 return 220.00; 
 }
 if(foodName == "hydrabadiBiriyani"){
 return 270.90;
 }
 if(foodName == "dindigulBiriyani"){
 return 250.00;
 }
 if(foodName == "lucknowBiriyani"){
 return 199.45;
 }
 if(foodName == "kolkataBiriyani"){
 return 190.00;
 }
 if(foodName == "malabarBiriyani"){
 return 300.20;
 }
 if(foodName == "bombayBiriyani"){
 return 360.90;
 }
 if(foodName == "chickenBiriyani"){
 return 368.00;
 }
 if(foodName == "sindhiBiriyani"){
 return 370.12;
 }
 if(foodName == "tahriBiriyani"){
 return 250.89;
 }
 if(foodName == "chettinadChickenBiriyani"){
 return 380.67;
 }
 if(foodName == "raanBiriyani"){
 return 245.90;
 }
 else
 {
 System.out.println("biriyani not found");
 }
 return 100.00;
    }

}