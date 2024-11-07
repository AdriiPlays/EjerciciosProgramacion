package Tema3;

public class T3Ej12 {
	public static void main(String[] args) {
		
	}
	public static String subcadena (String a, int numero, int numero2)
	{
		String subcadena = null;
		for (int i = numero-1; i < numero2; i++) {
			 subcadena += a.charAt(i);
			
		}
		return subcadena;
		
		
	}

}
