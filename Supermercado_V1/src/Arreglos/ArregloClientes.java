package Arreglos;

import java.util.ArrayList;

import Clases.Cliente;

public class ArregloClientes {
	private ArrayList<Cliente> cli;
	public ArregloClientes(){
		cli=new ArrayList<Cliente>();
	}
    //M�TODO ADICIONAR
	public void Adicionar(Cliente x){
		cli.add(x);
	}
	//M�TODO TAMA�O DEL ARRAY
	public int Tama�o(){
		return cli.size();
	}
	//M�TODO OBTENER
	public Cliente Obtener(int i) {
		return cli.get(i);
	}
   //M�TODO BUSCAR
	public Cliente Buscar(int cod) {
	    for (int i=0; i<Tama�o(); i++){
		    if (Obtener(i).getID_Cliente() == cod)
		       return Obtener(i);//cli.get(i)
	    }
		return null;
	}
   //M�TODO ELIMINAR
	public void Eliminar(Cliente x) {
		cli.remove(x);
	}
}
