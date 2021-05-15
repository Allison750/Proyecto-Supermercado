package Clases;

public class Login {
	//ATRIBUTOS
	private String usuario, contraseña;
	//CONSTRUCTOR
	public Login(String usuario, String contraseña) {
		this.usuario = usuario;
		this.contraseña = contraseña;
	}
	//SETTERS AND GETTERS
	public String getUsuario() {
		return usuario;
	}
	
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	public String getContraseña() {
		return contraseña;
	}
	
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
  

}
