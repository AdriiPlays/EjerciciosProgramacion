package Tema3;

public class T3Ej19 {
	public static void main(String[] args) {
		
	}
	
	public static boolean contieneCadena(String a, char b) {
	for (int i = 0; i < a.length(); i++) {
		if (a.charAt(i) == b) {
			return true;
			
		} else {
			return false;
		}
		
	}
	return false;
}
}