import java.util.Scanner;

public class AccountTest
	{

		public static void main(String[] args)
			{
				//Account objects
				Account account01 = new Account("Batman", 100000.00);
				Account account02 = new Account("Superman", 200000.00);
				
				//display initial value of each object
				System.out.printf("%n %s account01 has value: $%.2f %n", account01.getName(), account01.getBalance());
				System.out.printf(" %s account02 has value: $%.2f %n%n", account02.getName(), account02.getBalance());
				
				Scanner input = new Scanner(System.in);
				
				//deposit in account01
				System.out.print("Enter the amount to deposit in account01: ");
				double depositAmount = input.nextDouble(); //user input
				System.out.printf("Now adding %.2f to %s account01 %n", depositAmount, account01.getName());
				account01.deposit(depositAmount);
				
				//display name and balances again
				System.out.printf("%n %s account01 has value: $%.2f %n", account01.getName(), account01.getBalance());
				System.out.printf(" %s account02 has value: $%.2f %n%n", account02.getName(), account02.getBalance());
				
				//deposit in account02
				System.out.print("Enter the amount to deposit in account02: ");
				depositAmount = input.nextDouble(); //user input
				System.out.printf("Now adding %.2f to %s account02 %n", depositAmount, account02.getName());
				account02.deposit(depositAmount);
				
				//display name and balances again
				System.out.printf("%n %s account01 has value: $%.2f %n", account01.getName(), account01.getBalance());
				System.out.printf(" %s account02 has value: $%.2f %n%n", account02.getName(), account02.getBalance());
				
				

			}

	}
