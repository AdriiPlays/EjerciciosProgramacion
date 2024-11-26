package ObjetosEj2;

public class Delimitador {
	
	  private String salida;

	  


	    public Delimitador(String salida) {
		this.salida = salida;
	}





		public String encerrarPalabra(String palabra) {
	    
	        int longitudSalida = this.salida.length();
	        
	     
	        if (longitudSalida == 4) {
	           
	            String inicio = this.salida.substring(0, 2);
	            String fin = this.salida.substring(2);
	            
	    
	            return inicio + palabra + fin;
	        } else {
	      
	            return "Error: La cadena de salida debe tener longitud 4.";
	        }
	    }
	}