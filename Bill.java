 public class  Bill{
	 
	 private double billAmount;
	 private int billId;
	 private String billName;
	 private boolean isBillPaid;
	 private String billAddress;
	 
	 System.out.println("bill cons is invoked");
	 
	 public void setBillAmount(double billAmount){
		this.billAmount= billAmount;
	 }
	 public double getBillAmount(){
		 return billAmount;
	 }
	 public void setBillId(int billId){
		     this.billId   = billId;
	 }
	 public int getBillId(){
		 return billId;
	 }
	 public void setBillName(String billName){
		   this.billName =billName;
	 }
	 public String getBillName(){
		 return billName;
	 }
	 public void setIsBillPaid(boolean isBillPaid){
		       this.isBillPaid =isBillPaid;
	 }
	 public boolean getIsBillPaid(){
		 return isBillPaid;
	 }
	 public void setBillAddress(String billAddress){
		 this.billAddress = billAddress;
	 }
	 public String getBillAddress(){
		 return billAddress;
	 }
 }