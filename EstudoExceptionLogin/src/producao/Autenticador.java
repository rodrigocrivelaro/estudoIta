package producao;

public class Autenticador {
	
	public Usuario logar(String login, String senha) throws LoginException{
		if(login.equals("guerra") && senha.equals("senhaDoGuerra")){
			return new Usuario(login);
		}
		
		throw new LoginException("O usu�rio e a senha n�o batem!", login);
	}
}
