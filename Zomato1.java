class Zomato{
	
	public static void main(String [] args){
	
double price = search("gulabJamun");
System.out.println("the price of gulabJamun is:"+price);

double price1 = search("jalebi");
System.out.println("the price of jalebi is:"+price1);

double price2 = search("kheer");
System.out.println("the price of kheer is:"+price2);

double price3 = search("mysore pak");
System.out.println("the price of mysore pak is:"+price3);

double price4 = search("gajarKaHalwa");
System.out.println("the price of gajarKaHalwa is:"+price4);

double price5 = search("peda");
System.out.println("the price of peda is:"+price5);

double price6 = search("kajuKatli");
System.out.println("the price of kajuKatli is:"+price6);

double price7 = search(" rasmalai");
System.out.println("the price of  rasmalai is:"+price7);

double price8 = search("sandesh");
System.out.println("the price of sandesh is:"+price8);

double price9 = search("laddu");
System.out.println("the price of laddu is:"+price9);

double price10 = search("mithai");
System.out.println("the price of mithai is:"+price10);

double price11 = search("chikki");
System.out.println("the price of chikki is:"+price11);

double price12 = search("barfi");
System.out.println("the price of barfi is:"+price12);

double price13 = search("dryFruitLaddu");
System.out.println("the price of aloo dryFruitLaddu is:"+price13);

double price14 = search("halwa");
System.out.println("the price of halwa is:"+price14);

}
 public static double search(String foodName){
 
 if(foodName == "gulabJamun"){
 return 70.90;
 }
 if(foodName == "jalebi"){
 return 65.78;
 }
 if(foodName == "kheer"){
 return 89.35;
 }
 if(foodName == "mysore pak"){
 return 70.00; 
 }
 if(foodName == "gajar ka halwa"){
 return 67.90;
 }
 if(foodName == "peda"){
 return 50.00;
 }
 if(foodName == "kaju katli"){
 return 350.45;
 }
 if(foodName == "rasmalai"){
 return 89.00;
 }
 if(foodName == "sandesh"){
 return 60.20;
 }
 if(foodName == "laddu"){
 return 58.90;
 }
 if(foodName == "mithai"){
 return 68.00;
 }
 if(foodName == "chikki"){
 return 35.12;
 }
 if(foodName == "barfi"){
 return 55.89;
 }
 if(foodName == "dryFruit Laddu"){
 return 80.67;
 }
 if(foodName == "halwa"){
 return 45.90;
 }
 else
 {
 System.out.println("sweetName not found");
 }
 return 99.99;
    }

}