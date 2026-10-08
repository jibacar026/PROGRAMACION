package tema2;

import java.util.Scanner;

public class ejercicio02 {

	public static void main(String[] args) {
		// Escribe un programa que calcule el volumen de un cono según la fórmula V = volumen cono
        Scanner sc = new Scanner(System.in);
        System.out.print("introduzca altura del cono en cm: ");
        double altura = sc.nextDouble();
        System.out.print("introduzca el radio del cono en cm: ");
        double radio = sc.nextDouble();
        double volumen = (Math.PI * Math.pow(radio, 2) * altura) /3;

        System.out.println("El volumen es "+ volumen + " cm3");
        
	}

}
