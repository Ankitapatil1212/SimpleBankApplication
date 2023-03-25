package SimpleBankApplication;

import java.util.Scanner;
class BankAccount
{
	int balance=10000;
	int previousTransaction;
	String CustomerName;
	String CustomerId;
	
	public BankAccount(String cName, String cId) 
	{
		this.CustomerName=cName;
		this.CustomerId=cId;
	}
	void deposit(int amount)
	{
		if(amount != 0)
		{
			balance = balance + amount;
			previousTransaction = amount;
		}
	}
	void withdraw(int amount)
	{
		if(amount != 0)
		{
			balance = balance - amount;
			previousTransaction = -amount;
			
		}
	}
	void getPreviousTransaction()
	{
		if(previousTransaction > 0)
		{
			System.out.println("Deposited: "+previousTransaction);
		}
		else if(previousTransaction < 0)
		{
			System.out.println("Withdraw: "+previousTransaction);
		}
		else
		{
			System.out.println("No transaction occured");
		}
	}
	
	void show()
	{
		char option='\0';
		Scanner sc=new Scanner(System.in);
		System.out.println("******BANKING APPLICATION SYSTEM******");
		System.out.println("Welcome "+CustomerName);
		System.out.println("Your ID is "+CustomerId);
		System.out.println("\n");
		System.out.println("A. Check Balance");
		System.out.println("B. Deposit");
		System.out.println("C. Withdraw");
		System.out.println("D. Previous transaction");
		System.out.println("E. Exit");
		
		do
		{
			System.out.println("==========================================================");
			System.out.println("Enter an option");
			System.out.println("==========================================================");
			option=sc.next().charAt(0);
			System.out.println("\n");
			
			
			switch (option) 
			{
			case 'A': 
			     System.out.println("------------------------------");
			     System.out.println("Balance = "+balance);
			     System.out.println("------------------------------");
			     System.out.println("\n");
			     break;
			case 'B': 
			     System.out.println("------------------------------");
			     System.out.println("Enter an amount to deposit:");
			     System.out.println("------------------------------");
			     int amount=sc.nextInt();
			     deposit(amount);
			     System.out.println("\n");
			     break;
			case 'C': 
			     System.out.println("------------------------------");
			     System.out.println("Enter an amount to withdraw:");
			     System.out.println("------------------------------");
			     int amount2=sc.nextInt();
			     withdraw(amount2);
			     System.out.println("\n");
			     break;
			case 'D': 
			     System.out.println("------------------------------");
			     getPreviousTransaction();
			     System.out.println("------------------------------");
			     System.out.println("\n");
			     break;
			case 'E':
				System.out.println("***********************************");
				break;
			
			default:
				System.out.println("Invalid Option!!.Please enter again");
				break;
			}
			
		}while(option !='E');
		
		   System.out.println("ThankYou for using our services");
		}
   } 

public class BankingApplication 
{

	public static void main(String[] args) 
	{
		BankAccount ba=new BankAccount("Ankita", "I100");
		ba.show();

	}

}


