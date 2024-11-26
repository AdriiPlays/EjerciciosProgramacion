package ObjetosEj5;

public class MitadDeCadena {

	public String MitadDeCadena(String cadena) {

		if (cadena.length() % 2 == 0) {

			int mitad = cadena.length() / 2;
			return cadena.substring(0, mitad);
		} else {
			return "Error: La cadena debe tener longitud par.";
		}

	}

}
