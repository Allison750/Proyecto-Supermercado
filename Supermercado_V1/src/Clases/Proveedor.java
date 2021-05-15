package Clases;

public class Proveedor {
  //ATRIBUTOS
	private int ID_Proveedor;
	private String Nombre_proveedor,dirección,teléfono;
  //CONSTRUCTOR
	public Proveedor(int iD_Proveedor, String nombre_proveedor, String dirección, String teléfono) {
		ID_Proveedor = iD_Proveedor;
		Nombre_proveedor = nombre_proveedor;
		this.dirección = dirección;
		this.teléfono = teléfono;
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
	
}
