package Primera_Evaluaccion;

import java.util.Scanner;

public class T1Ej13 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime una letra");
        char letra = scanner.next().charAt(0);
        int numero = (char) letra;
        int numeroFinal = numero - 32;
        char letraFinal = (char) numeroFinal;
        System.out.println("La letra es " + letra);
        System.out.println("La letra convertida en numero es " + numero);
        System.out.println("El numero - 32 es " + numeroFinal);
        System.out.println("La letra final es " + letraFinal);

    }

}
