package Primera_Evaluaccion;

import java.util.Scanner;

public class T1Ej19 {

    public static void main(String[] args) {
        int precio;
        int iva;
        
        System.out.println("Dime el precio del producto");
        Scanner scanner = new Scanner(System.in);
        precio = scanner.nextInt();
        System.out.println("Dime el IVA del producto");
        Scanner scanner1 = new Scanner(System.in);
        iva = scanner1.nextInt();
        int totalIva =  precio*iva / 100;
        System.out.println("El precio final es " + precio+totalIva);
    }

}
