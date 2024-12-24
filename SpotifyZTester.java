class SpotifyZTester{
public static void main(String [] args){
boolean isZonerAdded = SpotifyZ.addZoners("jazz");
System.out.println("isZonerAdded:"+isZonerAdded);

isZonerAdded = SpotifyZ.addZoners("blues");
System.out.println("isZonerAdded:"+isZonerAdded);

isZonerAdded = SpotifyZ.addZoners("classical");
System.out.println("isZonerAdded:"+isZonerAdded);

isZonerAdded = SpotifyZ.addZoners("country");
System.out.println("isZonerAdded:"+isZonerAdded);

isZonerAdded = SpotifyZ.addZoners("hip hop");
System.out.println("isZonerAdded:"+isZonerAdded);

isZonerAdded = SpotifyZ.addZoners("pop music");
System.out.println("isZonerAdded:"+isZonerAdded);

isZonerAdded = SpotifyZ.addZoners("rock");
System.out.println("isZonerAdded:"+isZonerAdded);

isZonerAdded = SpotifyZ.addZoners("reggae");
System.out.println("isZonerAdded:"+isZonerAdded);

SpotifyZ.getZoner();
boolean zonerName = SpotifyZ.updateZoner("afro pop" , "reggae");
System.out.println("zonerName : "+zonerName);
SpotifyZ.getZoner();

boolean isDeleted = SpotifyZ.deleteZonerByName("country");

SpotifyZ.getZoner();

}
}