package Clases;

public class Proveedor {
  //ATRIBUTOS
	private int ID_Proveedor;
	private String Nombre_proveedor,direcci�n,tel�fono;
  //CONSTRUCTOR
	public Proveedor(int iD_Proveedor, String nombre_proveedor, String direcci�n, String tel�fono) {
		ID_Proveedor = iD_Proveedor;
		Nombre_proveedor = nombre_proveedor;
		this.direcci�n = direcci�n;
		this.tel�fono = tel�fono;
	}
  //SETTER AND GETTERS
	public int getID_Proveedor() {
		return ID_Proveedor;
	}
	public void setID_Proveedor(int iD_Proveedor) {
		ID_Proveedor = iD_Proveedor;
	}
	public String getNombre_proveedor() {
		return Nombre_proveedor;
	}
	public void setNombre_proveedor(String nombre_proveedor) {
		Nombre_proveedor = nombre_proveedor;
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
	
}
