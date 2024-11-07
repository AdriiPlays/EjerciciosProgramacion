package Tema3;

public class T3Ej10 {
	//esta mal //
	public static void main(String[] args) {
		
		toCamelCase("Paco");
		
		
		
	}

	
	public static char toCamelCase(String a) {
		for (int i = 0; i < a.length(); i++) {
			
			System.out.print(a.toLowerCase().charAt(0) + a.charAt(i+1));
			
		}
		return 0;
		
	}
}
