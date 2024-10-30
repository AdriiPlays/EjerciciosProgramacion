import java.util.Scanner;

public class T3Ej11 {
    public static void main(String[] args) {
        int calificacion;
        int contador = 0;
        for (int i = 0; i < 6; i++) {
            System.out.println("Dime una califacion");
            Scanner scanner = new Scanner(System.in);
            calificacion = scanner.nextInt();
            if (calificacion < 5 ) {
                contador++;
                
            }

            
        }
        System.out.println("En total hay " + contador + " supensos");
    }

}
