package producao;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* Crie uma classe CarrinhoDeCompras que armazene em um atributo interno do tipo HashMap cada produto adicionado no carrinho e sua respectiva
 * quantidade. 
**/

public class CarrinhoDeCompras {
	
	private Map<Produto, Integer> carrinho = new HashMap<Produto, Integer>();
	private double total;
	private Set<Produto> lstprd;
	private Integer qtdPrd;
	
	/* O m�todo adicionaProduto() deve receber a instancia do produto e a quantidade. Caso o produto j� exista no HashMap, a quantidade deve 
	 * ser somada a que j� existe no carrinho.  Observe que produtos de tamanhos diferentes devem ser considerados como produtos diferentes 
	 * no carrinho.
	**/
	public void adicionaProduto(Produto p, Integer quantidade) {
		
		if(carrinho.containsKey(p)){
			carrinho.put(p, (carrinho.get(p) + quantidade));
		} else{
			carrinho.put(p, quantidade);
		}
	}
	
	public Map<Produto, Integer> getCarrinho() {
		return carrinho;
	}

	// Deve haver tamb�m um m�todo removeProduto() que tamb�m recebe a instancia do produto e a quantidade a ser removida.
	public void removeProduto(Produto p, Integer quantidade) {
		if(carrinho.containsKey(p)){
			qtdPrd = getQtdPrd(p);
			if(qtdPrd >= quantidade) {
				qtdPrd -= quantidade;
				if(qtdPrd > 0) { 
					carrinho.put(p, qtdPrd);
				} else {
					carrinho.remove(p);
				}
			}
		}
	}
	
	public Integer getQtdPrd(Produto p) {
		return carrinho.get(p);
	}
	
	// O carrinho deve possuir um m�todo que calcula o valor total da compra.
	public double getTotal() {
		Integer quantidade;
		Set<Produto> lstprd = carrinho.keySet();
		for (Produto prd : lstprd) {
			quantidade = carrinho.get(prd);
			total += (quantidade * prd.getPreco());
		}
		return total;
	}
}
