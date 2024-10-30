package Primera_Evaluaccion;

import java.util.Scanner;

public class T1Ej16 {

    public static void main(String[] args) {
        Boolean numeroValido;
        int numero;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime un numero");
        numero = scanner.nextInt();
        if (numero < 100 && numero <200) {
            numeroValido = true;
            System.out.println(numeroValido);

        }
    }

}
