package Tema4;

public class T4Ej2 {
	public static void main(String[] args) {
		rangoValores(10, 20, false);
		
	}
	
	public static void rangoValores( int numero1, int numero2, boolean boleano) {
		if (boleano == true) {
			for (int i = numero1; i < numero2+1 ; i++) {
				System.out.println(i);
				
				
			}
			
		}else {
			for (int i = numero1+1; i < numero2 ; i++) {
				System.out.println(i);
			
		}
		
	}
}
}
