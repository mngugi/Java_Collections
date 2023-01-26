//Private class modifier

class Bank_Acct{
	private String CName= "Dan Joe";
	private String Cemail= "dan.joe@gmail.com";
	private String Address= "PO Box 555 Mombasa";
	private int age= 32;
	private String phoneNumber = "+254733777214";
		
public static void main(String[] args){
	
	Bank_Acct obj = new Bank_Acct();
	System.out.println("Name: " + obj.CName);
	System.out.println("Email: " + obj.Cemail);
	System.out.println("Address: " + obj.Address);
	System.out.println("Age: " + obj.age);
	System.out.println("Mobile:"  + obj.phoneNumber);

}
}