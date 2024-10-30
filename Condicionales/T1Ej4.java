package Primera_Evaluaccion;

import java.util.Scanner;

public class T1Ej4 {

    public static void main(String[] args) {
        //Ejercicio 4 
        System.out.println("Dime tu edad");
        Scanner scanner3 = new Scanner(System.in);
        int edad = scanner3.nextInt();
        System.out.println("El proximo año tendras " + edad++ + " Años");
    }
}
