public class Usuario {
	
	// Atributos 
	private String login;
	private int password; // nº aleatorio del 0 al 10
	
	// Constructores
	public Usuario(String login) {
		this.login = login;
		this.password = (int) (Math.random()*10);
	}
	
	// Getters y Setters
	public String getLogin() {
		return login;
	}
	
	public int getPassword() {
		return password;
	}

	public void setLogin(String login) {
		this.login = login;
	}
	
	public void setPassword(int password) {
		this.password = password;
	}
	
	// Override
	@Override
	public String toString() {
		return "User [login=" + login + ", password=" + password + "]";
	}
}