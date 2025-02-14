package unidad05;

import unidad05Excepciones.DadoNoPermitidoException;

public class TestDado {
	public static void main(String[] args) {
		try {
			Dado dadoCuatro = new Dado((short) 4);
			System.out.println(dadoCuatro);
			dadoCuatro.lanzar();
			dadoCuatro.lanzar();
			dadoCuatro.lanzar();
			dadoCuatro.lanzar();
			dadoCuatro.lanzar();
			dadoCuatro.lanzar();
			dadoCuatro.lanzar();
			dadoCuatro.lanzar();
			dadoCuatro.lanzar();
			System.out.println(dadoCuatro);
		} catch (DadoNoPermitidoException e) {
			System.out.println(e.getMessage());
		}

	}

}