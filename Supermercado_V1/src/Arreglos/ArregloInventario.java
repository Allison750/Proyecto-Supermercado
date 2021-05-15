package Arreglos;

import java.util.ArrayList;

import Clases.Inventario;

public class ArregloInventario {
	private ArrayList<Inventario> inv;
	public ArregloInventario(){
		inv=new ArrayList<Inventario>();
	}
    //M�TODO ADICIONAR
	public void Adicionar(Inventario x){
		inv.add(x);
	}
	//M�TODO TAMA�O DEL ARRAY
	public int Tama�o(){
		return inv.size();
	}
	//M�TODO OBTENER
	public Inventario Obtener(int i) {
		return inv.get(i);
	}
   //M�TODO BUSCAR
	public Inventario Buscar(int id_prod) {
	    for (int i=0; i<Tama�o(); i++){
		    if (Obtener(i).getProdInv().getID_Producto()== id_prod)
		       return Obtener(i);//inv.get(i)
	    }
		return null;
	}
   //M�TODO ELIMINAR
	public void Eliminar(Inventario x) {
		inv.remove(x);
	}
}
