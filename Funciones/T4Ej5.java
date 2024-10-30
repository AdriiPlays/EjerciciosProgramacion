package Tema4;

public class T4Ej5 {
	public static void main(String[] args) {
		
	}
	
	boolean esPrimo(int numero) {
	    for(int i=2;i<numero;i++) {
	        if(numero%i==0)
	            return false;
	    }
	    return true;
	}

}
