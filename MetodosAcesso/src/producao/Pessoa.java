package producao;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/*
 * Crie uma classe Pessoa que possui um atributo do tipo Date chamado dataDeNascimento, assim como seus respectivos métodos do acesso. 
 */

public class Pessoa {
	private Date dataDeNascimento;

	public Pessoa(String dtNac) {
		DateFormat df = new SimpleDateFormat ("dd/MM/yyyy");
		df.setLenient (false); 
		Date dt;
		try {
			dt = df.parse(dtNac);
			this.dataDeNascimento = dt;
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	private GregorianCalendar getDataDeNascimento() {
		GregorianCalendar nascimento = new GregorianCalendar();
		if(this.dataDeNascimento != null){
			nascimento.setTime(this.dataDeNascimento);
		}
		
		return nascimento;
	}

	//Crie métodos de acesso chamados getIdade() e getSigno() que obtém essas informações do atributo dataDeNascimento. 
	public int getIdade(String l) {
		
		int anohj = new Relogio(l).agora().get(Calendar.YEAR);
		int meshj = new Relogio(l).agora().get(Calendar.MONTH)+1;
		int diahj = new Relogio(l).agora().get(Calendar.DAY_OF_MONTH);
		
		int anoNascimento = getDataDeNascimento().get(Calendar.YEAR);
		int mesNascimento = getDataDeNascimento().get(Calendar.MONTH)+1;
		int diaNascimento = getDataDeNascimento().get(Calendar.DAY_OF_MONTH);
		
		int idade = (anohj - anoNascimento);
		
		if(meshj < mesNascimento) {
	 		idade--;
	 	} else {
	 		if(diahj < diaNascimento) {
	 			idade--;
	 		}
	 	}
		
		return idade;
	}
	
	public String getSigno() {
		String signo = "";
		int mesNascimento = getDataDeNascimento().get(Calendar.MONTH)+1;
		int diaNascimento = getDataDeNascimento().get(Calendar.DAY_OF_MONTH);

		if((diaNascimento >=21 && mesNascimento == 3) || (diaNascimento < 21 && mesNascimento == 4)) {
			signo = "Áries";
		} else if((diaNascimento >=21 && mesNascimento == 4) || (diaNascimento < 21 && mesNascimento == 5)) {
			signo = "Touro";
		} else if((diaNascimento >=21 && mesNascimento == 5) || (diaNascimento < 21 && mesNascimento == 6)) {
			signo = "Gêmeos";
		} else if((diaNascimento >=21 && mesNascimento == 6) || (diaNascimento < 21 && mesNascimento == 7)) {
			signo = "Câncer";
		} else if((diaNascimento >=21 && mesNascimento == 7) || (diaNascimento < 21 && mesNascimento == 8)) { 
			signo = "Leão";
		} else if((diaNascimento >=21 && mesNascimento == 8) || (diaNascimento < 21 && mesNascimento == 9)) {
			signo = "Virgem";
		} else if((diaNascimento >=21 && mesNascimento == 9) || (diaNascimento < 21 && mesNascimento == 10)) {
			signo = "Libra";
		} else if((diaNascimento >=21 && mesNascimento == 10) || (diaNascimento < 21 && mesNascimento == 11)) {
			signo = "Escorpião";
		} else if((diaNascimento >=21 && mesNascimento == 11) || (diaNascimento < 21 && mesNascimento == 12)) {
			signo = "Sagitário";
		} else if((diaNascimento >=21 && mesNascimento == 12) || (diaNascimento < 21 && mesNascimento == 1)) {
			signo = "Capricórnio";
		} else if((diaNascimento >=21 && mesNascimento == 1) || (diaNascimento < 21 && mesNascimento == 2)) {
			signo = "Aquário";
		} else {
			signo = "Peixes";
		}
		
		return signo;
	}
}
