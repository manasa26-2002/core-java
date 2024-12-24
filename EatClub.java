class EatClub{
	
	public static void main(String [] args){
	
double price = search("friedRice");
System.out.println("the price of friedRice is:"+price);

double price1 = search("curdRice");
System.out.println("the price of curdRice is:"+price1);

double price2 = search("tomatoRice");
System.out.println("the price of tomatoRice is:"+price2);

double price3 = search("jeeraRice");
System.out.println("the price of jeeraRice is:"+price3);

double price4 = search("lemonRice");
System.out.println("the price of lemonRice is:"+price4);

double price5 = search("peasPulao");
System.out.println("the price of peasPulao is:"+price5);

double price6 = search("kajuRice");
System.out.println("the price of kajuRice is:"+price6);

double price7 = search(" paneerFriedRice");
System.out.println("the price of  paneerFriedRice is:"+price7);

double price8 = search("bisibelebath");
System.out.println("the price of bisibelebath is:"+price8);

double price9 = search("tawaPulao");
System.out.println("the price of tawaPulao is:"+price9);

double price10 = search("mushroomBiriyani");
System.out.println("the price of mushroomBiriyani is:"+price10);

double price11 = search("palakBiriyani");
System.out.println("the price of palakBiriyani is:"+price11);

double price12 = search("cornBiriyani");
System.out.println("the price of cornBiriyani is:"+price12);

double price13 = search("tehriRice");
System.out.println("the price of tehriRice is:"+price13);

double price14 = search("schezwanFriedRice");
System.out.println("the price of schezwanFriedRice is:"+price14);

}
 public static double search(String foodName){
 
 if(foodName == "friedRice"){
 return 170.90;
 }
 if(foodName == "curdRice"){
 return 100.78;
 }
 if(foodName == "tomatoRice"){
 return 156.35;
 }
 if(foodName == "jeeraRice"){
 return 120.00; 
 }
 if(foodName == "lemonRice"){
 return 80.90;
 }
 if(foodName == "peasPulao"){
 return 80.00;
 }
 if(foodName == "kajuRice"){
 return 99.45;
 }
 if(foodName == "paneerFriedRice"){
 return 130.00;
 }
 if(foodName == "bisibelebath"){
 return 85.20;
 }
 if(foodName == "tawaPulao"){
 return 160.90;
 }
 if(foodName == "mushroomBiriyani"){
 return 168.00;
 }
 if(foodName == "palakBiriyani"){
 return 135.12;
 }
 if(foodName == "cornBiriyani"){
 return 155.89;
 }
 if(foodName == "tehriRice"){
 return 180.67;
 }
 if(foodName == "schezwanFriedRice"){
 return 145.90;
 }
 else
 {
 System.out.println("rice not found");
 }
 return 10.00;
    }

}