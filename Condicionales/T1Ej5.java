package Primera_Evaluaccion;

import java.util.Scanner;

public class T1Ej5 {

    public static void main(String[] args) {

        //Ejercicio 5
        System.out.println("Dime tu edad y te dire cuanto queda para que cumplas 18 años");
        Scanner scanner4 = new Scanner(System.in);
        int edad2 = scanner4.nextInt();
        int edadRestante = 18 - edad2;
        if (edad2 >= 18) {
            System.out.println("Ya tienes 18 años o mas");
        } else {
            System.out.println("Te quedan " + edadRestante + " años para tener 18 años");
        }
    }

}
