package Arreglos;

import java.util.ArrayList;

import Clases.Administrador;


public class ArregloAdministradores {
	private ArrayList<Administrador> admin;
	public ArregloAdministradores(){
		admin=new ArrayList<Administrador>();
	}
    //MÉTODO ADICIONAR
	public void Adicionar(Administrador x){
		admin.add(x);
	}
	//MÉTODO TAMAÑO DEL ARRAY
	public int Tamaño(){
		return admin.size();
	}
	//MÉTODO OBTENER
	public Administrador Obtener(int i) {
		return admin.get(i);
	}
   //MÉTODO BUSCAR
	public Administrador Buscar(int cod) {
	    for (int i=0; i<Tamaño(); i++){
		    if (Obtener(i).getID_Empleado() == cod)
		       return Obtener(i);//admin.get(i)
	    }
		return null;
	}
   //MÉTODO ELIMINAR
	public void Eliminar(Administrador x) {
		admin.remove(x);
	}
	
}
