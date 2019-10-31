package pruebapoker;

public class carta {
	public String num;
	public String palo;
	public int valor;
	
	public static final String[] PALOS = {"C","D","H","S"};
	public static final String[] NUMEROS = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
	
	public carta (String num, String palo, int valor) {
		this.num = num;
		this.palo = palo;
		this.valor = valor;
	}
}
