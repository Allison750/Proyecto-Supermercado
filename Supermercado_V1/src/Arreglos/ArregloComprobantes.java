package Arreglos;

import java.util.ArrayList;

import Clases.Comprobante;

public class ArregloComprobantes {
	private ArrayList<Comprobante> comprobante;
	public ArregloComprobantes(){
		comprobante=new ArrayList<Comprobante>();
	}
    //MÉTODO ADICIONAR
	public void Adicionar(Comprobante x){
		comprobante.add(x);
	}
	//MÉTODO TAMAÑO DEL ARRAY
	public int Tamaño(){
		return comprobante.size();
	}
	//MÉTODO OBTENER
	public Comprobante Obtener(int i) {
		return comprobante.get(i);
	}
   //MÉTODO BUSCAR
	public Comprobante Buscar(int num_comprobante) {
	    for (int i=0; i<Tamaño(); i++){
		    if (Obtener(i).getNro_Comprobante()== num_comprobante)
		       return Obtener(i);//comprobante.get(i)
	    }
		return null;
	}
   //MÉTODO ELIMINAR
	public void Eliminar(Comprobante x) {
		comprobante.remove(x);
	}
}
