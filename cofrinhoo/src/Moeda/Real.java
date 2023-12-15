package Moeda;

// aqui temos a classe da moeda real 
// vemos que aqui tambem utilizamos o (static), 
//O atributo estático valorDaMoeda é uma variável que pertence à classe Real em vez de pertencer a instâncias individuais dessa classe.
public class Real {
	public static int valorDaMoeda = 1;
	
	public double conveterReal(double moeda) {
		return moeda * valorDaMoeda;
    }
}