package Clases;

public class Venta {
	//ATRIBUTOS
	private int Nro_venta;
	private String Fec_Venta;
	private Cajero caj;
	private Cliente clnt;
	private Comprobante comprob;
	
	//CONSTRUCTOR
	public Venta(int nro_venta, String fec_Venta, Cajero caj, Cliente clnt, Comprobante comprob) {
		Nro_venta = nro_venta;
		Fec_Venta = fec_Venta;
		this.caj = caj;
		this.clnt = clnt;
		this.comprob = comprob;
	}
	//SETTERS AND GETTERS
	public int getNro_venta() {
		return Nro_venta;
	}

	public void setNro_venta(int nro_venta) {
		Nro_venta = nro_venta;
	}

	public String getFec_Venta() {
		return Fec_Venta;
	}

	public void setFec_Venta(String fec_Venta) {
		Fec_Venta = fec_Venta;
	}

	public Cajero getCaj() {
		return caj;
	}

	public void setEmpl(Cajero caj) {
		this.caj = caj;
	}

	public Cliente getClnt() {
		return clnt;
	}

	public void setClnt(Cliente clnt) {
		this.clnt = clnt;
	}

	public Comprobante getComprob() {
		return comprob;
	}

	public void setComprob(Comprobante comprob) {
		this.comprob = comprob;
	}
	
	
	
	
}
