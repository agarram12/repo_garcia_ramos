package ejerciciosprogramacion;

public class ejercicio2 {
	public static void main(String[] args) {
		int contador = 1;
		for (int i = 100; i >= 0; i-=1) {
			System.out.print(i+",");
			contador++;
			if (contador == 3) {
				i=i-1;
				contador = 0;
			}
		}
	}
}
