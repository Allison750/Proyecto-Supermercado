package Clases;

public class Administrador {
	//ATRIBUTOS
	   private int ID_Empleado;
	   private String nombre,apellido,email,direcci�n,cargo;
	   private Login logad;
	//CONSTRUCTOR
	public Administrador(int iD_Empleado, String nombre, String apellido, String email, String direcci�n, String cargo, Login logad) {
		ID_Empleado = iD_Empleado;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.direcci�n = direcci�n;
		this.cargo = cargo;
		this.logad = logad;
	}
	//SETTERS AND GETTERS
	public int getID_Empleado() {
		return ID_Empleado;
	}
	public void setID_Empleado(int iD_Empleado) {
		ID_Empleado = iD_Empleado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDirecci�n() {
		return direcci�n;
	}
	public void setDirecci�n(String direcci�n) {
		this.direcci�n = direcci�n;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public Login getLogad() {
		return logad;
	}
	public void setLogad(Login logad) {
		this.logad = logad;
	}
	   
	
	
}
