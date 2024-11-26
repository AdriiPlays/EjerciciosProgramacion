package ObjetosEj3;

import java.util.Iterator;

public class main {

	public static void main(String[] args) {
		System.out.println(finalExtra("Hola"));
		
	}
		
		public static String finalExtra(String palabra) {
		
		int longitud = palabra.length();
		String ultimosDos = palabra.substring(longitud -2);
		return ultimosDos + ultimosDos + ultimosDos;
			
		}
	

	}


