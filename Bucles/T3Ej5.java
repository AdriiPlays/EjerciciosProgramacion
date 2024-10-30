package Tema3;

import java.util.Scanner;

public class T3Ej5 {
	public static void main(String[] args) {
		int numero = 10;
		int edad;
		int contador = -1;
		int suma = 0;
		int contadorMayores = 0;
		Scanner scanner = new Scanner(System.in);
		while (numero != 0) {
			System.out.println("Dime la edad de un empleado");
			contador++;
			numero = scanner.nextInt();
			edad = numero;
			suma = numero + edad;
			
			if (numero >= 18) {
				contadorMayores++;
				
			}
			

		}
		System.out.println("La suma de todas las edades es " + suma);
		System.out.println("El numero total de empleados es " + contador);
		// System.out.println("El % de mayores de edad es " + );
		System.out.println("El numero total de mayores de edad es " + contadorMayores);
	}
}
