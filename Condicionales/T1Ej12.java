package Primera_Evaluaccion;

import java.util.Scanner;

public class T1Ej12 {

    public static void main(String[] args) {
        System.out.println("Dime un numero");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        if (numero % 2 == 0) {
            System.out.println("El Numero " + numero+ " es par");

        } else {
            System.out.println("El Numero " + numero+ " es impar");
        }

    }

}
