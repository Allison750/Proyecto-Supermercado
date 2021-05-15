package Clases;

public class Inventario {

	//ATRIBUTOS
	private int stock_inicial,stock_final;
	private Producto prodInv;
	
	//CONSTRUCTOR
	public Inventario(int stock_inicial, int stock_final, Producto prodInv) {
		this.stock_inicial = stock_inicial;
		this.stock_final = stock_final;
		this.prodInv = prodInv;
	}
	//SETTERS AND GETTERS
	public int getStock_inicial() {
		return stock_inicial;
	}

	public void setStock_inicial(int stock_inicial) {
		this.stock_inicial = stock_inicial;
	}

	public int getStock_final() {
		return stock_final;
	}

	public void setStock_final(int stock_final) {
		this.stock_final = stock_final;
	}

	public Producto getProdInv() {
		return prodInv;
	}

	public void setProdInv(Producto prodInv) {
		this.prodInv = prodInv;
	}


}
