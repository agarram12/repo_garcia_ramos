package unidad02;

import java.util.Scanner;

public class PiedraPapelTijeras {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int jugador = 0;
		int maquina = 0;
		boolean empate = false;
		boolean entradaCorrecta = true;
			do {
				System.out.println("1-Piedra \n2-Papel \n3-Tijeras");
				System.out.print("Elige una opción: ");
				jugador = scan.nextInt();
				maquina = (int)(Math.random()*3)+1;
				if (jugador != 1 && jugador != 2 && jugador != 3) {
					entradaCorrecta = false;
				} else if (jugador == maquina){
					System.out.println("\n¡Empate!\n");
					empate = true;
				} else if (jugador == 1 && maquina == 3) {
					System.out.println("¡Gana el jugador!");
					empate = false;
				} else if (jugador == 2 && maquina == 1){
					System.out.println("¡Gana el jugador!");
					empate = false;
				} else if (jugador == 3 && maquina == 2){
					System.out.println("¡Gana el jugador!");
					empate = false;
				} else {
					empate = false;
					if (maquina == 1) {
						System.err.println("¡Gana la máquina con Piedra!");
					} else if (maquina == 2) {
						System.err.println("¡Gana la máquina con Papel!");
					} else if (maquina == 3) {
						System.err.println("¡Gana la máquina con Tijeras!");
					}
				}
			} while (empate || !entradaCorrecta);
			scan.close();
	}
}