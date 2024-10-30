import java.util.Scanner;

public class T3Ej12 {

    public static void main(String[] args) {
        int calificacion;
        int contadorSus = 0;
        int contadorApro = 0;
        for (int i = 0; i < 11; i++) {
            System.out.println("Dime una califacion");
            Scanner scanner = new Scanner(System.in);
            calificacion = scanner.nextInt();
            if (calificacion < 5) {
                contadorSus++;

            } else if (calificacion > 5) {
                contadorApro++;
                
            }

        }
        System.out.println("En total hay " + contadorSus + " supensos y " + contadorApro + " aprobados"  );
    }

}
