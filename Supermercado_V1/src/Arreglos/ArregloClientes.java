package Arreglos;

import java.util.ArrayList;

import Clases.Cliente;

public class ArregloClientes {
	private ArrayList<Cliente> cli;
	public ArregloClientes(){
		cli=new ArrayList<Cliente>();
	}
    //MÉTODO ADICIONAR
	public void Adicionar(Cliente x){
		cli.add(x);
	}
	//MÉTODO TAMAÑO DEL ARRAY
	public int Tamaño(){
		return cli.size();
	}
	//MÉTODO OBTENER
	public Cliente Obtener(int i) {
		return cli.get(i);
	}
   //MÉTODO BUSCAR
	public Cliente Buscar(int cod) {
	    for (int i=0; i<Tamaño(); i++){
		    if (Obtener(i).getID_Cliente() == cod)
		       return Obtener(i);//cli.get(i)
	    }
		return null;
	}
   //MÉTODO ELIMINAR
	public void Eliminar(Cliente x) {
		cli.remove(x);
	}
}
