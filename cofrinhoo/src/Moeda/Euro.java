package Moeda;

//aqui temos a classe da moeda euro 
//vemos que aqui tambem utilizamos o (static), 
//O atributo estático valorDaMoeda é uma variável que pertence à classe euro  em vez de pertencer a instâncias individuais dessa classe.

public class Euro {
	public static double valorDaMoeda = 5.40;
	// uilizei a cotação atual de hoje dia 17/07/2023
	public double conveterReal(double moeda) {
		return moeda * valorDaMoeda;
    }
}