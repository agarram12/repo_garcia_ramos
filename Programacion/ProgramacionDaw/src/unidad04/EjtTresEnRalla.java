package unidad04;

import java.util.Arrays;
import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

public class EjtTresEnRalla {
	static String[][] tablero = new String[3][3];
		final static String PLAYER_X	= "X";
		final static String PLAYER_O	= "O";
	public static void main(String[] args) {
		//TODO: Controlar la victoria de los jugadores 
		//TODO: Controlar si hay espacios libres
		boolean ganaPlayer1 = false;
		boolean ganaPlayer2 = false;
		boolean hayHuecos = true;
		boolean casillaOcupada = false;
		String player = PLAYER_X;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bienvenido al 3 en raya");
		Arrays.fill(tablero[0], StringUtils.EMPTY);
		Arrays.fill(tablero[1], StringUtils.EMPTY);
		Arrays.fill(tablero[2], StringUtils.EMPTY);
		System.out.println("Introduce una posición libre del tablero");
		do {
			int huecosLibres = mostrarTablero();
			int numPlayer = player.equals(PLAYER_X) ? 1 : 2;
			System.out.printf("Turno del player %d\n", numPlayer);
			System.out.println("Introduce una posición libre del tablero");
			String jugada = scanner.nextLine();
			int fila = 0;
			int col = 0;
			if (jugada.matches("[ABCabc][123]")) {
				fila = Integer.parseInt(jugada.substring(1)) - 1;
				String colString = jugada.substring(0, 1);
				// colString.matches("[Aa]");
				// StringUtils.equalsIgnoreCase(colString, "a");
				if ("A".equals(colString) || "a".equals(colString)) {
					col = 0;
				} else if ("B".equals(colString) || "b".equals(colString)) {
					col = 1;
				} else if ("C".equals(colString) || "c".equals(colString)) {
					col = 2;
				}
				if (StringUtils.EMPTY.equals(tablero[fila][col])) {
					tablero[fila][col] = player;
					boolean ganador = false;
					int contadorCol = 0;
					int contadorFila = 0;
					int contadorDiaPrin = 0;
					int contadorDiaSec = 0;
					while (!ganador) {
						// compruebo la fila
						for (int i = 0; i < tablero.length; i++) {
							if (tablero[i][col] == player) {
								contadorCol++;
							}
							if (tablero[fila][i] == player) {
								contadorFila++;
							}
							// estamos en la diagonal principal
							if (fila == col) {
								
							}
							// estamos en la diagonal secundaria
							if (fila == tablero[0].length - fila - 1) {
								if (tablero[i][tablero[0].length - i - 1]) {
									
								}
							}
						}
					}
				} else {
					// El jugador introduce un valor correcto pero está ocupada
					casillaOcupada = true;
				}
			} else if (jugada.matches("[123][ABCabc]")) {

			} else {
				System.err.println("Entrada inválida, debe introducir una jugada como \"letranumero\" o \"numeroletra\"");
			} 
			if (casillaOcupada) {
				System.err.println("\nLa casilla está ocupada");
			}
			player = cambioJugador(player);
		} while (!ganaPlayer1 && !ganaPlayer2 && hayHuecos);

	}

	/**
	 * Cambia el jugador
	 * @param player
	 * @return
	 */
	private static String cambioJugador(String player) {
		if (PLAYER_X.equals(player)) {
			player = PLAYER_O;
		} else {
			player = PLAYER_X;
		}
		return player;
	}

	/**
	 * Muestra
	 */
	private static int mostrarTablero() {
		int huecosLibres = 0;
		System.out.println("a\t b\t c");
		for (int i = 0; i < tablero.length; i++) {
			System.out.print("|");
			for (int j = 0; j < tablero[0].length; j++) {
				if (j == tablero[0].length - 1) {
					System.out.print(tablero[i][j]);
				} else {
					System.out.print(tablero[i][j] + "\t");
				}
				if (StringUtils.EMPTY.equals(tablero[i][j])) {
					huecosLibres++;
				}
			}
			System.out.print("|");
			System.out.print("\n");
			}
		return huecosLibres;
		}

}