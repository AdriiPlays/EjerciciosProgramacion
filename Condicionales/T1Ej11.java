package Primera_Evaluaccion;

import java.util.Scanner;

public class T1Ej11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime tu edad");
        int edad = scanner.nextInt();
        boolean estaRango = edad >= 18 && edad <= 30;
        System.out.println("Mayor de edad " + estaRango);

    }

}
