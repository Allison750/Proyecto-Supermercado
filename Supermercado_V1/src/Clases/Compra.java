package Clases;

public class Compra {
   //ATRIBUTOS
	private int Nro_Compra,Nro_Factura,cant_comprada_producto;
	private String fecha_compra;
	private Producto prod;
	private Proveedor prov;
   //CONSTRUCTOR
	public Compra(int nro_Compra, int nro_Factura, int cant_comprada_producto, String fecha_compra, Producto prod,
			Proveedor prov) {
		Nro_Compra = nro_Compra;
		Nro_Factura = nro_Factura;
		this.cant_comprada_producto = cant_comprada_producto;
		this.fecha_compra = fecha_compra;
		this.prod = prod;
		this.prov = prov;
	}
	
	//SETTERS AND GETTERS
	public int getNro_Compra() {
		return Nro_Compra;
	}
	public void setNro_Compra(int nro_Compra) {
		Nro_Compra = nro_Compra;
	}
	public int getNro_Factura() {
		return Nro_Factura;
	}
	public void setNro_Factura(int nro_Factura) {
		Nro_Factura = nro_Factura;
	}
	public int getCant_comprada_producto() {
		return cant_comprada_producto;
	}
	public void setCant_comprada_producto(int cant_comprada_producto) {
		this.cant_comprada_producto = cant_comprada_producto;
	}
	public String getFecha_compra() {
		return fecha_compra;
	}
	public void setFecha_compra(String fecha_compra) {
		this.fecha_compra = fecha_compra;
	}
	public Producto getProd() {
		return prod;
	}
	public void setProd(Producto prod) {
		this.prod = prod;
	}
	public Proveedor getProv() {
		return prov;
	}
	public void setProv(Proveedor prov) {
		this.prov = prov;
	}
	
	//MÉTODOS
	public double total_compra(){
		return cant_comprada_producto*prod.getPrecio_producto();
	}
   
	
}
