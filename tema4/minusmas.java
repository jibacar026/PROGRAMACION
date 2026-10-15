
public class Minusmas {

    public static void main(String[] args) {

        String Mayuscula = "", Minuscula ="";
        int contador = 0;
        int num = 0, numMin = 0;
        char character;

        while (contador < 5) {
            //Generamos el codigo ASCII
            numMay = (int) (65 + Math.random() * 26);
            char character = (char) num;
            // Concadenamos el caracter a la cadena

            Mayuscula = Mayuscula + character;
            //Calculamos el codigo en minusculas, sumando 32
            numMin = numMay;
            numMin = numMay + 32;
            c = (char) numMin;
            //Concadenamos el caracter en minusculas
            Minuscula = Minuscula + c;
            contador++;
        }
    //String textominuscula = Mayuscula.toLowerCase();
    System.out.println(Mayuscula);
    System.out.println(Minuscula);
        
    }
}
