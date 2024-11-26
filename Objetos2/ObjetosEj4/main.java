package ObjetosEj4;

public class main {

	public static void main(String[] args) {
		
		System.out.println(primerosDos("Hola"));


	}
	
	public static String primerosDos (String palabra) {
	
	int longitud = palabra.length();
	String primerosCaracteres = "";
	if (longitud == 1) {
		primerosCaracteres = palabra.substring(1);
		
	} else if (longitud == 0) {
		primerosCaracteres = "";
		
	} else if (longitud > 2) {
		primerosCaracteres = palabra.substring(0, 2);
	}
	
	return primerosCaracteres;
		
	} 

}
