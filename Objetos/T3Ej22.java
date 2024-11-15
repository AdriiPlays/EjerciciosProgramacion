package Tema3;

import java.util.Scanner;

public class T3Ej22 {
	public static void main(String[] args) {
		int intentos = 0;
		String palabra;
		char letraPuesta;
		String otraPalabra;
		System.out.println("Dime la palabra secreta");
		Scanner scanner = new Scanner(System.in);
		palabra = scanner.nextLine().toLowerCase();
		System.out.flush();
		char[] palabraOculta = new char[palabra.length()];

		System.out.println("La palabra secreta es asi de larga");

		for (int i = 0; i < palabra.length(); i++) {
			palabraOculta[i] = '_';
		}

		System.out.print("Palabra oculta: ");
		for (int i = 0; i < palabraOculta.length; i++) {
			System.out.print(palabraOculta[i] + " ");
		}
		System.out.println(" ");

		while (intentos < 7) {
			System.out.println("Dime una letra");
			otraPalabra = scanner.nextLine();
			letraPuesta = otraPalabra.charAt(0);
			boolean letraEncontrada = false;

			for (int i = 0; i < palabra.length(); i++) {
				if (palabra.charAt(i) == letraPuesta) {

					palabraOculta[i] = letraPuesta;
					letraEncontrada = true;
				}
			}

			System.out.print("Palabra oculta: ");
			for (int i = 0; i < palabraOculta.length; i++) {
				System.out.print(palabraOculta[i] + " ");
			}
			 if (String.valueOf(palabraOculta).equals(palabra)) {
				 System.out.println(" ");
	                System.out.println("¡Felicidades, has adivinado la palabra!");
	                break;  
	            }

			intentos++;

		}
		
		if (intentos == 7) {
			System.out.println(" ");
			System.out.println("Game Over, intentalo la proxima vez");
			
		}

	}
}
