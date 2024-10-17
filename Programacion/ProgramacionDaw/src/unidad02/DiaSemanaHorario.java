package unidad02;

import java.util.Scanner;

public class DiaSemanaHorario {

	public static void main(String[] args) {
		final String ENDES = "Entornos de desarrollo";
		final String PROG = "Programación";
		final String BBDD = "Bases de datos";
		final String LGMS = "Lenguaje de Marcas";
		final String LUNES = "LUNES";
		final String MARTES = "MARTES";
		final String MIERC_TILE = "MIÉRCOLES";
		final String MIERC = "MIERCOLES";
		final String JUEV = "JUEVES";
		final String VIER = "VIERNES";
		Scanner scan = new Scanner(System.in);
		System.out.println("Decir qué hay a primera hora en el día de la semana.");
		System.out.print("Introduce un día de la semana: ");
		String input = scan.nextLine().toUpperCase();
		scan.close();
		String materia = "";
		boolean finde = false;
		boolean correcto = true;
		switch (input) {
		case LUNES:
			materia = ENDES;
			input = LUNES;
			break;
		case "MARTES":
			System.out.println("Los " + input + " hay Programación a primera hora.");
			break;
		case "MIERCOLES":
			System.out.println("Los " + input + " hay Bases de Datos a primera hora.");
			break;
		case "JUEVES":
			System.out.println("Los " + input + " hay Lenguaje de Marcas a primera hora.");
			break;
		case "VIERNES":
			System.out.println("Los " + input + " hay Programación a primera hora.");
			break;
		default:
			correcto = false;
			break;
		}
		if (!finde && correcto) {
			System.out.println("Los " + input + " hay " + materia + " a primera hora.");
		} else if (correcto) {
			System.out.println("Los fines de semana no hay clase.");
		} else if (!correcto) {
			System.err.println("¡Debes introducir un día de la semana!");
		}
	}
}
