package Tema4;

public class T4Ej10 {
	public static void main(String[] args) {
		intervaloTiempo(4, 30, 6, 10);

	}

	public static void intervaloTiempo(int hora1, int minuto1, int hora2, int minuto2) {
		int minutosPrimerInstante = hora1 * 60 + minuto1;
		int minutosSegundoInstante = hora2 * 60 + minuto2;

		int diferenciaMinutos = minutosSegundoInstante - minutosPrimerInstante;

		if (diferenciaMinutos < 0) {
			diferenciaMinutos += 24 * 60;
		}
		
		System.out.println(diferenciaMinutos);

	}
}