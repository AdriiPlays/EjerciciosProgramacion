package Tema4;

import java.util.Iterator;

public class T4Ej8 {
	public static void main(String[] args) {
		muestraPares(20);

	}

	public static void muestraPares(int numero) {
		for (int i = 1; i < numero; i++) {
			if (i % 2 == 0) {
				System.out.println(i);

			}

		}

	}

}
