package Arreglos;

import java.util.ArrayList;

import Clases.Inventario;

public class ArregloInventario {
	private ArrayList<Inventario> inv;
	public ArregloInventario(){
		inv=new ArrayList<Inventario>();
	}
    //MÉTODO ADICIONAR
	public void Adicionar(Inventario x){
		inv.add(x);
	}
	//MÉTODO TAMAÑO DEL ARRAY
	public int Tamaño(){
		return inv.size();
	}
	//MÉTODO OBTENER
	public Inventario Obtener(int i) {
		return inv.get(i);
	}
   //MÉTODO BUSCAR
	public Inventario Buscar(int id_prod) {
	    for (int i=0; i<Tamaño(); i++){
		    if (Obtener(i).getProdInv().getID_Producto()== id_prod)
		       return Obtener(i);//inv.get(i)
	    }
		return null;
	}
   //MÉTODO ELIMINAR
	public void Eliminar(Inventario x) {
		inv.remove(x);
	}
}
