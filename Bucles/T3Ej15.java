import java.util.Scanner;

public class T3Ej15 {
    public static void main(String[] args) {
        
        String binario;
        int decimal;
        System.out.println("Dime un numero binario");
        Scanner scanner = new Scanner(System.in);
        binario = scanner.nextLine();
        decimal=Integer.parseInt(binario,2);
        System.out.println(decimal);
    }
}
   