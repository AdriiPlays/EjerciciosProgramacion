package Primera_Evaluaccion;

import java.util.Scanner;

public class T1Ej20 {
    public static void main(String[] args) {
        int segundos;
        int horas;
        int minutos;
         System.out.println("Dime el numero de segundos");
        Scanner scanner = new Scanner(System.in);
        segundos = scanner.nextInt();
        minutos = segundos / 60;
        System.out.println("Numero de minutos " + minutos);
        horas = minutos / 60;
         System.out.println("Numero de horas " + horas);
        
    }
    
}
