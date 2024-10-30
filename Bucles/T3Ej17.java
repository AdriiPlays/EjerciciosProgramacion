
/* revisar codigo, esta mal */


import java.util.Scanner;

public class T3Ej17 {
public static void main(String[] args) {
    int n;
    int factorial = 0;
    System.out.println("Dime un numero");
    Scanner scanner = new Scanner(System.in);
    n = scanner.nextInt();
    for (int i = 2; i < n; i++) {
        factorial = i*n;
        
    }
    System.out.println("El factorial de " + n + " es " + factorial);
    
}

}
