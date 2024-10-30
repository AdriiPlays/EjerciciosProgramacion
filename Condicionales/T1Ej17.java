package Primera_Evaluaccion;

import java.util.Scanner;

public class T1Ej17 {

    public static void main(String[] args) {
        char caracter;
        boolean validador;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime una letra");
        caracter = scanner.next().charAt(0);
        int numero = (char) caracter;
        if (numero >= 97 && numero <= 122) {
            validador = true;
            System.out.println(validador);

        } else {
            validador = false;
            System.out.println(validador);

        }

    }

}
