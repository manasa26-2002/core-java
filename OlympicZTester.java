class OlympicZTester{
public static void main(String [] args){
boolean isSportNameAdded = OlympicZ.addSportNames("chees");
System.out.println("isSportNameAdded :"+isSportNameAdded);

isSportNameAdded = OlympicZ.addSportNames("badmition");
System.out.println("isSportNameAdded :"+isSportNameAdded);

isSportNameAdded = OlympicZ.addSportNames("kabbaddi");
System.out.println("isSportNameAdded :"+isSportNameAdded);

isSportNameAdded = OlympicZ.addSportNames("boxing");
System.out.println("isSportNameAdded :"+isSportNameAdded);

isSportNameAdded = OlympicZ.addSportNames("basketball");
System.out.println("isSportNameAdded :"+isSportNameAdded);

isSportNameAdded = OlympicZ.addSportNames("luge");
System.out.println("isSportNameAdded :"+isSportNameAdded);

isSportNameAdded = OlympicZ.addSportNames("soccer");
System.out.println("isSportNameAdded :"+isSportNameAdded);

isSportNameAdded = OlympicZ.addSportNames("ice hockey");
System.out.println("isSportNameAdded :"+isSportNameAdded);

isSportNameAdded = OlympicZ.addSportNames("polo");
System.out.println("isSportNameAdded :"+isSportNameAdded);

isSportNameAdded = OlympicZ.addSportNames("skeleton");
System.out.println("isSportNameAdded :"+isSportNameAdded);

isSportNameAdded = OlympicZ.addSportNames("tennis");
System.out.println("isSportNameAdded :"+isSportNameAdded);

isSportNameAdded = OlympicZ.addSportNames("cricket");
System.out.println("isSportNameAdded :"+isSportNameAdded);

isSportNameAdded = OlympicZ.addSportNames("curling");
System.out.println("isSportNameAdded :"+isSportNameAdded);

isSportNameAdded = OlympicZ.addSportNames("swimming");
System.out.println("isSportNameAdded :"+isSportNameAdded);

isSportNameAdded = OlympicZ.addSportNames("longjump");
System.out.println("isSportNameAdded :"+isSportNameAdded);

OlympicZ.getSportName();

boolean sportName = OlympicZ.updateSportName("bowling" , "curling");
System.out.println("sportName:" +sportName);

OlympicZ.getSportName();

boolean isDeleted = OlympicZ.deleteSportByName("skeleton");

OlympicZ.getSportName();

}

}