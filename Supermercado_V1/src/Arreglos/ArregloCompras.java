package Arreglos;

import java.util.ArrayList;

import Clases.Compra;

public class ArregloCompras {
	private ArrayList<Compra> comp;
	public ArregloCompras(){
		comp=new ArrayList<Compra>();
	}
    //MÉTODO ADICIONAR
	public void Adicionar(Compra x){
		comp.add(x);
	}
	//MÉTODO TAMAÑO DEL ARRAY
	public int Tamaño(){
		return comp.size();
	}
	//MÉTODO OBTENER
	public Compra Obtener(int i) {
		return comp.get(i);
	}
   //MÉTODO BUSCAR
	public Compra Buscar(int num_factura) {
	    for (int i=0; i<Tamaño(); i++){
		    if (Obtener(i).getNro_Factura() == num_factura)
		       return Obtener(i);//comp.get(i)
	    }
		return null;
	}
   //MÉTODO ELIMINAR
	public void Eliminar(Compra x) {
		comp.remove(x);
	}
}
