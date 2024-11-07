package Tema3;

public class T3Ej17 {
	public static void main(String[] args) {

	}

	public static boolean esPalindromo(String a) {
		String invertido = "";

		for (int i = a.length() - 1; i >= 0; i--) {

			invertido += a.charAt(i);
		}

		if (a.equals(invertido)) {
			return true;

		} else {
			return false;
		}

	}

}
