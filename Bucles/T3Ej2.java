package Tema3;

import java.util.Scanner;

public class T3Ej2 {
	public static void main(String[] args) {
		int numero = 1;
		int max = 0;
		int min = 1000;
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("Dime un entero");

			numero = scanner.nextInt();
			if (numero > max && numero >= 100 && numero <= 300) {
				max = numero;

			}

			if (numero < min && numero >= 100 && numero <= 300) {
				min = numero;

			}

		} while (numero >= 0);
		System.out.println("Numero maximo = " + max);
		System.out.println("Numero minimo = " + min);

	}

}
