import java.util.Arrays;

public class Pilha {

	private int topo = 0;
	private Object[] elementos;
	

	public Pilha(int maximo) {
		this.elementos = new Object[maximo];
	}

	public void empilhar(Object elemento) {
		elementos[topo] = elemento;
		topo++;
	}

	public Object desempilhar() {
		topo--;
		return elementos[topo];
	}

	public Object topo() {
		return elementos[topo-1];
	}

	// Esse método foi retirado pois quebra o encapsulamento do topo
	/*public void setTopo(int topo) {
		this.topo = topo;
	}*/

	// Era possível quebrar o encapsulamento do array através desse método
	/*public Object[] getElementos() {
		return elementos;
	}*/
	public Object[] getElementos() {
		Object[] paraRetorno = Arrays.copyOf(elementos, tamanho());
		return paraRetorno;
	}


	public void setElementos(Object[] elementos) {
		this.elementos = elementos;
	}

	// Equivale ao getTopo()
	public int tamanho() {
		return topo;
	}
	
}
