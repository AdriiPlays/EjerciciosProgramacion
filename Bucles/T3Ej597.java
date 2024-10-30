import java.util.ArrayList;

public class T3Ej597 {
    public static void main(String[] args) {

        int numeroPersonasCola = (int) (Math.random() * 10) + 1;
        ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
        int contador = 0;

        System.out.println(numeroPersonasCola + " personas han cogido un numero");

        for (int i = 0; i < numeroPersonasCola; i++) {
            int numerosAleatorios = (int) (Math.random() * 10) + 1;

            if (listaNumeros.contains(numerosAleatorios)) {

            } else {
                listaNumeros.add(numerosAleatorios);
            }

        }
        for (int i = 1; i < listaNumeros.size(); i++) {
            if (listaNumeros.get(i) < listaNumeros.get(i - 1)) {
                contador++;
            }
        }
        System.out.println(listaNumeros);

        System.out.println("Se han colado " + contador + " personas");
    }
}
