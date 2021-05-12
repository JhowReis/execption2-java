package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account data: ");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.println("Initial balance: ");
		double balance = sc.nextInt();
		System.out.println("Withdraw limit: ");
		double withdrawLimit  = sc.nextInt();
		
		Account acc = new Account(number, holder, balance, withdrawLimit);
		
		
		
		
		sc.close();

	}

}
