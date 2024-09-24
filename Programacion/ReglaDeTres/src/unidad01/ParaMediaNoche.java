package unidad01;
import java.util.Scanner;

/*
 * Escribe un programa que dada una hora determinada (horas y minutos), 
 * calcule los segundos que faltan para llegar a la media noche
 * min que quedan *60
 */
public class ParaMediaNoche {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce la hora actual: ");
		int hora = scan.nextInt();
		System.out.println("Introduce los minutos actuales");
		int minutos = scan.nextInt();
		int horasParaMediaNoche = (23 - hora);
		int minutosParaMediaNoche = (60 - minutos);
		int segParaMediaNoche = horasParaMediaNoche*3600+minutosParaMediaNoche*60;
		System.out.println("Quedan " + segParaMediaNoche + " segundos para medianoche");
		scan.close();

	}

}
