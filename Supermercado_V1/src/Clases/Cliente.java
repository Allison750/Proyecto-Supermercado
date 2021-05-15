package Clases;

public class Cliente {
	//ATRIBUTOS
	private int ID_Cliente;
	private String nombre,apellido, direcci�n, tel�fono, Medio_pago;
	
	//CONSTRUCTOR
	public Cliente(int iD_Cliente, String nombre, String apellido, String direcci�n, String tel�fono,
			String medio_pago) {
		ID_Cliente = iD_Cliente;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direcci�n = direcci�n;
		this.tel�fono = tel�fono;
		Medio_pago = medio_pago;
	}
	
	//SETTERS AND GETTERS

	public int getID_Cliente() {
		return ID_Cliente;
	}

	public void setID_Cliente(int iD_Cliente) {
		ID_Cliente = iD_Cliente;
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

	public String getDirecci�n() {
		return direcci�n;
	}

	public void setDirecci�n(String direcci�n) {
		this.direcci�n = direcci�n;
	}

	public String getTel�fono() {
		return tel�fono;
	}

	public void setTel�fono(String tel�fono) {
		this.tel�fono = tel�fono;
	}

	public String getMedio_pago() {
		return Medio_pago;
	}

	public void setMedio_pago(String medio_pago) {
		Medio_pago = medio_pago;
	}	
}
