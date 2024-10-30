import java.util.Scanner;

public class T3Ej10 {
    public static void main(String[] args) {
        int numero;
        System.out.println("Dime un numero comprendido entre el 1 y el 10");
        Scanner scanner = new Scanner(System.in);
        numero = scanner.nextInt();
        if (numero > 10 && numero < 1) {
            System.out.println("Error al introducir el numero");
            
        }
        for (int i = 0; i < 1001; i++) {
            System.out.println(numero + " X " + i + " = " + numero*i );
            
        }
    }

    
}