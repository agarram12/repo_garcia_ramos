package unidad05;

import java.util.Scanner;

public class RepasoArrayInverso {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] num = new int[10];
		for (int i = 0; i < num.length; i++) {
			System.out.print("Introduce el siguiente número: ");
			num[i] = scan.nextInt();
		}
		System.out.println("Orden inverso: ");
		for (int i = num.length; i >= 0; i--) {
			System.out.println(num[i]);
		}
		scan.close();
	}
}
