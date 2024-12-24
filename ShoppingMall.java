import java.util.Arrays;
class ShoppingMall{
	static String shopNames[] = {null, null, null, null, null, null, null, null, null, null};
	static int index;
	public static boolean addShopName(String shopName){
		//System.out.println("add ShopName started");
		boolean isShopNameAdded = false;
		if(shopName !=null){
			//System.out.println("shopName proceeed");
			shopNames[index] = shopName;
			index++;
			isShopNameAdded = true;
		}else{
			System.out.println("shopName is null");
		}
		//System.out.println("add shopName ended");
		return isShopNameAdded;
	}
	public static void getShopName(){
		System.out.println("getShopName started");
		System.out.println("list of shopNames are");
		for(String shopName : shopNames){
			System.out.println(shopName);
		}
		
	}
	public static boolean updateShopName(String newShopName , String oldShopName){
		boolean isShopNameUpdated = false;
		for(int floor=0; floor<shopNames.length; floor++){
			if(shopNames[floor] == oldShopName){
				shopNames[floor] = newShopName;
				isShopNameUpdated = true;
				break;
			}
		}
		if(isShopNameUpdated == false) System.out.println(oldShopName + "not found");
		return isShopNameUpdated;
	}
	public static boolean deleteShopName(String shopName){
		System.out.println("deleteShopName started");
		boolean isShopNameDeleted = false;
		int index , newIndex;
		for(index =0,newIndex=0; index<shopNames.length; index++){
			String existingShopName = shopNames[index];
			if(existingShopName !=shopName){
				shopNames[newIndex++] = existingShopName;
			}else{
				isShopNameDeleted = true;
			}
			
		}
			shopNames = Arrays.copyOf(shopNames , newIndex);
			return isShopNameDeleted;
	}
}