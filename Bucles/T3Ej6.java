import java.util.Scanner;

public class T3Ej6 {
    public static void main(String[] args) {
        int numeroSecreto;
        int numero = 0;
        int contador = 0;
        System.out.println("Hola Usuario1, Dime un numero del 1 al 100");
        Scanner scanner = new Scanner(System.in);
        numeroSecreto = scanner.nextInt();
        if (numeroSecreto > 100 || numeroSecreto < 1) {
            System.out.println("Error, el numero introducido es erroneo");
            
        } else{
            while (numero != numeroSecreto && numero != -1) {
                System.out.println("Dime cual creees que es el numero");
                numero = scanner.nextInt();
                contador++;
                if (numero != numeroSecreto && numero > numeroSecreto) {
                    System.out.println("Numero Incorrecto, El numero buscado es mas pequeño");
                    
                    
                } else if (numero != numeroSecreto && numero < numeroSecreto) {
                    System.out.println("Numero Incorrecto, El numero buscado es mas grande");
                    
                } 
                
                
            }

            if (numero == numeroSecreto) {
                System.out.println("Felicidades! Has encontrado el " + numeroSecreto + " en " + contador + " intentos" );

            } else {
                System.out.println("Te rendiste");
            }



        }

        
    }

    
}