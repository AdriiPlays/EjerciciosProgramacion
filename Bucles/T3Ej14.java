import java.util.Scanner;

public class T3Ej14 {

    public static void main(String[] args) {
        int numero;
        int binario;
        System.out.println("Dime un numero decimal");
        Scanner scanner =  new Scanner(System.in);
        int DIVISOR = 2;
    for (int i = numero, j = 0; i > 0; i /= DIVISOR, j++) {
        binario = i % DIVISOR;
        binario += binario * Math.pow(10, j);
    }
    return binario;
}
        
    }

