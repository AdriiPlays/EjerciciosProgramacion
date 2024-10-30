import java.util.Scanner;

public class T3Ej16 {
    public static void main(String[] args) {
        int n;
        System.out.println("Dime un numero");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        System.out.println("Los números primos entre 1 y " + n + " son");

        for (int i = 2; i <= n; i++) {
            if (esPrimo(i)) {
                System.out.println(i);
            }
        }

    }

    public static boolean esPrimo(int numero) {
        if (numero < 2) {

        }
        for (int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
