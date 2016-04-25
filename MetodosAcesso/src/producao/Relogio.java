package producao;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

/* 
 * Observe que a funcionalidade que calcula a idade depende do tempo corrente. Como fazer um teste de unidade, se o seu resultado pode ser 
 * diferente daqui a algum tempo? Para isso, precisamos, de alguma forma, controlar o valor retornado quando pedimos o valor do momento 
 * corrente.
 *
 * Crie uma classe chamada Relogio e nessa classe crie um método chamado agora(), que retorna o valor de System.currentTimeMillis().
 *  
 * Crie uma variável, que se o valor dela não for zero, seu valor deve ser retornado no método agora(). Se você utilizar a classe Relogio 
 * para obter o tempo, será possível nos testes fazer com que ele retorne sempre um valor fixo!
 */

public class Relogio {
	private String now;
	
	public Relogio(String now) {
		super();
		this.now = now;
	}
	
	
	public GregorianCalendar agora(){
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		df.setLenient (false); 
		Date dt;
		GregorianCalendar dtRef = new GregorianCalendar();
		
		try {
			dt = df.parse(now);
			if(dt != null){
				dtRef.setTime(dt);
			}

			dtRef.setTime(new Date(System.currentTimeMillis()));
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		return dtRef;
	}
}
