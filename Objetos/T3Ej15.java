package Tema3;

public class T3Ej15 {
	public static void main(String[] args) {

	}

	public static Integer contarCaracter(String a, char b) {
		int contador = 0;
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == b) {
				contador++;
				
			}
			
		}
		return contador;
		
		
	}


	
}
