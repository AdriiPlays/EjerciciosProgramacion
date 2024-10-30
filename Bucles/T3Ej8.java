import java.util.Scanner;

public class T3Ej8 {
    public static void main(String[] args) {
        int contador = 0;
        int suma = 0;
        int numero;

        while (contador !=10) {
            System.out.println("Dime un numero");
            Scanner scanner = new Scanner(System.in);
            numero = scanner.nextInt();
            suma = numero + suma;
            contador++;
            
        }
        System.out.println("La media es " + suma + " entre 10 lo que es igual a " + suma/10);
        
    }

    
}