package unidad02;
/*
 * Introduciendo un año de nacimiento el programa dirá en que etapa está
 * bebe: 0-2 años
 * niño/a: 3-11 años
 * adolescente: 12-18 años
 * adulto 19-65 años
 * 
 */
import java.util.Scanner;
public class EtapaVital {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int edad;
		System.out.print("Introduce tu edad: ");
		edad = scan.nextInt();
		if (edad < 0) {
			System.err.println("ERROR, introduce una edad mayor a 0.");
		} else if (edad <= 2) {
			System.out.println("Eres un bebe");
		}  else if (edad <= 11) {
			System.out.println("Eres un niño/a.");
		}  else if (edad <= 18) {
			System.out.println("Eres un adolescente.");
		} else if (edad <= 65) {
			System.out.println("Eres un adulto.");
		} else {
			System.out.println("Eres un anciano.");
		}
		scan.close();
	}

}
