public class BankAccount {
	
	//Variable Declaration
	protected String firstName, lastName, accountNumber;
	protected double currentBalance;
	
	//Accessors or getters
	
	public String getFirstName() {return this.firstName;}
	public String getLastName() {return this.lastName;}
	public String getAccountNumber() {return this.accountNumber;}
	public double getCurrentBalance() {return this.currentBalance;}
	
	//Mutators or setters
	public void setFirstName(String temp) {this.firstName = temp;}
	public void setLastName(String temp) {this.lastName = temp;}
	public void setAccountNumber(String temp) {this.accountNumber = temp;}
	public void setCurrentBalance(double temp) {this.currentBalance = temp;}
	
	
	//Default Constructor
	public BankAccount() 
	{
		this.firstName = " ";   		this.lastName = " ";
		this.accountNumber = null;  	this.currentBalance = 100.00;
	}
	
	//Constructor with set parameters
	public BankAccount(String s1, String s2, String s3, double d1) 
	{
		this.firstName = s1; 			this.lastName = s2;
		this.accountNumber = s3;		this.currentBalance = d1;
	}
	
	/*public void Display() 
	{
		String msg = "Client First Name: " + this.firstName + "\nClient Last Name: " + this.lastName +
				     "\nClient Account Number: " + this.accountNumber + "\nClient's Bank Balance: " + String.format("%.2f", this.currentBalance);
		System.out.println(msg);
	}*/
	
	
}
