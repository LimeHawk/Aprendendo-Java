import java.util.Locale;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a coluna: ");
		int m = sc.nextInt();
		System.out.println("Digite a linha: ");
		int n = sc.nextInt();
		
		int[][] mat = new int[m][n];
		
		for (int i = 0 ; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length;j++) {
				System.out.printf("mat[%d][%d] :%n ",i,j);
				mat[i][j] = sc.nextInt();
			}
		}
		
		/*
		for (int i = 0 ; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length;j++) {
				System.out.printf(" " + mat[i][j] + " " );
			}
			System.out.println();
		}
		 */
		
		System.out.println("Digite um numero: ");
		int numero = sc.nextInt();
		
		for (int i = 0 ; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length;j++) {
				if (numero == mat[i][j]){
					System.out.printf("Position : " + i + "," + j + "%n");
					if (j > 0) {
						System.out.printf(" Left : %d%n ",mat[i][j-1]);
					} 
					if (i > 0 ) {
						System.out.printf("Up: %d%n ",mat[i-1][j]);
					} 
					if (j < mat[i].length-1) {
						System.out.printf(" Right: %d%n ",mat[i][j+1]);
					}
					if (i < mat.length-1) {
						System.out.printf("Down: %d%n ",mat[i+1][j]);
					}
				}
			}
		}	
				
		
		sc.close();
	}

	
}
