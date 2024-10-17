package unidad02;

import java.util.Scanner;

public class PiedraPapelTijerasBUENO {

	public static void main(String[] args) {
		final String TIJERAS = "TIJERAS";
		final String PIEDRA = "PIEDRA";
		final String PAPEL = "PAPEL";
		int opcionCPU;
		Scanner scan = new Scanner(System.in);
		
		int jugadaPlayer = -1;
		boolean empate = false;
		boolean entradaCorrecta = true;
		String salida = "";
		System.out.println("Bienvenido al juego Piedra, papel o tijeras.");
		do {
			int jugadaCpu = (int)(Math.random()*3);
			System.out.println("Elige tu opción. Escribe \"Piedra\", \"papel\" o \"tijeras\": ");
			String jugadaPlayerCadena = scan.nextLine();
			jugadaPlayerCadena = jugadaPlayerCadena.toUpperCase();
			switch (jugadaPlayerCadena) {
			case PIEDRA:
				jugadaPlayer = 0;
				if (jugadaPlayer == jugadaCpu) {
					empate = true;
				} else {
					if (jugadaCpu == 2) {
						salida = salida = "Has ganado! Tu elección fue " + PIEDRA + " y la de la CPU fue " + TIJERAS;
					} else {
						salida = "Has perdido! Tu elección fue " + PIEDRA + " y la de la CPU fue " + PAPEL;
					}
				}
				break;
			case PAPEL:
				jugadaPlayer = 0;
				if (jugadaPlayer == jugadaCpu) {
					empate = true;
				} else {
					if (jugadaCpu == 2) {
						salida = salida = "Has ganado! Tu elección fue " + PAPEL + " y la de la CPU fue " + PIEDRA;
					} else {
						salida = "Has perdido! Tu elección fue " + PAPEL + " y la de la CPU fue " + TIJERAS;
					}
				}
				break;
			case TIJERAS:
				jugadaPlayer = 0;
				if (jugadaPlayer == jugadaCpu) {
					empate = true;
				} else {
					if (jugadaCpu == 2) {
						salida = salida = "Has ganado! Tu elección fue " + TIJERAS + " y la de la CPU fue " + PAPEL;
					} else {
						salida = "Has perdido! Tu elección fue " + TIJERAS + " y la de la CPU fue " + PIEDRA;
					}
				}
				break;
			default:
				entradaCorrecta = false;
			}
		} while (entradaCorrecta);
		
	}
}