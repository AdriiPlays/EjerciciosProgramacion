package Tema4;

public class T4Ej11 {
	public static void main(String[] args) {
		sonSimilares(144, 10);
		System.out.println(sonSimilares2(1234, 3));

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

	public static boolean contieneDigito(int n1, int digito) {
		while (n1 != 0) {
			if (n1 % 10 == digito) {
				return true;

			}
			n1 = n1 / 10;

		}
		return false;

	}

	public static boolean sonSimilares2(int n1, int n2) {
		
int aux;
if (n2>n1) {
	aux= n1;
	n1 = n2;
	n2=aux;
}
	

		while (n2 != 0) {
			if (contieneDigito(n1, n2%10) == false) {
				
			n2 = n2/10;
			return true;
			
			
		}

		return true;

	}
		return false;
	}
}
