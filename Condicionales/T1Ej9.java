package Primera_Evaluaccion;

import java.util.Scanner;

public class T1Ej9 {

    public static void main(String[] args) {
        //Ejercicio 9
        System.out.println("Dime el Radio de la circunferencia");
        Scanner scanner9 = new Scanner(System.in);
        int radio = scanner9.nextInt();
        double longitud = 2 * Math.PI * radio;
        double area = Math.PI * radio * radio;
        System.out.println("La longitud es" + " " + longitud);
        System.out.println("El Area es" + " " + area);
    }
}
