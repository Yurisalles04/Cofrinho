package cofrinho;

import java.util.Scanner;

//Criei essa classe pra separar a interface da logica do projeto
public class Principal extends Cofrinho {
	public static double moeda;
	public static int opção;
	public static int tipo;
	//aqui iniciamos o projeto com o menu 
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Olá, Bem-vindo(a) ao Cofrinho YURI SALLES RU:4425098");
		menu();
		return;
	}
	
	public static void menu() throws InterruptedException  {
		//aqui temos o scanner 
		Scanner usuario = new Scanner(System.in);
		System.out.println("Digite umas das opção abaixo");
		Thread.sleep(500);
		System.out.println("1 - Adicionar moeda \n2 - Listar moeda(s) \n3 - Remover moedas \n4 - Converter tudo pra real \n5 - Sair");
		Thread.sleep(200);
		opção = usuario.nextInt();
		
		//Adicionar moedas
		if(opção == 1) {
			System.out.println("Selecione o tipo de moeda");
			System.out.println("1 - Real \n2 - Dolar \n3 - Euro \n4 - Voltar");
			tipo = usuario.nextInt();
			Thread.sleep(500);
			System.out.println("Digite o valor:");
			moeda = usuario.nextDouble();
			//aqui temos 3 if, que ao selecionaro numero vc ira escolher qual moeda você deseja e o programa ja entendera e ira adicionar a moeda correta
			if(tipo == 1) {
				adicionar(moeda,"real");
				menu();
			}
			if(tipo == 2) {
				adicionar(moeda,"dolar");
				menu();
			}
			if(tipo == 3) {
				adicionar(moeda,"euro");
				menu();
			}
		}
		//Listar moedas
		// nesta opção listamos a moeda com o metodo if 
		if(opção == 2) {
			System.out.println("Moedas da lista");
			listar();
			Thread.sleep(500);
			menu();
		}
		//Remover moeda
		if(opção == 3) {
			System.out.println("qual moeda deseja remover");
			Thread.sleep(500);
			listar();
			opção = usuario.nextInt();
			remover(opção);
			menu();
		}
		//Converter tudo pra real
		if(opção == 4) {
			conveter();
			menu();
		}
		if(opção == 5) {
			System.out.println("Obrigado por utilizar meu primeiro software em java, fico muito feliz que tenha gostado!!");
			System.exit(0);
			
		}
		else if(opção >= 6) {
			System.out.println("PARE DE DIGITAR OPÇÃO QUE NÃO EXISTE!");
			menu();
		}
	}
	}

//Nesse trabalho tive algumas dificuldades porem aprendi bastante e fiquei feliz de ver que tudo está ligado uma coisa na outra.