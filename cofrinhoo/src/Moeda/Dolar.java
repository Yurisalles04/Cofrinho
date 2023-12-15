package Moeda;

//aqui temos a classe da moeda dolar
//vemos que aqui tambem utilizamos o (static), 
//O atributo estático valorDaMoeda é uma variável que pertence à classe dolar em vez de pertencer a instâncias individuais dessa classe.
public class Dolar {
	
	public static double valorDaMoeda = 4.81;
	// uilizei a cotação atual de hoje dia 17/07/2023
	public double conveterReal(double moeda) {
		return moeda * valorDaMoeda;
    }
}