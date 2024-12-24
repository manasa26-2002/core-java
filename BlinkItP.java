import java.util.Arrays;
class BlinkItP{
	static String productNames[] = {null, null, null, null, null, null, null, null };
	static int index;
	
	public static boolean addProductName(String productName){
		System.out.println("addProductNames started");
		boolean isProductNameAdded = false;
		if(productName !=null){
			System.out.println("productName will proceed to add");
			productNames[index] = productName;
			index++;
		}else{
			System.out.println("productName is null");
			
		}
		System.out.println("addProductNames ended");
		return isProductNameAdded;
	}
	public static void getProductName(){
		System.out.println("getProductName started");
		System.out.println("productNames are");
		for(String productName : productNames){
			System.out.println(productName);
		}
	}
	public static boolean updateProductName(String newProductName , String oldProductName){
		System.out.println("updateProductName started");
		boolean isProductNameUpdated = false;
		for(int cost=0; cost<productNames.length; cost++){
			if(productNames[cost] == oldProductName){
				productNames[cost] = newProductName;
				isProductNameUpdated = true;
				break;
			}
		}
		System.out.println("updateProductName ended");
		
		return isProductNameUpdated;
		
	}
	
	public static boolean deleteProductName(String proName){
		System.out.println("deleteProductName started");
		boolean isProductDeleted = false;
		int  index , newIndex;
		for( index=0,newIndex =0; index<productNames.length; index++) {
		String existingProductName = productNames[index];
       if(existingProductName != proName){
		   productNames[newIndex++] =existingProductName;
		   
	   }else{
		isProductDeleted = true;
	}		
	}
	productNames = Arrays.copyOf(productNames , newIndex);
	return isProductDeleted;
}
}