package Primera_Evaluaccion;

import java.util.Scanner;

public class T1Ej21 {

    public static void main(String[] args) {
        int hormigas;
        int patasHormigas = 6;
        int arañas;
        int patasArañas = 8;
        int cochinillas;
        int patasCochinillas = 14;
        System.out.println("¿Cuantas hormigas has capturado?");
        Scanner scanner1 = new Scanner(System.in);
        hormigas = scanner1.nextInt();
        System.out.println("¿Cuantas arañas has capturado?");
        Scanner scanner2 = new Scanner(System.in);
        arañas = scanner2.nextInt();
        System.out.println("¿Cuantas cochinillas has capturado?");
        Scanner scanner3 = new Scanner(System.in);
        cochinillas = scanner3.nextInt();

        int patasTotalesHormigas = hormigas * patasHormigas;
        int patasTotalesArañas = arañas * patasArañas;
        int patasTotalesCochinillas = cochinillas * patasCochinillas;
        System.out.println("Patas totales de Hormigas " + patasTotalesHormigas);
        System.out.println("Patas totales de Arañas " + patasTotalesArañas);
        System.out.println("Patas totales de Cochinillas " + patasTotalesCochinillas);
        System.out.println("Patas totales " + (patasTotalesArañas+patasTotalesHormigas+patasTotalesCochinillas));
    }
}
