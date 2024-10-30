import java.util.Scanner;

public class T3Ej9 {
    public static void main(String[] args) {
        int n;
        int suma = 0;
        System.out.println("Dime un numero");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            suma += i;
           i++;
        }
        System.out.println("La suma de los primeros " + n + " números es: " + suma);
    }
    
}
