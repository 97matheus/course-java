package view;

import java.util.Scanner;

import modelo.Account;

public class Program_Bank {

	public static void main(String[] args) {
		Account account;
		char response = 'y';
		Scanner sc = new Scanner(System.in);
		
		do {
		System.out.println("-=-=-=-=-=-=-=-=-=--==-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("");
		System.out.println("Enter account number: ");
		int number = sc.nextInt();
		System.out.println("Enter account holder: ");
		String holder = sc.next();
		System.out.println("Is there an initial deposit? (Y/N)");
		char choice = sc.next().charAt(0);
		if (choice == 'y') {
			System.out.println("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit);
		}
		else {
			account = new Account(number, holder);
			System.out.println("");
		}
		
		System.out.println("Account data: ");
		System.out.println(account);
		System.out.println("");
		System.out.println("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		
		System.out.println("Updated account Data: ");
		System.out.println(account);
		System.out.println("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("");
		System.out.println("Updated account Data: ");
		System.out.println(account);
		System.out.println("");
		System.out.println("Do you wish to continue? (Y/N)");
		response = sc.next().charAt(0);
		
		}while(response != 'n');
	
		System.out.println();
		System.out.println("END XXX");
		
		sc.close();
	
	}

}
