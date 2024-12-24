class GalaxyTester{
public static void main(String [] args){
 
 boolean isPlanetNameAdded = Galaxy.addPlanetNames("mercury");
 System.out.println("isPlanetNameAdded:"+isPlanetNameAdded);
 
 isPlanetNameAdded = Galaxy.addPlanetNames("venus");
 System.out.println("isPlanetNameAdded:"+isPlanetNameAdded);
 
 isPlanetNameAdded = Galaxy.addPlanetNames("earth");
 System.out.println("isPlanetNameAdded:"+isPlanetNameAdded);
 
 isPlanetNameAdded = Galaxy.addPlanetNames("mars");
 System.out.println("isPlanetNameAdded:"+isPlanetNameAdded);
 
 isPlanetNameAdded = Galaxy.addPlanetNames("jupiter");
 System.out.println("isPlanetNameAdded:"+isPlanetNameAdded);
 
 isPlanetNameAdded = Galaxy.addPlanetNames("saturn");
 System.out.println("isPlanetNameAdded:"+isPlanetNameAdded);
 
 isPlanetNameAdded = Galaxy.addPlanetNames("uranus");
 System.out.println("isPlanetNameAdded:"+isPlanetNameAdded);
 
 isPlanetNameAdded = Galaxy.addPlanetNames("neptune");
 System.out.println("isPlanetNameAdded:"+isPlanetNameAdded);
 
 Galaxy.getPlanetNames();
 boolean isPlanetNameUpdated = Galaxy.updatePlanetName("pluto" , "uranus");
 System.out.println("isPlanetNameUpdated : "+isPlanetNameUpdated);
 
 Galaxy.getPlanetNames();
 
 boolean isDeleted = Galaxy.deletePlanetByName("saturn");
 
 Galaxy.getPlanetNames();

}
}