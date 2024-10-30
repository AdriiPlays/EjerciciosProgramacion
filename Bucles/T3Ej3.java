package Tema3;

import java.util.Scanner;

public class T3Ej3 {
	public static void main(String[] args) {
		int numero = 0;
		int sigiente = 0;
		int contador = 0;
		int suma = 0;
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("Dime un entero positivo");
			numero = scanner.nextInt();
			if (numero > 0) {

				contador++;
				suma = numero + sigiente;
				sigiente = numero;

			}

		} while (numero >= 0);
		System.out.println("La media de los numeros es ");
		System.out.println(suma / contador);

	}

}
