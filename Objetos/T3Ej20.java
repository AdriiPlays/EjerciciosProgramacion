package Tema3;

public class T3Ej20 {
	public static void main(String[] args) {
		
	}
	
	public static String eliminarVocales(String a) {
		String noVocal = "";
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) != 'a' && a.charAt(i) != 'e' && a.charAt(i) != 'i' && a.charAt(i) != 'o' && a.charAt(i) != 'u') {
				
				noVocal += a.charAt(i);			}
			
		}
		return noVocal;
		
	}

}
