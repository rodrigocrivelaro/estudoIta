package principal;

public class Principal {

	public static void main(String[] args) {
		
		Paciente p1 = new Paciente(74.50, 1.80);
		System.out.println("O IMC do Paciente 1 �: "+ p1.calcularIMC() + " kg/m� - e � considerado " + p1.diagnostico());
		
		Paciente p2 = new Paciente(120.50, 1.50);
		System.out.println("O IMC do Paciente 2 �: "+ p2.calcularIMC() + " kg/m� - e � considerado " + p2.diagnostico());
		
		Paciente p3 = new Paciente(70.00, 1.60);
		System.out.println("O IMC do Paciente 3 �: "+ p3.calcularIMC() + " kg/m� - e � considerado " + p3.diagnostico());
		
	}

}
