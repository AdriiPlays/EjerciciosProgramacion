package Tema1;

import java.util.Scanner;

public class T1Ej15 {

    public static void main(String[] args) {
        Boolean numeroValido;
        int numero;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime un numero");
        numero = scanner.nextInt();
        numeroValido = (numero>=100 && numero<=200);
        System.out.println(numeroValido);
        
        }
    }

