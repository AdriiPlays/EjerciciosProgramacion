package Primera_Evaluaccion;

import java.util.Scanner;

public class T1Ej8 {

    public static void main(String[] args) {
        //Ejercicio 8
        System.out.println("Dime cual es el numero 1");
        Scanner scanner7 = new Scanner(System.in);
        int primerNumero = scanner7.nextInt();
        System.out.println("Dime cual es el numero 2");
        Scanner scanner8 = new Scanner(System.in);
        int segundoNumero = scanner8.nextInt();
        System.out.println("La media es " + (primerNumero + segundoNumero / 2));
    }

}
