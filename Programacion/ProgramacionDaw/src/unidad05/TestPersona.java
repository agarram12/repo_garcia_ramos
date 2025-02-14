package unidad05;

public class TestPersona {

	public static void main(String[] args) {
		Persona persona1 = new Persona("Álvaro", 18, 'H', 60f, 1.74f);
		System.out.println(persona1);
		persona1.calcularImc();

	}

}