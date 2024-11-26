package ObjetosEj9;

public class pasariz {
	
	String cadena;

	public pasariz(String cadena) {
		this.cadena = cadena;
	}
	
	public String pasar2izquierda() {
		if (cadena.length() <2) {
			System.out.println("Error");
			
		} else {
			String dosPrimeros = cadena.substring(0,2);
			String cadenaBien = cadena.substring(2,cadena.length());
			return cadenaBien.concat(dosPrimeros);
		}
		return "";
		
	}
	

}
