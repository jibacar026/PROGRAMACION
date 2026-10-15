package tema3;

import java.util.Scanner;

public class diapo07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numero1 = (int) (Math.random()*10); 
		int numero2 = (int) (Math.random()*10);
		int resultadoCorrecto = numero1 + numero2;
		
		System.out.println("¿Qué es "+numero1+" + "+numero2+"?");
		
	    int resultadoUsuario = sc.nextInt();
		if(resultadoCorrecto == resultadoUsuario) {
			System.out.println("Has acertado");
		} else {
			
			System.out.println("No has acertado, el resultado correcto seria "+resultadoCorrecto);
			
		}
		
		
		
		
		
		
	}

}
