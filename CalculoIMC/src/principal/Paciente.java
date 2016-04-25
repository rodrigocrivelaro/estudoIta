	package principal;

public class Paciente {
	double peso;
	double altura;
	double imc;
	
	public Paciente(double peso, double altura) {
		this.peso = peso;
		this.altura = altura;
	}
	
	public double calcularIMC(){
		return  this.peso / (this.altura * this.altura);
	}
	
	public String diagnostico() {
		imc = 0.00;
		String mensagem = "";
		imc = calcularIMC();

		if(imc < 16.00){
			mensagem = "Baixo peso, muito grave";
		} else if (imc < 17.00) {
			mensagem = "Baixo peso, grave";
		} else if (imc < 18.50) {
			mensagem = "Baixo peso";
		} else if (imc < 25.00) {
			mensagem = "Peso normal";	
		} else if (imc < 30.00) {
			mensagem = "Sobrepeso";
		} else if (imc < 35.00) {
			mensagem = "Obesidade grau I";
		} else if (imc < 40.00) {
			mensagem = "Obesidade grau II";
		} else {
			mensagem = "Obesidade grau III (obesidade mórbida)";			
		}
				
		return mensagem;
	}
}
