import java.util.Arrays;
class BankAc{
	static String accountNames[] ={null, null, null, null, null};
	static int index;
	public static boolean addAccountName(String accountName){
		System.out.println("addAccountName started");
		boolean isAccountNameAdded = false;
		if(accountName !=null){
			System.out.println("addAccountName will proceed");
			accountNames[index]=accountName;
			index++;
		}else{
			System.out.println("accountName is null");
		}
		System.out.println("addAccountName ended");
		return isAccountNameAdded;
		
	}
	public static void getAccountName(){
		System.out.println("getAccountName started");
		System.out.println("account names are:");
		for(String accountName : accountNames)
			System.out.println(accountName);
	}
	
	public static boolean updateAccountName(String newAccountName , String oldAccountName){
		boolean isAccountNameUpdated = false;
		for(int money = 0; money<accountNames.length;  money++){
			if(accountNames[money] == oldAccountName){
				accountNames[money] = newAccountName;
				isAccountNameUpdated = true;
				break;
			}
		}
		if(isAccountNameUpdated == false) System.out.println(oldAccountName + "not found");
		return isAccountNameUpdated;
	}
	public static boolean deleteAccountName(String accName){
		System.out.println("deleteAccountName started");
		boolean isAccountDeleted = false;
		int index , newIndex;
		for(index =0,newIndex=0; index<accountNames.length; index++){
			String existingAccountName = accountNames[index];
			if(existingAccountName !=accName){
				accountNames[newIndex] = existingAccountName;
			}else{
				isAccountDeleted = true;
			}
		}
		 accountNames = Arrays.copyOf(accountNames , newIndex);
		 return isAccountDeleted;
	}
}