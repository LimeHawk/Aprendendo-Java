import java.util.Locale;
import java.util.Scanner;
import Entities.Account;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.println("Enter aacount number: ");
		int number = sc.nextInt();
		System.out.println("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		
		System.out.println("Is there a initial deposit (y/n)?");
		char option = sc.next().charAt(0);
		
		if (option == 'y') {
			System.out.println("Enter initial deposit value: ");
			double balance = sc.nextInt();
			account = new Account(name,balance,number);
		}else {
			account = new Account(name,number);
		}
		
		System.out.println("Account DATA: ");
		System.out.printf("Number: " + account.getCodeNumber() + ", Holder: " + account.getName() + ", Balance: $" + account.getBalance() + "%n");
		
		System.out.println("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		account.AddBalance(deposit);
		System.out.println("Updated DATA");
		System.out.printf("Number: " + account.getCodeNumber() + ", Holder: " + account.getName() + ", Balance: $" + account.getBalance() + "%n");
		
		System.out.println("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		account.SubBalance(withdraw);
		System.out.println("Updated DATA");
		System.out.printf("Number: " + account.getCodeNumber() + ", Holder: " + account.getName() + ", Balance: $" + account.getBalance() + "%n");
		
		
		
		sc.close();
	}
}
