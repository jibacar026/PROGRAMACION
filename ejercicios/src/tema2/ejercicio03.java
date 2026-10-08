package tema2;

import java.util.Scanner;

public class ejercicio03 {

	public static void main(String[] args) {
		// Realiza un conversor de Mb a Kb.
		Scanner sc = new Scanner(System.in);
		System.out.print("introduzca los Mb: ");
		int mb = sc.nextInt();
		int kb = mb*1024;
		System.out.print("resultado en kb es: "+kb);
		

	}

}
