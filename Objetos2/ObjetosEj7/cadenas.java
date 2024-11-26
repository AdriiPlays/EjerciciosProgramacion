package ObjetosEj7;

public class cadenas {
	String a;
	String b;
	
	public cadenas(String a, String b) {
		this.a = a;
		this.b = b;
	}
	
	public String cambinarCadenas() {
		
		int longitudA = a.length();
		int longitudB = b.length();
		
		if (longitudA > longitudB) {
			return b + a + b;
			
		} else {
			return a+b+a;
		}
		
		
		
	}
	

}
