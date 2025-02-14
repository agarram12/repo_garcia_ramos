package unidad05;

public class TestAnimal {

	public static void main(String[] args) {
		Gato felix = new Gato("Barbate");
		felix.maulla();
		System.out.println(felix.toString());
		System.out.println("----------------");
		Pinguino pingu = new Pinguino("Polo norte");
		pingu.pesca();
		pingu.poneHuevo();
		pingu.grazna();	
		System.out.println(pingu.toString());
	}
}