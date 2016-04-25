package producao;

/*
 * Crie uma subclasse chamada CompraParcelada que estende a classe Compra. 
 * Essa classe deve receber no construtor também as informações da quantidade de parcelas e o juros mensal.
 */

public class CompraParcelada extends Compra {
	
	private int parcelas;
	private double juros;
	
	public CompraParcelada(double val, int parcelas, double juros) {
		super(val);
		this.parcelas = parcelas;
		this.juros = juros;
	}
	
	/*
	 * Crie uma nova implementação do método total() na subclasse que faz o cálculo utilizando juros compostos.(non-Javadoc)
	 * @see producao.Compra#getTotal()
	 */
	
	@Override
	public double getTotal() {
//		Montante (M) - Capital (C) - Taxa (i) - Período de tempo (t)
//		M = C * (1 + i) elevado a t
		if(parcelas >= 1 && juros > 0.0)
			return (double) super.getTotal() * Math.pow((1 + juros/100), parcelas);
		
		return super.getTotal();
	}

}
