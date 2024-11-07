package Tema3;

public class T3Ej16 {
	public static void main(String[] args) {
		invertirCadena("asd");
	}
	
public static String invertirCadena (String a) {
	String invertido = "";
	
	for (int i = a.length() -1; i >= 0; i--) {
		
		invertido += a.charAt(i);
	}
	System.out.println(invertido);
	return invertido;
	
	
	
}
}
