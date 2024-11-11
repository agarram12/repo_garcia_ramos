package unidad03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("""
				usa el siguiente formato: dd-MM-yyyy
				Introduce tu fecha de cumpleaños: 
				""");
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		String input = scan.nextLine();
		if (input.length() != 10) {
			System.err.println("El formato introducido no es el indicado.");
		} else {
			try {
				Date fechaNacDate = sdf.parse(input);
				// forma para pasar date a calendar
				Calendar fechaAct = Calendar.getInstance();
				
				// crear nuevo calendar
				Calendar fechaNac = Calendar.getInstance();
				// Establecer fecha de nacimiento
				fechaNac.setTime(fechaNacDate);
				// Establecemos el año actual a la fecha de nacimiento
				Calendar fechaCumple = fechaNac;
				fechaCumple.set(Calendar.YEAR, fechaAct.get(Calendar.YEAR));
				if (fechaCumple.before(fechaAct)) {
					// el cumple de este año ya pasó
					fechaCumple.add(Calendar.YEAR, 1);
				}
				
				long milis = fechaCumple.getTimeInMillis() - fechaAct.getTimeInMillis();
				int dias = (int) (milis / (1000l * 60 * 60 * 24));
				System.out.printf("Quedan %d días para tú próximo cumpleaños", dias);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			
		}
	}

}
