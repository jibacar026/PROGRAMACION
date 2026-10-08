package tema2;

import java.util.Scanner;

public class ejercicio01 {

	public static void main(String[] args) {
		//Escribe un programa que calcule el salario semanal de un empleado en base a las horas trabajadas, a razón de 12 euros la hora
		
		Scanner sc = new Scanner(System.in);
		int precioHora=12;
		System.out.print("Introduzca las horas trabajadas a la semama: ");
		int horas = sc.nextInt();
		System.out.println("Salario semanal: " + precioHora*horas +"€");
	}

}
