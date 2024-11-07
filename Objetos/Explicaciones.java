package Tema3;

import java.util.Scanner;

public class Explicaciones {
	public static void main(String[] args) {
		String s;
		s = new String("Adrian");

		for (int i = 0; i < s.length(); i++) {

			System.out.println(s.charAt(i));

		}
		String cadena1;
		String cadena2;
		System.out.println("dame una cadena");
		Scanner scanner = new Scanner(System.in);
		cadena1 = scanner.nextLine();
		System.out.println("dame otra cadena");
		cadena2 = scanner.nextLine();
		System.out.println("Cadena1" + cadena1);
		System.out.println("Cadena2" + cadena2);
		
		if (cadena1.equals(cadena2)) {
			System.out.println("Son iguales");
			
		} else {
			System.out.println("SON DIFERENTES");
		}
		
		String numero = String.valueOf(19991);
	}

}
