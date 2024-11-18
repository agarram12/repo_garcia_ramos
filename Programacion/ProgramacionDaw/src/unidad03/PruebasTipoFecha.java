package unidad03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PruebasTipoFecha {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String dni = "55410044P";
		System.out.println(FuncionesMatematicas.compruebaNif(dni));
		Date fecha = new Date();
		System.out.println(FuncionesFechas.formatoFecha(fecha, "'Hoy es la fecha: 'dd/MM/yyyy"));
		Date fechaActual = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String fechaString = scan.nextLine();
		
		// Date fechaUsuario = sdf.parse(fechaString);
		System.out.println(fechaActual);
		long milisegFechaAct = fechaActual.getTime();
		System.out.println("Milisec: " + milisegFechaAct);
		long anio = 1000l * 60 * 60 * 24 * 365;
		long anios = milisegFechaAct / anio;
		System.out.println("años: " + anios);
		
		long diezAnios = 10l * anio;
		Date fecha1970 = new Date(1l);
		fecha1970.setTime(fecha1970.getTime() + diezAnios);
		System.out.println(fecha1970);
		
		if (fechaActual.equals(fecha1970)) {
			System.out.println("Las fechas son iguales");
		}	
	}
	public static Date convierteCadenaAFecha(String cadenaFecha, String formato) {
		SimpleDateFormat sdf = new SimpleDateFormat(formato);
		Date fechaOut = null;
		try {
			fechaOut = sdf.parse(cadenaFecha);
		} catch (ParseException e) {
			System.err.println("El formato de la fecha es incorrecto");
		}
		return fechaOut;
	}
}
