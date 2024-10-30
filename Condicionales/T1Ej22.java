package Primera_Evaluaccion;

import java.util.Scanner;

public class T1Ej22 {

    public static void main(String[] args) {
        int numeroAvellanas;
        boolean FindeSmana;
        boolean verificador;
        

        System.out.println("Es finde semana?");
        Scanner scanner1 = new Scanner(System.in);
        FindeSmana = scanner1.nextBoolean();
        System.out.println("Cuantas avellanas hay?");
        numeroAvellanas = scanner1.nextInt();
        

        if (FindeSmana == false && numeroAvellanas >=40 && numeroAvellanas <=60) {
            verificador = true;
            System.out.println(verificador);

        }
        if (FindeSmana == false && numeroAvellanas < 40 && numeroAvellanas > 60) {
            verificador = false;
            System.out.println(verificador);

        }
        if (FindeSmana == true && numeroAvellanas > 60) {
            verificador = true;
            System.out.println(verificador);

        }
        if (FindeSmana == true && numeroAvellanas < 40) {
            verificador = false;
            System.out.println(verificador);

        }

    }
}
