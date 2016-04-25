package principal;

import java.util.Scanner;

import fabricas.FabricaMecanicaDoJogo;
import interfaces.MecanicaDoJogo;

public class Principal {
	
	static Scanner sc = new Scanner(System.in);;
	static String palavraDigitada;    
	static String dificuldade;
	static MecanicaDoJogo fMJ;
	
	public static void main(String[] args) {
		
		System.out.println("Bem vindo ao Jogo de Embaralhamento de Palavras!");
		
		inicio();
		
		while(!palavraDigitada.equals("3")) {
			String[] result = fMJ.jogando(palavraDigitada); 
			
			System.out.println(result[0]);
			System.out.println(result[1]);
			
			if(result[2].equals("3")) {
				palavraDigitada = "3";
				continue;
			}
			
			if(result[2].equals("s")) {
				inicio();
				continue;
			}
			
			System.out.println(result[2]);
			palavraDigitada = sc.nextLine();
		}
		
		if(palavraDigitada.equals("3")){
			sair();
		}
	}

	private static void inicio() {
		dificuldade = getDificuldade();  
		
		fMJ = new FabricaMecanicaDoJogo(dificuldade).getMecanicaDoJogo();
		
		System.out.println("Descubra qual � a palavra abaixo: ");
		System.out.println(fMJ.iniciaJogo(dificuldade));

		palavraDigitada = sc.nextLine();
	}

	private static void sair() {
		System.out.println("Jogo Encerrado. At� a pr�xima!");
		System.exit(0);
	}

	private static String getDificuldade() {
		String dificuldade;
		System.out.println("Escolha o n�vel de dificuldade ou digite 3 para sair: ");
		System.out.println("0 = f�cil, 1 = M�dio ou 2 = Dif�cil");
		dificuldade = sc.nextLine();
		
		while (!dificuldade.equals("0") && !dificuldade.equals("1") && !dificuldade.equals("2") && !dificuldade.equals("3")) {
			System.out.println("S� devem ser digitados os valores do menu : 0 = f�cil, 1 = M�dio, 2 = Dif�cil ou 3 = Sair");
			dificuldade = sc.nextLine(); 
		}	

		if(dificuldade.equals("3")) {
			sair();
		}
		
		String nivel = dificuldade.equals("0") ? "F�cil" : dificuldade.equals("1") ? "M�dio" : "Dif�cil";  
		System.out.println("Voc� escolheu a dificuldade " + nivel + ", boa sorte!");
		
		return dificuldade;
	}

}
