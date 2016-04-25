
public class Principal {

	public static void main(String[] args) {
		System.out.println("Executando o m�todo main()");
		a(-100);
		System.out.println("Terminando o m�todo main()");
	}
	
	public static void a(int i){
		System.out.println("Executando o m�todo a() com " + i);
		try {
			b(i);
		} catch (Exception e) {
			System.out.println("Tratando a exce��o: " + e.getMessage());
		}
		
		System.out.println("Terminando o m�todo a()");
	}
	
	public static void b(int i) throws Exception{
		System.out.println("Executando o m�todo b() com " + i);
		
		if(i < 0)
			throw new Exception("Mensagem do erro");
		
		System.out.println("Terminando o m�todo b()");
	}

}
