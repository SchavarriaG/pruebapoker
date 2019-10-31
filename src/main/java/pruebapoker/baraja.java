package pruebapoker;

public class baraja {
	private carta cartas[];
	private int cartaSig;
	
	public static final int Ncartas = 52;
	
	
	public baraja() {
		cartas = new carta[Ncartas];
		cartaSig = 0;
		crearBaraja();
		barajar();
	}
	
	private void crearBaraja() {
		String[] palos = carta.PALOS;
		String[] numeros = carta.NUMEROS;
		
		for(int i = 0; i < palos.length ; i++) {
			for(int j = 0; j < numeros.length  ; j++) {
				cartas[(i * (numeros.length - 3) + j)] = new carta(numeros[j], palos[i],j+1);
			}
		}
	}
	
	public void barajar() {
		
		int aleatorio = 0;
		carta  c;
		
		for(int i = 0; i < cartas.length ; i++) {
			aleatorio = (int)(Math.random()*52);
			c = cartas[i];
			cartas[i] = cartas[aleatorio];
			cartas[aleatorio] = c;
		}
	}
	
	public carta sigCarta() {
		carta c = cartas[cartaSig++];
		return c;
	} 
	
	public carta[] mano() {
		carta[] cartasmano = new carta[5];
		for(int i = 0; i < cartasmano.length; i++) {
			cartasmano[i] = sigCarta();
		}
		return cartas;
	}	
}
