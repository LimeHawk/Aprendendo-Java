import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.Employee;




public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// List cria a lista list
		// <Employee> ? o tipo da lista
		// new Arraylist<>() cria o tipo de list array tornando mais facil filtrar informa??es da prorpia lista
		List<Employee> list = new ArrayList<>();
		
		// Lendo as informa??es
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		for (int i = 0 ;i<n;i++) {
			System.out.println("Emplyoee #" + (i + 1) + ":");
			System.out.println();
			System.out.println("ID: ");
			Integer id = sc.nextInt();
			
			// Impedindo a repeti??o dos ID
			while (hasId(list, id)) {
				System.out.print("Id already taken. Try again: ");
				id = sc.nextInt();
			}
			
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			//Adicionando na lista um objeto employee com suas informa??es
			list.add(new Employee(id,name,salary));
		}
		
		// Mudando o salario do funcionario com o ID especifico
		
		System.out.println();
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		
		// Employee emp est? criando um objeto com as caracteristicas da igualdade
		// list.stream transforma a lista ? um tipo stream, permitindo a execu??o de fun??es dentro da mesma
		// .filter ? uma fun??o que filtra na lista pelas condi??es e retornos dentro do paranteses ()
		//.findFirst() pega o primeiro que aparacer na lista
		//.orElse() retorna o valor que ta dentro do parenteses, nesse caso retorna nulo (null)
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		
		if (emp == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}
		
		// Listando funcionarios
		
		System.out.println();
		System.out.println("List of employees:");
		for (Employee obj : list) {
			System.out.println(obj);
		}
		
		// for (Employee classe obj objeto dessa classe : (compara com) list (enquanto a lista existir) 
		
		sc.close();
	}
	
	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}
