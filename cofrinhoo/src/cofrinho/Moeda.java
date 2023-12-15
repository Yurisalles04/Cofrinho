package cofrinho;
// invocamos novamente o arraylist
import java.util.ArrayList;

import Moeda.Real;
import Moeda.Euro;
import Moeda.Dolar;
// aqui temos uma classe abstract conforme solicitado no trabalho
abstract public  class Moeda {
	// aqui fizemos o metodo de converter a moeda, utilizando o (static), pertence a classe em vez de pertencer a instâncias individuais (objetos) dessa classe.
	
	// vale lembrar que invocamos essa classe na classe cofrinho aonde utilizamos o conceito de heranca
	
	public static double conveterMoeda(double moedas, String tipo) {
		if(tipo == "real") {
			Real real = new Real();
			real.conveterReal(moedas);
		}
		if(tipo == "dolar") {
			Dolar dolar = new Dolar();
			return dolar.conveterReal(moedas);
		}
		if(tipo == "euro") {
			Euro euro = new Euro();
			return euro.conveterReal(moedas);
		}
		return moedas;
	}
}