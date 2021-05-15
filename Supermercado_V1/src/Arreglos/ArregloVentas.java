package Arreglos;

import java.util.ArrayList;

import Clases.Venta;

public class ArregloVentas {
	private ArrayList<Venta> ven;
	public ArregloVentas(){
		ven=new ArrayList<Venta>();
	}
    //MÉTODO ADICIONAR
	public void Adicionar(Venta x){
		ven.add(x);
	}
	//MÉTODO TAMAÑO DEL ARRAY
	public int Tamaño(){
		return ven.size();
	}
	//MÉTODO OBTENER
	public  Venta Obtener(int i) {
		return ven.get(i);
	}
   //MÉTODO BUSCAR
	public Venta Buscar(int id_prod) {
	    for (int i=0; i<Tamaño(); i++){
		    if (Obtener(i).getComprob().getNro_Comprobante()== id_prod)
		       return Obtener(i);//ven.get(i)
	    }
		return null;
	}
   //MÉTODO ELIMINAR
	public void Eliminar(Venta x) {
		ven.remove(x);
	}
}
