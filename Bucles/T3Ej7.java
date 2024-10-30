import java.util.Scanner;

public class T3Ej7 {
    public static void main(String[] args) {
        int multiplos;
        int n;

        System.out.println("Dime de que numero quieres ver los multiplos");
        Scanner scanner = new Scanner(System.in);
        multiplos = scanner.nextInt();
        System.out.println("Dime un rano de 1 a n");
        n = scanner.nextInt();

        for (int i = 1; i <=n; i++) {
            if (i % multiplos == 0) { 
            System.out.println(i);
        }
            
        }
        
    }

    
}