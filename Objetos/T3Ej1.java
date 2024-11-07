package Tema3;

public class T3Ej1 {
	public static void main(String[] args) {
		
	}
	
	public static int caracteristicaCarcater(char caracter) {
		if (Character.isDigit(caracter)) {
			return 1;
			
		} else if (Character.isLowerCase(caracter)) {
			return 2;
			
		}else if (Character.isUpperCase(caracter)) {
			return 3;
			
		} else if (Character.isWhitespace(caracter)) {
			return 4;
			
		} else if (!Character.isLetterOrDigit(caracter)) {
			return 5;
			
		}
		return 0;
		
	}

}
