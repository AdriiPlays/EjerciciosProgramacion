package Tema3;

public class T3Ej14 {
	public static void main(String[] args) {
		
	}
	
	public static Integer contarEspacios(String a) {
		
		Integer contador = 0;
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == ' ') {
				contador++;
				
				
			}
			
		}
		return contador;
		
		
	}

}
