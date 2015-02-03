//Account class

public class Account
	{
		
		private String name;//instance variable
		private double balance;//second instance variable
		
		//constructor
		public Account(String name, double balance)
		{
			this.name = name;
			
			//check for balance to be > 0.0
			if(balance > 0.0)
				{
					this.balance = balance;
				}
			
		}
		
		//method to deposit the amount
		public void deposit(double depositAmount)
		{
			if(depositAmount > 0.0)
				{
					balance = balance + depositAmount;
				}
			
		}
		
		//method to withdraw some money
		public void withdraw(double withdrawAmount)
		{
			while(this.balance > 0.0)
				{
					balance = balance - withdrawAmount;
				}
			
		}
		
		//get the balance
		public double getBalance()
		{
			return balance;
			
		}
		
		//setter method
		public void setName(String name)
		{
			this.name = name;
			
		}
		
		//getter method
		public String getName()
		{
			return name;
			
		}
		

	}
