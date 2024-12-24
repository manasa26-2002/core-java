class BankAcTester{
public static void main(String [] args){
boolean isAccountNameAdded= BankAc.addAccountName("savings account");
System.out.println("isAccountNameAdded:"+isAccountNameAdded);

isAccountNameAdded= BankAc.addAccountName("salary account");
System.out.println("isAccountNameAdded:"+isAccountNameAdded);

isAccountNameAdded= BankAc.addAccountName("fixed deposit account");
System.out.println("isAccountNameAdded:"+isAccountNameAdded);

isAccountNameAdded= BankAc.addAccountName("nri account");
System.out.println("isAccountNameAdded:"+isAccountNameAdded);

isAccountNameAdded= BankAc.addAccountName("recuring deposit account");
System.out.println("isAccountNameAdded:"+isAccountNameAdded);

BankAc.getAccountName();

boolean isAccountUpdated = BankAc.updateAccountName("current account" , "nri account");
System.out.println("isAccountUpdated : " +isAccountUpdated);

BankAc.getAccountName();

boolean isDeleted = BankAc.deleteAccountName("recuring deposit account");

BankAc.getAccountName();

System.out.println("main ended");

}

}