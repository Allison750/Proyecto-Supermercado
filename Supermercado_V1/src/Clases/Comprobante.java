package Clases;

public class Comprobante {
	//ATRIBUTOS
	private int Nro_Comprobante;
	private String Fec_Venta;
	private Producto product;
		
	//CONSTRUCTOR
	public Comprobante(int nro_Comprobante, String fec_Venta, Producto product) {
		Nro_Comprobante = nro_Comprobante;
		Fec_Venta = fec_Venta;
		
		this.product = product;
	}
	
	//SETTERS AND GETTERES

	public int getNro_Comprobante() {
		return Nro_Comprobante;
	}

	public void setNro_Comprobante(int nro_Comprobante) {
		Nro_Comprobante = nro_Comprobante;
	}

	public String getFec_Venta() {
		return Fec_Venta;
	}

	public void setFec_Venta(String fec_Venta) {
		Fec_Venta = fec_Venta;
	}

	public Producto getProduct() {
		return product;
	}

	public void setProduct(Producto product) {
		this.product = product;
	}	
}
