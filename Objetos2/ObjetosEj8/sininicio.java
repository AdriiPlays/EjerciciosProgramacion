package ObjetosEj8;

public class sininicio {
	
	String cadena1;
	String cadena2;
	
	public sininicio(String cadena1, String cadena2) {
		this.cadena1 = cadena1;
		this.cadena2 = cadena2;
	}
	
	
	public String sinInicio() {
		
		if (cadena1.length()< 1 || cadena2.length() < 1) {
			System.out.println("Error las cadenas tienen menos de 1 caracter");
			
		} else {
			String cadena1Final = cadena1.substring(1);
			String cadena2Final = cadena2.substring(1);
			String cadenaFinal = cadena1Final.concat(cadena2Final);
			return cadenaFinal;
		}
		return "";
		
		
	}
	

}
