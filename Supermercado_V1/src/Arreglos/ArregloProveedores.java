package Arreglos;

import java.util.ArrayList;

import Clases.Proveedor;

public class ArregloProveedores {
	private ArrayList<Proveedor> prov;
	public ArregloProveedores(){
		prov=new ArrayList<Proveedor>();
	}
    //M�TODO ADICIONAR
	public void Adicionar(Proveedor x){
		prov.add(x);
	}
	//M�TODO TAMA�O DEL ARRAY
	public int Tama�o(){
		return prov.size();
	}
	//M�TODO OBTENER
	public  Proveedor Obtener(int i) {
		return prov.get(i);
	}
   //M�TODO BUSCAR
	public Proveedor Buscar(int id_prov) {
	    for (int i=0; i<Tama�o(); i++){
		    if (Obtener(i).getID_Proveedor()== id_prov)
		       return Obtener(i);//ven.get(i)
	    }
		return null;
	}
   //M�TODO ELIMINAR
	public void Eliminar(Proveedor x) {
		prov.remove(x);
	}
}
