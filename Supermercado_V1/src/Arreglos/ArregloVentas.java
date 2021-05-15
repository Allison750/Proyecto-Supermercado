package Arreglos;

import java.util.ArrayList;

import Clases.Venta;

public class ArregloVentas {
	private ArrayList<Venta> ven;
	public ArregloVentas(){
		ven=new ArrayList<Venta>();
	}
    //M�TODO ADICIONAR
	public void Adicionar(Venta x){
		ven.add(x);
	}
	//M�TODO TAMA�O DEL ARRAY
	public int Tama�o(){
		return ven.size();
	}
	//M�TODO OBTENER
	public  Venta Obtener(int i) {
		return ven.get(i);
	}
   //M�TODO BUSCAR
	public Venta Buscar(int id_prod) {
	    for (int i=0; i<Tama�o(); i++){
		    if (Obtener(i).getComprob().getNro_Comprobante()== id_prod)
		       return Obtener(i);//ven.get(i)
	    }
		return null;
	}
   //M�TODO ELIMINAR
	public void Eliminar(Venta x) {
		ven.remove(x);
	}
}
