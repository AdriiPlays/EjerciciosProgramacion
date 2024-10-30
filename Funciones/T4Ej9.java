package Tema4;

public class T4Ej9 {
	public static void main(String[] args) {
		numeroSegundos(10, 14, 40);
		
	}
	
	public static int numeroSegundos(int horas, int minutos, int segundos) {
		horas = horas*3600;
		minutos = minutos*60;
		int total = horas+segundos*minutos;
		return total;

	
	}

}
 