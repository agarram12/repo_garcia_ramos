//package unidad05;
//
//import java.util.Arrays;
//import java.util.Objects;
//
//public class Carta {
//	//Atributos
//	private String palo;
//	private String numero;
//	
//	// Constructores
//	public Carta(String palo, String numero) {
//		this.palo = palo;
//		this.numero = numero;
//	}
//	public Carta() {
//		this.palo = "oros";
//		this.numero = "2";
//	}
//	// getters y setters
//
//	/**
//	 * @return the palo
//	 */
//	public String getPalo() {
//		return this.palo;
//	}
//
//	/**
//	 * @return the numero
//	 */
//	public String getNumero() {
//		return this.numero;
//	}
//
//	// métodos
//	@Override
//	public String toString() {
//		StringBuilder builder = new StringBuilder();
//		builder.append(this.numero).append(" ").append(this.palo);
//		return builder.toString();
//	}
//	@Override
//	public int hashCode() {
//		return Objects.hash(numero, palo);
//	}
//
//	public boolean equals(Carta carta) {
//		boolean igualPalo = this.palo.equalsIgnoreCase(carta.getPalo());
//		boolean igualNumero = this.numero.equalsIgnoreCase(carta.getNumero());
//		return igualPalo && igualNumero;
//	}
//	/**
//	 * Devuelve true si la carta pasada por parámetro es mayor que la actual
//	 * orden establecido:
//	 * oros > copas > espadas > bastos
//	 * A > K > Q > J > 10 > ... > 2
//	 * @param carta
//	 * @return
//	 */
//	public boolean mayorCarta (Carta carta) {
//		Carta mayorCarta = this;
//		if (this.palo.equalsIgnoreCase(carta.getPalo())) {
//			
//			int indiceThis = calculaIndice(ORDEN_NUMEROS, this.numero);
//			int indiceOtra = calculaIndice(ORDEN_PALOS, carta.getNumero());
//			mayorCarta = indiceThis < indiceOtra ? carta : this;
//		} else {
//			int indiceThis = calculaIndice(ORDEN_PALOS, this.palo.toUpperCase());
//			int indiceOtra = Arrays.binarySearch(ORDEN_NUMEROS, this.numero.toUpperCase());
//			mayorCarta = indiceThis < indiceOtra ? this : carta;
//		}
//		return false;
//	}
//	private int calculaIndice(String[] orden, String datos) {
//		boolean encontrado = false;
//		int indice = 0;
//		int indiceRecorrido = 0;
//		while (!encontrado) {
//			if (orden[indice].equals(datos)) {
//				indice = indiceRecorrido;
//				encontrado = true;
//			}
//			indiceRecorrido++;
//		}
//		return indice;
//	}
//		public Carta[] crearBaraja() {
//			Carta[] baraja = new Carta[NUM_CARTAS];
//			int indiceBaraja = 0;
//			for (int i = 0; i < ORDEN_PALOS.length; i++) {
//				for (int j = 0; j < ORDEN_NUMEROS.length; j++) {
//					Carta c = new Carta(ORDEN_PALOS[i], ORDEN_NUMEROS[j]);
//					// meter carta en próximo indice
//					baraja[indiceBaraja++] = c;
//				}
//			}
//			return baraja;
//	}
//		
//}