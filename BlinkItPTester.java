class BlinkItPTester{
	public static void main(String [] args){
		boolean isProductNameAdded = BlinkItP.addProductName("iceCream");
		System.out.println("isProductNameAdded:"+isProductNameAdded);
		
		isProductNameAdded = BlinkItP.addProductName("chocolates");
		System.out.println("isProductNameAdded:"+isProductNameAdded);
		
		isProductNameAdded = BlinkItP.addProductName("biriyani");
		System.out.println("isProductNameAdded:"+isProductNameAdded);
		
		isProductNameAdded = BlinkItP.addProductName("fruits");
		System.out.println("isProductNameAdded:"+isProductNameAdded);
		
		isProductNameAdded = BlinkItP.addProductName("vegetables");
		System.out.println("isProductNameAdded:"+isProductNameAdded);
		
		isProductNameAdded = BlinkItP.addProductName("chips");
		System.out.println("isProductNameAdded:"+isProductNameAdded);
		
		isProductNameAdded = BlinkItP.addProductName("eggs");
		System.out.println("isProductNameAdded:"+isProductNameAdded);
		
		isProductNameAdded = BlinkItP.addProductName("milk");
		System.out.println("isProductNameAdded:"+isProductNameAdded);
		
	BlinkItP.getProductName();
	boolean isProductNameUpdated = BlinkItP.updateProductName("falooda" , "biriyani");
	System.out.println("isProductNameUpdated :"+isProductNameUpdated);
	
	BlinkItP.getProductName();
	
	boolean isDeleted = BlinkItP.deleteProductName("eggs");
	
	BlinkItP.getProductName();
	
	System.out.println("main ended");
	
	}
}