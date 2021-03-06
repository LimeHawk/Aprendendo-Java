import java.util.Locale;
import java.util.Scanner;

import Entities.Student;


public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many rooms will be rented ?");
		int n = sc.nextInt();
		sc.nextLine();
		Student[] student = new Student [10];
		
		for (int i = 1 ; i<=n;i++) {
			System.out.printf("Rent #%d:%n",i);
			System.out.println("Name: ");
			
			String name = sc.nextLine();
			System.out.println("E-mail: ");
			
			String email = sc.nextLine();
			System.out.println("Room: ");
			int number = sc.nextInt();
			sc.nextLine();
			student[number] = new Student(name,email);
			
			
		}
		
		System.out.println("Busy rooms: ");
		for (int i = 0;i<student.length;i++) {
			if(student[i] != null) {
				System.out.println(i + ": " + student[i] );
			}
				
		}
		
		sc.close();
	}
}
