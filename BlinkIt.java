class BlinkIt{
	
	public static void main(String [] args){
	
double price = search("cheeseBalls");
System.out.println("the price of cheeseBalls is:"+price);

double price1 = search("mushroomTikka");
System.out.println("the price of mushroomTikka is:"+price1);

double price2 = search("veggie khabab");
System.out.println("the price of veggie khabab is:"+price2);

double price3 = search("gobiManchuri");
System.out.println("the price of gobiManchuri is:"+price3);

double price4 = search("babyCornManchuri");
System.out.println("the price of babyCornManchuri is:"+price4);

double price5 = search("momos");
System.out.println("the price of momos is:"+price5);

double price6 = search("cornChat");
System.out.println("the price of cornChat is:"+price6);

double price7 = search(" mushroomManchuri");
System.out.println("the price of  mushroomManchuri is:"+price7);

double price8 = search("aloo65");
System.out.println("the price of aloo65 is:"+price8);

double price9 = search("alooTwister");
System.out.println("the price of alooTwister is:"+price9);

double price10 = search("pakoda");
System.out.println("the price of pakoda is:"+price10);

double price11 = search("bajji");
System.out.println("the price of chikki is:"+price11);

double price12 = search("paneer65");
System.out.println("the price of paneer65 is:"+price12);

double price13 = search("chilliBabyCorn");
System.out.println("the price of chilliBabyCorn is:"+price13);

double price14 = search("palakRolls");
System.out.println("the price of palakRolls is:"+price14);

}
 public static double search(String foodName){
 
 if(foodName == "cheeseBalls"){
 return 170.90;
 }
 if(foodName == "mushroomTikka"){
 return 165.78;
 }
 if(foodName == "veggie khabab"){
 return 156.35;
 }
 if(foodName == "gobiManchuri"){
 return 70.00; 
 }
 if(foodName == "babyCornManchuri"){
 return 80.90;
 }
 if(foodName == "momos"){
 return 80.00;
 }
 if(foodName == "cornChat"){
 return 50.45;
 }
 if(foodName == "mushroomManchuri"){
 return 89.00;
 }
 if(foodName == "aloo65"){
 return 65.20;
 }
 if(foodName == "alooTwister"){
 return 58.90;
 }
 if(foodName == "pakoda"){
 return 68.00;
 }
 if(foodName == "bajji"){
 return 35.12;
 }
 if(foodName == "paneer65"){
 return 55.89;
 }
 if(foodName == "chilliBabyCorn"){
 return 80.67;
 }
 if(foodName == "palakRolls"){
 return 45.90;
 }
 else
 {
 System.out.println("starter not found");
 }
 return 89.00;
    }

}