package producao;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import excecoes.LeituraArquivoException;

public class ProcessadorArquivo {
	
	static Map<String,String> infArq = new HashMap<>();
	
	@SuppressWarnings({ "resource" })
	public static Map<String, String> processar(String nomeArquivo) throws LeituraArquivoException {
		Scanner sc;
		int cont = 0;
		
		try {
			sc = new Scanner(new File(nomeArquivo));
			
			while(sc.hasNextLine()) {
				String[] result;
				String s = sc.nextLine();

				if (s.trim().length() == 0)
					continue;

				for(int i = 0; i <= s.length();i++){
					int n = i+2 > s.length()? i : i+2;
					if (s.substring(i,n).contains("->"))
						cont++;
		        }  
				
				if (cont == 1) {
					cont = 0;
					result = s.split("->");
					if(result.length == 2) {
						if (!result[0].equals("")) {
							infArq.put(result[0], result[1]);
							continue;
						} 
					}
				}
				
				throw new LeituraArquivoException("Formato de arquivo inválido!");
			}
			
			if (infArq.isEmpty())
				throw new LeituraArquivoException("Arquivo Vazio!");
			
			return infArq;	
		
		} catch (IOException e) {
			throw new LeituraArquivoException("Erro ao abrir o arquivo - " + e.getMessage());
		}
		
	}
}
