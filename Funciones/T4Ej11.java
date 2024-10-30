package Tema4;

public class T4Ej11 {
	public static void main(String[] args) {
		sonSimilares(144, 10);

	}

	public static boolean sonSimilares(int numero1, int numero2) {
		String numero3 = Integer.toString(numero1);
		String numero4 = Integer.toString(numero2);
		if (numero3.contains(numero4) || numero4.contains(numero3)) {
			System.out.println("True");
			return true;

		} else {
			System.out.println("False");
			return false;

		}

	}

}
