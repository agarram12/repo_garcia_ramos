package com.Alvaro.tarea2;

public class UtilidadesMatematicas {
	public static int PosicionDeDigito(int numero) {
			while (numero / 10 != 0) {
				numero = numero / 10;
			}
			return numero;
	}
//	public static int trozoDeNumero(int num, int inic, int fin) {
//		
//	}
	public static int JuntaNumero(int primerNum, int segundoNum) {
		int digitos = 0;
		int cantidadDigitos = segundoNum;
		while (cantidadDigitos > 0) {
			cantidadDigitos /= 10;
			digitos++;
		}
		return primerNum * (int) Math.pow(10, digitos) + segundoNum;
	}
	public static long Factorial(int numeroFactorial) {
		long factorizar = 1;
		for (int i = 2; i <= numeroFactorial; i++) {
			factorizar *= i;
		}
		return factorizar;
	}
	public static void CambioExacto(double cambio) {
		//demasiado codigo
		int bill500 = 0;
		int bill200 = 0;
		int bill100 = 0;
		int bill50 = 0;
		int bill20 = 0;
		int bill10 = 0;
		int bill5 = 0;
		int mon2 = 0;
		int mon1 = 0;
		double mon050 = 0;
		double mon020 = 0;
		double mon010 = 0;
		double mon005 = 0;
		double mon002 = 0;
		double mon001 = 0;
		 while (cambio >= 0.01) {
	            if (cambio >= 500) {
	            	cambio -= 500; bill500++;
	            } else if (cambio >= 200) {
	            	cambio -= 200; bill200++; 
	            } else if (cambio >= 100) {
	            	cambio -= 100; bill100++; 
	            } else if (cambio >= 50) {
	            	cambio -= 50; bill50++; 
	            } else if (cambio >= 20) { 
	            	cambio -= 20; bill20++; 
	            }
	            else if (cambio >= 10) {
	            	cambio -= 10; bill10++; 
	            }
	            else if (cambio >= 5) {
	            	cambio -= 5; bill5++; 
	            }
	            else if (cambio >= 2) { 
	            	cambio -= 2; mon2++; 
	            }
	            else if (cambio >= 1) {
	            	cambio -= 1; mon1++; 
	            }
	            else if (cambio >= 0.50) {
	            	cambio -= 0.50; mon050++; 
	            }
	            else if (cambio >= 0.20) {
	            	cambio -= 0.20; mon020++; 
	            }
	            else if (cambio >= 0.10) {
	            	cambio -= 0.10; mon010++;
	            }
	            else if (cambio >= 0.05) {
	            	cambio -= 0.05; mon005++; 
	            }
	            else if (cambio >= 0.02) {
	            	cambio -= 0.02; mon002++; 
	            }
	            else if (cambio >= 0.01) {
	            	cambio -= 0.01; mon001++; 
	            }
		 }
		 if (bill500 > 0) System.out.println("Necesitas " + bill500 + " de 500€");
	        if (bill200 > 0) System.out.println("Necesitas " + bill200 + " de 200€");
	        if (bill100 > 0) System.out.println("Necesitas " + bill100 + " de 100€");
	        if (bill50 > 0) System.out.println("Necesitas " + bill50 + " de 50€");
	        if (bill20 > 0) System.out.println("Necesitas " + bill20 + " de 20€");
	        if (bill10 > 0) System.out.println("Necesitas " + bill10 + " de 10€");
	        if (bill5 > 0) System.out.println("Necesitas " + bill5 + " de 5€");
	        if (mon2 > 0) System.out.println("Necesitas " + mon2 + " de 2€");
	        if (mon1 > 0) System.out.println("Necesitas " + mon1 + " de 1€");
	        if (mon050 > 0) System.out.println("Necesitas " + mon050 + " de 0.50€");
	        if (mon020 > 0) System.out.println("Necesitas " + mon020 + " de 0.20€");
	        if (mon010 > 0) System.out.println("Necesitas " + mon010 + " de 0.10€");
	        if (mon005 > 0) System.out.println("Necesitas " + mon005 + " de 0.05€");
	        if (mon002 > 0) System.out.println("Necesitas " + mon002 + " de 0.02€");
	        if (mon001 > 0) System.out.println("Necesitas " + mon001 + " de 0.01€");
	}
}
