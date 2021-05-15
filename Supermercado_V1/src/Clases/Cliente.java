package Clases;

public class Cliente {
	//ATRIBUTOS
	private int ID_Cliente;
	private String nombre,apellido, dirección, teléfono, Medio_pago;
	
	//CONSTRUCTOR
	public Cliente(int iD_Cliente, String nombre, String apellido, String dirección, String teléfono,
			String medio_pago) {
		ID_Cliente = iD_Cliente;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dirección = dirección;
		this.teléfono = teléfono;
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

	public String getDirección() {
		return dirección;
	}

	public void setDirección(String dirección) {
		this.dirección = dirección;
	}

	public String getTeléfono() {
		return teléfono;
	}

	public void setTeléfono(String teléfono) {
		this.teléfono = teléfono;
	}

	public String getMedio_pago() {
		return Medio_pago;
	}

	public void setMedio_pago(String medio_pago) {
		Medio_pago = medio_pago;
	}	
}
