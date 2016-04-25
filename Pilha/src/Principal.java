
public class Principal {

	public static void main(String[] args) {
		Pilha p = new Pilha(10);
		p.empilhar("Eduardo");
		p.empilhar("Maria");
		p.empilhar("José");
		
		System.out.println(p.topo());
		System.out.println(p.tamanho());
		
		// quebra o encapsulamento do topo
		//p.setTopo(6);
		
		// Antes da correção do método getElementos() essa alteração modificava o próprio array elementos da classe Pilha.
		Object[] arrayElementos = p.getElementos();
		arrayElementos[1] = "Outro";
		
		// Desempilhando
		System.out.println("----------------------------");
		System.out.println(p.desempilhar());
		System.out.println(p.topo());
		System.out.println(p.tamanho());
		
		// No ArrayElementos a Maria foi substituida por Outro enquanto no array original ela já não existe pois foi desempilhada.
		System.out.println("----------------------------");
		System.out.println(arrayElementos[0].toString());
		System.out.println(arrayElementos[1].toString());
		System.out.println(arrayElementos[2].toString());
		System.out.println(arrayElementos.length);
	}

}
