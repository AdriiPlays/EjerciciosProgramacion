package Primera_Evaluaccion;

public class T1Ej23 {

    public static void main(String[] args) {
        int velocidad = 140;
        boolean alcoholemia = true;
        boolean drogas = false;
        int velocidadMaxima = 120;

        if (alcoholemia == true || drogas == true || velocidad > velocidadMaxima) {
            System.out.println("Acabas de recibir una multa");

        } else {
            System.out.println("Te has librado");
        }
    }

}
