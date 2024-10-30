package Primera_Evaluaccion;

import java.util.Scanner;

public class T1Ej18 {

    public static void main(String[] args) {

        int nota1;
        int nota2;
        int nota3;
        System.out.println("Dime la primera nota");
        Scanner scanner = new Scanner(System.in);
        nota1 = scanner.nextInt();
        System.out.println("Dime la segunda nota");
        Scanner scanner2 = new Scanner(System.in);
        nota2 = scanner2.nextInt();
        System.out.println("Dime la tercera nota");
        Scanner scanner3 = new Scanner(System.in);
        nota3 = scanner3.nextInt();
        
        System.out.println("La nota media es " + (nota1+nota2+nota3/3));

    }

}
