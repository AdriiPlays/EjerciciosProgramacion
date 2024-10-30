package Primera_Evaluaccion;

import java.util.Scanner;

public class T1Ej24 {

    public static void main(String[] args) {
        int numeroCorrecto = 6;
        int numeroUno;
        int numeroDos;
        boolean verificador;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Cual es el numero 1?");
        numeroUno = scanner.nextInt();
        System.out.println("Cual es el numero 2?");
        numeroDos = scanner.nextInt();
        if (numeroUno + numeroDos == 6 || numeroUno == 6 || numeroDos == 6 || numeroUno - numeroDos == 6) {
            verificador = true;
            System.out.println(verificador);
            

        }else{
            verificador = false;
            System.out.println(verificador);
        }
    }

}
