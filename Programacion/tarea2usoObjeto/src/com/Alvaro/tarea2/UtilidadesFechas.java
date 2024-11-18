package com.Alvaro.tarea2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class UtilidadesFechas {
	public static int calcularEdad(Calendar fechaNac) {
		int edad = 0;
		Calendar fechaAct= Calendar.getInstance();
		edad = fechaAct.get(Calendar.YEAR) - fechaNac.get(Calendar.YEAR);
		  if (fechaAct.get(Calendar.MONTH) < fechaNac.get(Calendar.MONTH) || (fechaAct.get(Calendar.MONTH) == fechaNac.get(Calendar.MONTH) && fechaAct.get(Calendar.DAY_OF_MONTH) < fechaNac.get(Calendar.DAY_OF_MONTH))) {
			  edad--;
		  }
		  return edad;
	}
	public static String obtenerMes(Calendar fecha) {
		String mesNombre = "";
		switch (fecha.get(Calendar.MONTH)) {
		case 0:
			mesNombre = "Enero";
			break;
		case 1:
			mesNombre = "Febrero";
			break;
		case 2:
			mesNombre = "Marzo";
			break;
		case 3:
			mesNombre = "Abril";
			break;
		case 4:
			mesNombre = "Mayo";
			break;
		case 5:
			mesNombre = "Junio";
			break;
		case 6:
			mesNombre = "Julio";
			break;
		case 7:
			mesNombre = "Agosto";
			break;
		case 8:
			mesNombre = "Septiembre";
			break;
		case 9:
			mesNombre = "Octubre";
			break;
		case 10:
			mesNombre = "Noviembre";
			break;
		case 11:
			mesNombre = "Diciembre";
			break;

		default:
			System.out.println("La fecha introducida no es valida");
			break;
		}
		return mesNombre;
	}
	public static Date formateaFechaDate(String fechaTexto, String formato) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat(formato);
		return sdf.parse(fechaTexto);
	}
	public static Calendar formateaFechaCalendar(String fechaTexto, String formato) throws ParseException {
		Date fecha = formateaFechaDate(fechaTexto, formato);
		Calendar fechaCalendar = Calendar.getInstance();
		fechaCalendar.setTime(fecha);
		return fechaCalendar;
	}
	public static LocalDate formateaFechaLocalDate(String fechaTexto, String formato) throws ParseException {
		DateTimeFormatter formateoLD = DateTimeFormatter.ofPattern(formato);
		return LocalDate.parse(fechaTexto, formateoLD);
	}
	public static boolean compruebaFecha(Date fecha, Date fechaReferencia) {
		return fecha.before(fechaReferencia);
	}
}
