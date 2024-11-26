package ObjetosEj1;

class Etiqueta {
	
    private String etiqueta;
    private String palabra;

    public Etiqueta(String etiqueta, String palabra) {
        this.etiqueta = etiqueta;
        this.palabra = palabra;
    }

   
    public String crearEtiqueta() {
        return "<" + this.etiqueta + ">" + this.palabra + "</" + this.etiqueta + ">";
    }
}