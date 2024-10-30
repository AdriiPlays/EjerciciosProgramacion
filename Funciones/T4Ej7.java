package Tema4;

import java.util.Scanner;

public class T4Ej7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		boolean salir = false;
		int opcion;

		while (!salir) {

			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.println("5. Salir");

			try {

				System.out.println("Selecciona una opcion");
				opcion = scanner.nextInt();
				switch (opcion) {
				case 1:
					sumar();

					break;
				case 2:
					restar();

					break;
				case 3:
					multiplicar();

					break;
				case 4:
					dividir();

					break;
				case 5:
					salir = true;

				default:
					System.out.println("Las opciones son entre 1 y 4");

				}

			} catch (Exception e) {

			}
		}
	}

	public static void sumar() {
		System.out.println("Dime un numero");
		Scanner scanner = new Scanner(System.in);
		int numero1 = scanner.nextInt();
		System.out.println("Dime otro numero");
		int numero2 = scanner.nextInt();
		System.out.println("La suma de los numeros es " + (numero1 + numero2));

	}

	public static void restar() {
		System.out.println("Dime un numero");
		Scanner scanner = new Scanner(System.in);
		int numero1 = scanner.nextInt();
		System.out.println("Dime otro numero");
		int numero2 = scanner.nextInt();
		System.out.println("La resta de los numeros es " + (numero1 - numero2));

	}

	public static void multiplicar() {
		System.out.println("Dime un numero");
		Scanner scanner = new Scanner(System.in);
		int numero1 = scanner.nextInt();
		System.out.println("Dime otro numero");
		int numero2 = scanner.nextInt();
		System.out.println("La multiplicacion de los numeros es " + (numero1 * numero2));

	}

	public static void dividir() {
		System.out.println("Dime un numero");
		Scanner scanner = new Scanner(System.in);
		int numero1 = scanner.nextInt();
		System.out.println("Dime otro numero");
		int numero2 = scanner.nextInt();
		System.out.println("La division de los numeros es " + (numero1 / numero2));

	}

}
