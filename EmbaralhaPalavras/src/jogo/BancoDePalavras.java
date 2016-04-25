package jogo;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

import acessorias.GeraAleatorio;


public class BancoDePalavras {
	
	private static Map<String,String> palavras = new HashMap<>();
	private static Map<Integer,String> relacaoLetraInicialInteiro = new HashMap<>();

	public String getPalavra() {
		String letra;
		letra = getRelacaoLetraInicialInteiro().get(new GeraAleatorio(26).getNumAleatorio());
		return getPalavrasComLetra(letra);
	}

	private String getPalavrasComLetra(String letra) {
		palavras = listaPalavras();
		String grupoPalavrasPorLetra = palavras.get(letra);
		String[] tresPalavras = grupoPalavrasPorLetra.split(";");
		return tresPalavras[new GeraAleatorio(3).getNumAleatorio()]; 
	}

	private Map<String,String> listaPalavras() {
		Scanner sc;
		try {
			sc = new Scanner(new File("palavras.txt"));
			
			while(sc.hasNextLine()) {
				String[] result;
				String s = sc.nextLine();
						
				result = s.split("->");
				if(result.length == 2) {
					palavras.put(result[0], result[1]);
				}
			}
			
		} catch (IOException e) {
			e.getMessage();
		}
		
		return palavras;
	}

	private static Map<Integer, String> getRelacaoLetraInicialInteiro() {
		relacaoLetraInicialInteiro.put(0, "a");
		relacaoLetraInicialInteiro.put(1, "b");
		relacaoLetraInicialInteiro.put(2, "c");
		relacaoLetraInicialInteiro.put(3, "d");
		relacaoLetraInicialInteiro.put(4, "e");
		relacaoLetraInicialInteiro.put(5, "f");
		relacaoLetraInicialInteiro.put(6, "g");
		relacaoLetraInicialInteiro.put(7, "h");
		relacaoLetraInicialInteiro.put(8, "i");
		relacaoLetraInicialInteiro.put(9, "j");
		relacaoLetraInicialInteiro.put(10, "k");
		relacaoLetraInicialInteiro.put(11, "l");
		relacaoLetraInicialInteiro.put(12, "m");
		relacaoLetraInicialInteiro.put(13, "n");
		relacaoLetraInicialInteiro.put(14, "o");
		relacaoLetraInicialInteiro.put(15, "p");
		relacaoLetraInicialInteiro.put(16, "q");
		relacaoLetraInicialInteiro.put(17, "r");
		relacaoLetraInicialInteiro.put(18, "s");
		relacaoLetraInicialInteiro.put(19, "t");
		relacaoLetraInicialInteiro.put(20, "u");
		relacaoLetraInicialInteiro.put(21, "v");
		relacaoLetraInicialInteiro.put(22, "x");
		relacaoLetraInicialInteiro.put(23, "y");
		relacaoLetraInicialInteiro.put(24, "w");
		relacaoLetraInicialInteiro.put(25, "z");
		return relacaoLetraInicialInteiro;
	}

}