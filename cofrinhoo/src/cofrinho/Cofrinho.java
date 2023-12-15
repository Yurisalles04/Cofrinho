package cofrinho;
// invocando o aaraylist para poder utulizar durante o projeto

import java.util.ArrayList;

// nesta classe utilizamos o conceito de herança invocando a classe de moeda logo trazendo tudo que tem nela para essa classe, assim podemos evitar um codigo muito extenso alem de ser mais limpo para os programadores

public  class Cofrinho extends Moeda{
	public static double totalMoedas;
	
	public static ArrayList<Double> arrayMoedas = new ArrayList<>();
	public static ArrayList<String> arrayTipo = new ArrayList<>();
	
	// fazendo o metodo de adionar aonde declaramos a moeda e o tipo para que ao escolher por exemplo a moeda de valor dolar ir para a classe dolar
	public static void adicionar(double moeda, String tipo) {
		arrayMoedas.add(moeda);
		arrayTipo.add(tipo);
		System.out.println("Adicionado com sucesso");
		return;
    }
	// aqui fizemos o metodo listar, utulizando o for que foi aprendido durante as aulas que eu vi tanto nesta materia quanto em python aonde as 2 duas tem semelhanças
	public static void listar() {
		for (int i = 0; i < arrayMoedas.size(); i++) {
			String result = (i + 1 ) + " - " + arrayTipo.get(i) + " - " +Double.toString(arrayMoedas.get(i));
			System.out.println(result);
        }
		return;
	}
	// aqui fizemos o metodo de remover utilizando o int opcao, pois ja que queremos remover o numero da moeda, podemos colocar int pois não tera numero quebrado
	public static void remover(int opção) {
		System.out.println(opção);
		arrayMoedas.remove(opção - 1);
		arrayTipo.remove(opção - 1);
		return;
	}
	
	// aqui temos o metodo de converter tudo em real conforme foi solicitado no trabalho, utilizando o for chamamos o arraymoedas e o arraytipos, aonde eles buscam todas as moedas em diferentes valores e converte  tudo para real, somando uma com a outra
	public static double conveter() { 

		System.out.println("Você tem: ");
		for (int i = 0; i < arrayMoedas.size(); i++) {
			totalMoedas += conveterMoeda(arrayMoedas.get(i), arrayTipo.get(i));

        }
		// e por ultimo exibimos o total moedas, utilizando um system.out.println que busca o totalmoedas
		System.out.println(totalMoedas);
		return 0;
	}

}