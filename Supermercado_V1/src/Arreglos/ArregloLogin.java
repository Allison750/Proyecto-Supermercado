package Arreglos;

import java.util.ArrayList;

import Clases.Login;

public class ArregloLogin {
	private ArrayList<Login> login;
	public ArregloLogin(){
		login=new ArrayList<Login>();
	}
    //M�TODO ADICIONAR
	public void Adicionar(Login x){
		login.add(x);
	}
	//M�TODO TAMA�O DEL ARRAY
	public int Tama�o(){
		return login.size();
	}
	//M�TODO OBTENER
	public Login Obtener(int i) {
		return login.get(i);
	}
   //M�TODO BUSCAR
	
	public Login Buscar(String cod){
        Login e;
        for(int i=0; i<Tama�o(); i++){
            e = Obtener(i);
            if(e.getUsuario().equals(cod)){
                return e;
            }
        }
        return null;
    }

   //M�TODO ELIMINAR
	public void Eliminar(Login x) {
		login.remove(x);
	}
}
