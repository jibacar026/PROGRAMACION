package tema2;

import java.util.Scanner;

public class ejercicio04 {

	public static void main(String[] args) {
		// Realiza un conversor de Kb a Mb
		Scanner sc = new Scanner(System.in);
		System.out.print("introduzca los kb: ");
		int kb = sc.nextInt();
		double mb = (double)kb/1024;
		System.out.print("resultado de mb: "+mb);
	
		

	}

}
