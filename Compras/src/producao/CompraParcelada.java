package producao;

/*
 * Crie uma subclasse chamada CompraParcelada que estende a classe Compra. 
 * Essa classe deve receber no construtor tamb�m as informa��es da quantidade de parcelas e o juros mensal.
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
	 * Crie uma nova implementa��o do m�todo total() na subclasse que faz o c�lculo utilizando juros compostos.(non-Javadoc)
	 * @see producao.Compra#getTotal()
	 */
	
	@Override
	public double getTotal() {
//		Montante (M) - Capital (C) - Taxa (i) - Per�odo de tempo (t)
//		M = C * (1 + i) elevado a t
		if(parcelas >= 1 && juros > 0.0)
			return (double) super.getTotal() * Math.pow((1 + juros/100), parcelas);
		
		return super.getTotal();
	}

}
