class PhonePeRunner{
	public static void main(String [] args){
		System.out.println("main started");
		boolean isInsuranceAdded = PhonePe.addInsurance("bike insurance");
		System.out.println("isInsuranceAdded :" +isInsuranceAdded);
		isInsuranceAdded = PhonePe.addInsurance("car insurance");
		System.out.println("isInsuranceAdded :" +isInsuranceAdded);
		isInsuranceAdded = PhonePe.addInsurance("home insurance");
		System.out.println("isInsuranceAdded :" +isInsuranceAdded);
		isInsuranceAdded = PhonePe.addInsurance("health insurance");
		System.out.println("isInsuranceAdded : "+isInsuranceAdded);
		isInsuranceAdded = PhonePe.addInsurance("termLife insurance");
		System.out.println("isInsuranceAdded :"+isInsuranceAdded);
		
		PhonePe.getInsurance();
		
		boolean insuranceNameUpdated = PhonePe.updateInsuranceByName("wealth insurance" , "health insurance");
		System.out.println("insuranceNameUpdated :" +insuranceNameUpdated);
		
		PhonePe.getInsurance();
		
		boolean isInsuranceDeleted = PhonePe.deleteInsuranceByName("home insurance");
		PhonePe.getInsurance();
		System.out.println("main ended");
	}
}