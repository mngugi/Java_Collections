//Private class modifier

class Bank_Acct{
	private String CName= "Dan Joe";
	private String Cemail= "dan.joe@gmail.com";
	private String Address= "PO Box 555 Mombasa";
	private int age= 32;
	//private double phoneNumber = 254733777214;
		
public static void main(String[] args){
	
	Bank_Acct obj = new Bank_Acct();
	System.out.println("Name: " + obj.CName);

}
}