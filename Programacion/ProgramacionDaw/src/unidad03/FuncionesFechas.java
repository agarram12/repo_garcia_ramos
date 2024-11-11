package unidad03;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FuncionesFechas {
	
	public static String obtenerDiaSemana (Calendar fecha) {
		String dia = "";
		switch (fecha.get(Calendar.DAY_OF_WEEK)) {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "lunes";
			break;
		case 3:
			dia = "martes";
			break;
		case 4:
			dia = "miércoles";
			break;
		case 5:
			dia = "jueves";
			break;
		case 6:
			dia = "viernes";
			break;
		case 7:
			dia = "sábado";
			break;

		default:
			break;
		}
		return dia;
	}
	public static String obtenerDiaSemana (Date fecha) {
		Calendar fechaCal = Calendar.getInstance();
		fechaCal.setTime(fecha);
		String dia = obtenerDiaSemana(fechaCal);
		return dia;
	}
	/*
	 * Devuelve true si la fecha del primer parametro es anterior a la introducida
	 */
	public static boolean esFechaPasada(Date fecha, Date fechaReferencia) {
		return fecha.before(fechaReferencia);
	}
	/*
	 * Devuelve true si la fecha del primer parametro es anterior al segundo
	 */
	public static boolean esFechaPasadaCal (Calendar fecha, Calendar fechaReferencia) {
		return fecha.before(fechaReferencia);
	}
	/*
	 * Básicamente, return es para "finalizar / parar" el método, lo suyo es hacer todo el cálculo
	 * Tras ello, ENTONCES aplicar return.
	 * Así tendremos solo uno
	 */
	public static boolean esBisiesto (int anio) {
		boolean esBisiesto = false;
		if (anio % 400 == 0 || (anio % 4 == 0 && anio % 100 != 0)) {
			esBisiesto = true;
		}
		return esBisiesto;
	}
	public static String formatoFecha(Date fecha, String formato) {
		SimpleDateFormat sdf = new SimpleDateFormat(formato);
		String fechaFormateada = sdf.format(fecha);
		return fechaFormateada;

	}
	public static String formatoFecha(Calendar fecha, String formato) {
		int dia = fecha.get(Calendar.DAY_OF_WEEK);
		int mes = fecha.get(Calendar.DAY_OF_MONTH);
		return formatoFecha(fecha.getTime(), formato);
		
	}
	
}
