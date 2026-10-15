public class Quiniela {

    public static void main(String[] args) {
        int i = 1;
        int numero;

        System.out.println("Quiniela al azar");

        while (i <= 15) {
            numero = (int) (Math.random() * 6) + 1;

            System.out.print("Partido " + i + ":[");

            if (numero >= 1 && numero <= 3) {
                System.out.print("1");
            } else if (numero == 4 || numero == 5) {
                System.out.print("X");
            } else {
                System.out.print("2");
            }

            System.out.println("]");
            i++;
        }
    }
}