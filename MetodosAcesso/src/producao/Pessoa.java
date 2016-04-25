package producao;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/*
 * Crie uma classe Pessoa que possui um atributo do tipo Date chamado dataDeNascimento, assim como seus respectivos m�todos do acesso. 
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

	//Crie m�todos de acesso chamados getIdade() e getSigno() que obt�m essas informa��es do atributo dataDeNascimento. 
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
			signo = "�ries";
		} else if((diaNascimento >=21 && mesNascimento == 4) || (diaNascimento < 21 && mesNascimento == 5)) {
			signo = "Touro";
		} else if((diaNascimento >=21 && mesNascimento == 5) || (diaNascimento < 21 && mesNascimento == 6)) {
			signo = "G�meos";
		} else if((diaNascimento >=21 && mesNascimento == 6) || (diaNascimento < 21 && mesNascimento == 7)) {
			signo = "C�ncer";
		} else if((diaNascimento >=21 && mesNascimento == 7) || (diaNascimento < 21 && mesNascimento == 8)) { 
			signo = "Le�o";
		} else if((diaNascimento >=21 && mesNascimento == 8) || (diaNascimento < 21 && mesNascimento == 9)) {
			signo = "Virgem";
		} else if((diaNascimento >=21 && mesNascimento == 9) || (diaNascimento < 21 && mesNascimento == 10)) {
			signo = "Libra";
		} else if((diaNascimento >=21 && mesNascimento == 10) || (diaNascimento < 21 && mesNascimento == 11)) {
			signo = "Escorpi�o";
		} else if((diaNascimento >=21 && mesNascimento == 11) || (diaNascimento < 21 && mesNascimento == 12)) {
			signo = "Sagit�rio";
		} else if((diaNascimento >=21 && mesNascimento == 12) || (diaNascimento < 21 && mesNascimento == 1)) {
			signo = "Capric�rnio";
		} else if((diaNascimento >=21 && mesNascimento == 1) || (diaNascimento < 21 && mesNascimento == 2)) {
			signo = "Aqu�rio";
		} else {
			signo = "Peixes";
		}
		
		return signo;
	}
}
