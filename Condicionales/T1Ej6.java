package Primera_Evaluaccion;

import java.util.Scanner;

public class T1Ej6 {

    public static void main(String[] args) {
        //Ejercicio 6
        System.out.println("Dime en que año estamos");
        Scanner scanner5 = new Scanner(System.in);
        int añoactual = scanner5.nextInt();
        System.out.println("Dime en que año naciste");
        Scanner scanner6 = new Scanner(System.in);
        int añoNacimiento = scanner6.nextInt();
        int añosActuales = añoactual - añoNacimiento;
        System.out.println("Tienes actualmente " + añosActuales + " Años");
    }
}
