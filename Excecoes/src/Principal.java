
public class Principal {

	public static void main(String[] args) {
		System.out.println("Executando o método main()");
		a(-100);
		System.out.println("Terminando o método main()");
	}
	
	public static void a(int i){
		System.out.println("Executando o método a() com " + i);
		try {
			b(i);
		} catch (Exception e) {
			System.out.println("Tratando a exceção: " + e.getMessage());
		}
		
		System.out.println("Terminando o método a()");
	}
	
	public static void b(int i) throws Exception{
		System.out.println("Executando o método b() com " + i);
		
		if(i < 0)
			throw new Exception("Mensagem do erro");
		
		System.out.println("Terminando o método b()");
	}

}
