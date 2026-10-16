import java.util.Scanner;

public class NumeroPartido {
    public static void main(String[] args) {
        String num;
        int posicion;
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, introduzca un número entero positivo: ");
        num = sc.next();

        System.out.print("Introduzca la posición a partir de la cual quiere partir el número: ");
        posicion = sc.nextInt();

        String num1 = num.substring(0, posicion - 1);
        String num2 = num.substring(posicion - 1);

        System.out.println("Los números partidos son el " + num1 + " y el " + num2);

        sc.close();
    }
}