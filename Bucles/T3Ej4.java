package Tema3;

import java.util.Scanner;

public class T3Ej4 {
	public static void main(String[] args) {
		int numero = 10;
		int multiplo2 = 2;
		int multiplo7 = 7;
		Scanner scanner = new Scanner(System.in);
		while (numero!=0) {
			System.out.println("Dime un numero");
			numero = scanner.nextInt();
			if (numero % multiplo2 == 0) {
				System.out.println("Es multiplo de 2");
				
			}
			if (numero % multiplo7 == 0) {
				System.out.println("Es multiplo de 7");
				
			}
			
			System.out.println("El cuadrado del numero es " + numero*numero);
			System.out.println("Su valor absoluto es " + (Math.abs(numero)));
			
			
		}
	}
}
