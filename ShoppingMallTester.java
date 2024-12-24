class ShoppingMallTester{
	public static void main(String [] args){
		boolean isShopNameAdded = ShoppingMall.addShopName("h&m");
		System.out.println("isShopNameAdded:"+isShopNameAdded);
		
				 isShopNameAdded = ShoppingMall.addShopName("zara");
		System.out.println("isShopNameAdded:"+isShopNameAdded);
		
				 isShopNameAdded = ShoppingMall.addShopName("westside");
		System.out.println("isShopNameAdded:"+isShopNameAdded);
		
				 isShopNameAdded = ShoppingMall.addShopName("veramoda");
		System.out.println("isShopNameAdded:"+isShopNameAdded);
		
				 isShopNameAdded = ShoppingMall.addShopName("nykaa");
		System.out.println("isShopNameAdded:"+isShopNameAdded);
		
				 isShopNameAdded = ShoppingMall.addShopName("pantaloons");
		System.out.println("isShopNameAdded:"+isShopNameAdded);
		
				 isShopNameAdded = ShoppingMall.addShopName("decathlon");
		System.out.println("isShopNameAdded:"+isShopNameAdded);
		
				 isShopNameAdded = ShoppingMall.addShopName("trends");
		System.out.println("isShopNameAdded:"+isShopNameAdded);
		
				 isShopNameAdded = ShoppingMall.addShopName("giva");
		System.out.println("isShopNameAdded:"+isShopNameAdded);
		
			 isShopNameAdded = ShoppingMall.addShopName("peter england");
		System.out.println("isShopNameAdded:"+isShopNameAdded);
		
		ShoppingMall.getShopName();
		
		boolean updateShopName = ShoppingMall.updateShopName("samyaak" , "trends");
		System.out.println("updateShopName :" +updateShopName);
		
		ShoppingMall.getShopName();
		
		boolean isDeleted = ShoppingMall.deleteShopName("trends");
		
		ShoppingMall.getShopName();
		
		System.out.println("main ended");
		
	}
}