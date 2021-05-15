package Arreglos;

import java.util.ArrayList;

import Clases.Compra;

public class ArregloCompras {
	private ArrayList<Compra> comp;
	public ArregloCompras(){
		comp=new ArrayList<Compra>();
	}
    //M�TODO ADICIONAR
	public void Adicionar(Compra x){
		comp.add(x);
	}
	//M�TODO TAMA�O DEL ARRAY
	public int Tama�o(){
		return comp.size();
	}
	//M�TODO OBTENER
	public Compra Obtener(int i) {
		return comp.get(i);
	}
   //M�TODO BUSCAR
	public Compra Buscar(int num_factura) {
	    for (int i=0; i<Tama�o(); i++){
		    if (Obtener(i).getNro_Factura() == num_factura)
		       return Obtener(i);//comp.get(i)
	    }
		return null;
	}
   //M�TODO ELIMINAR
	public void Eliminar(Compra x) {
		comp.remove(x);
	}
}
