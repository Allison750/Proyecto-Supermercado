package Arreglos;

import java.util.ArrayList;

import Clases.Proveedor;

public class ArregloProveedores {
	private ArrayList<Proveedor> prov;
	public ArregloProveedores(){
		prov=new ArrayList<Proveedor>();
	}
    //MÉTODO ADICIONAR
	public void Adicionar(Proveedor x){
		prov.add(x);
	}
	//MÉTODO TAMAÑO DEL ARRAY
	public int Tamaño(){
		return prov.size();
	}
	//MÉTODO OBTENER
	public  Proveedor Obtener(int i) {
		return prov.get(i);
	}
   //MÉTODO BUSCAR
	public Proveedor Buscar(int id_prov) {
	    for (int i=0; i<Tamaño(); i++){
		    if (Obtener(i).getID_Proveedor()== id_prov)
		       return Obtener(i);//ven.get(i)
	    }
		return null;
	}
   //MÉTODO ELIMINAR
	public void Eliminar(Proveedor x) {
		prov.remove(x);
	}
}
