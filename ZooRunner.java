class ZooRunner{
public static void main(String [] delivery){
String foodName = "pizza";
double price = Zoo.search(foodName);
System.out.println("the price of" + foodName + "is" +price);
    double priceWithquantity   = Zoo.search(foodName,3);
	System.out.println("the price of "+ foodName + "is" +priceWithquantity);
}

}