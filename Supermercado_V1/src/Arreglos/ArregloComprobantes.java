package Arreglos;

import java.util.ArrayList;

import Clases.Comprobante;

public class ArregloComprobantes {
	private ArrayList<Comprobante> comprobante;
	public ArregloComprobantes(){
		comprobante=new ArrayList<Comprobante>();
	}
    //M�TODO ADICIONAR
	public void Adicionar(Comprobante x){
		comprobante.add(x);
	}
	//M�TODO TAMA�O DEL ARRAY
	public int Tama�o(){
		return comprobante.size();
	}
	//M�TODO OBTENER
	public Comprobante Obtener(int i) {
		return comprobante.get(i);
	}
   //M�TODO BUSCAR
	public Comprobante Buscar(int num_comprobante) {
	    for (int i=0; i<Tama�o(); i++){
		    if (Obtener(i).getNro_Comprobante()== num_comprobante)
		       return Obtener(i);//comprobante.get(i)
	    }
		return null;
	}
   //M�TODO ELIMINAR
	public void Eliminar(Comprobante x) {
		comprobante.remove(x);
	}
}
