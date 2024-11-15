package Tema3;

public class T3Ej21 {
    public static void main(String[] args) {
System.out.println(remplazarVocales("Paco tiene un barco", 'e'));
    }
    
    public static String remplazarVocales(String a, char b) {
        String noVocal = "";
        
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            
            if (esVocal(c)) {
                noVocal += b;
            } else {
                noVocal += c;
            }
        }
        
        return noVocal;
    }

    public static boolean esVocal(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
    