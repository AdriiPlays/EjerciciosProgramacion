package ObjetosEj10;

public class pasarde {
	String cadena;

	public pasarde(String cadena) {
		this.cadena = cadena;
	}
	
	public String pasar2dere() {
		if (cadena.length() <2) {
			System.out.println("Error");
			
		} else {
			String dosfinal = cadena.substring(cadena.length()-2,cadena.length());
			String cadenaBien = cadena.substring(0,cadena.length()-2);
			return dosfinal.concat(cadenaBien);
		}
		return "";
		
	}
	

}


