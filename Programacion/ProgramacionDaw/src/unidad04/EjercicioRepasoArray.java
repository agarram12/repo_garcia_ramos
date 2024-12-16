package unidad04;

import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

public class EjercicioRepasoArray {

	public static void main(String[] args) {
		//EXTRA: Parametrizar el rango de caracteres
		Scanner scan = new Scanner(System.in);
		int dimension = 1+ 'Z' - 'A';
		try {
			String input = scan.nextLine();
			
		} catch (Exception e) {
			// TODO: handle exceptionz
		}
		
		
		char caracterActual = 'A';
		for (int i = 0; i < dimension; i++) {
//			caracteres[i] = caracterActual++;
		}
		System.out.println("Mostramos los caracteres del array");
		String output = StringUtils.EMPTY;
		for (int i = 0; i < dimension; i++) {
//			output += caracteres[i];
		}
		System.out.println(output);
	}

}
