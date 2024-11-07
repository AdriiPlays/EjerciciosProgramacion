package Tema3;

public class T3Ej18 {
	public static void main(String[] args) {

	}

	public static Integer posicionLetra(String a, char b) {
		for (int i = 0; i < a.length(); i++) {

			if (a.charAt(i) == b) {
				return i;
			}

		}
		return -1;

	}

}
