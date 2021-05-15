package Clases;

public class Producto {
	//ATRIBUTOS
	private int ID_Producto;
	private String nombre_producto, tipo_producto, Fecha_vencimiento;
	private double Precio_producto;
	private Proveedor prov;
	private Inventario inv;
	
	//CONSTRUCTOR
	public Producto(int iD_Producto, int cant_productos, String nombre_producto, String tipo_producto,
			String fecha_vencimiento, double precio_producto, Proveedor prov, Inventario inv) {
		ID_Producto = iD_Producto;		
		this.nombre_producto = nombre_producto;
		this.tipo_producto = tipo_producto;
		Fecha_vencimiento = fecha_vencimiento;
		Precio_producto = precio_producto;
		this.prov = prov;
		this.inv = inv;
	}
	
	//SETTERS AND GETTERS
	public int getID_Producto() {
		return ID_Producto;
	}

	public void setID_Producto(int iD_Producto) {
		ID_Producto = iD_Producto;
	}

	public String getNombre_producto() {
		return nombre_producto;
	}

	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}

	public String getTipo_producto() {
		return tipo_producto;
	}

	public void setTipo_producto(String tipo_producto) {
		this.tipo_producto = tipo_producto;
	}

	public String getFecha_vencimiento() {
		return Fecha_vencimiento;
	}

	public void setFecha_vencimiento(String fecha_vencimiento) {
		Fecha_vencimiento = fecha_vencimiento;
	}

	public double getPrecio_producto() {
		return Precio_producto;
	}

	public void setPrecio_producto(double precio_producto) {
		Precio_producto = precio_producto;
	}

	public Proveedor getProv() {
		return prov;
	}

	public void setProv(Proveedor prov) {
		this.prov = prov;
	}

	public Inventario getInv() {
		return inv;
	}

	public void setInv(Inventario inv) {
		this.inv = inv;
	}	
}
