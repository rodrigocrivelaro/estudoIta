import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		List<Candidato> lista = new ArrayList<>();
		lista.add(new Candidato(80, true, 30));
		lista.add(new Candidato(80, false, 25));
		lista.add(new Candidato(80, false, 29));
		lista.add(new Candidato(90, false, 20));
		lista.add(new Candidato(80, true, 31));
		
		// Embora o método sort(List l) esteja implementado em outra classe, ele utiliza o método compareTo da interface Comparable 
		// implementada na classe Candidato e por isso executa o sort da maneira que implementarmos.
		Collections.sort(lista);
		
		for (Candidato c : lista) {
			// Sobrescrevi o método toString() para que fosse impresso da maneira configurada.
			System.out.println(c);
		}
	}

}
