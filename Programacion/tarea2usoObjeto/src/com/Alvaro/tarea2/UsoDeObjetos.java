package com.Alvaro.tarea2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class UsoDeObjetos {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("**Introduce un número para ver la primera cifra: ");
		int numero = 57846;
		System.out.println("La primera cifra del número " + numero + " es: " + UtilidadesMatematicas.PosicionDeDigito(numero));
		System.out.println("**Juntar dos números");
		int primerNum = 23;
		int segundoNum = 50;
		System.out.println("El numero eso: " + UtilidadesMatematicas.JuntaNumero(primerNum, segundoNum));
		System.out.println("**Factorizar un número");
		int numeroFactorial = 6;
		System.out.println("El resultado del número " + numeroFactorial + " de manera factorial es: " + UtilidadesMatematicas.Factorial(numeroFactorial));
		System.out.println("**Dar el mínimo cambio posible");
		double cantidad = 700.34;
		UtilidadesMatematicas.CambioExacto(cantidad);
		// Uso de objetos para las fechas
		System.out.println("**Calcular edad en base a una fecha introducida");
		Calendar fechaNac = Calendar.getInstance();
        fechaNac.set(2006, Calendar.NOVEMBER, 7);
		System.out.println("Tu edad en base a la fecha es: " + UtilidadesFechas.calcularEdad(fechaNac));
		System.out.println("**Sacar mes de una fecha dada");
		Calendar fecha = Calendar.getInstance();
		fecha.set(2009, 10 - 1, 21);
		String nombreMes = UtilidadesFechas.obtenerMes(fecha);
		System.out.println("El mes de la fecha introducida es: " + nombreMes);
		System.out.println("**A partir de una fecha y formato devolver un dato tipo fecha");
		String fechaTexto = "16.11.2024";
		String formato = "dd.MM.yyyy";
		try {
			// como Date
			SimpleDateFormat sdf = new SimpleDateFormat(formato);
			Date fechaDate = UtilidadesFechas.formateaFechaDate(fechaTexto, formato);
			System.out.println("Fecha pasada a Date: " + sdf.format(fechaDate));
			// como Calendar
			Calendar fechaCalendar = UtilidadesFechas.formateaFechaCalendar(fechaTexto, formato);
			System.out.println("Fecha como Calendar: " + fechaCalendar.get(Calendar.DAY_OF_MONTH)+ "-" + fechaCalendar.get(Calendar.MONTH) + "-" + fechaCalendar.get(Calendar.YEAR));
			// como LocalDate
			LocalDate fechaLocalDate = UtilidadesFechas.formateaFechaLocalDate(fechaTexto, formato);
			System.out.println("Fecha como LocalDate: " + fechaLocalDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Comprobar una fecha
		System.out.println("**Comprobar si una fecha es pasada");
		Date fechaReferencia = new Date();
		
		
		
	}
}
