package Clases;

public class Cajero {
	//ATRIBUTOS
	   private int ID_Empleado,días_asistidos,días_falta;
	   private String nombre,apellido,cargo,tipo_cajero;
	   private double tarifa_diaria;
	   private Login logcaj;
	 //VARIABLE PRIVADA DE CLASE
		private static int canCajeros=0;

	 //CONSTANTE DE CLASE
		private static final double afp_porcentaje = 0.1;
	//CONSTRUCTOR
	   public Cajero(int iD_Empleado, int días_asistidos, int días_falta, String nombre, String apellido, String cargo,
			String tipo_cajero, double tarifa_diaria, Login logcaj) {
		ID_Empleado = iD_Empleado;
		this.días_asistidos = días_asistidos;
		this.días_falta = días_falta;
		this.nombre = nombre;
		this.apellido = apellido;
		this.cargo = cargo;
		this.tipo_cajero = tipo_cajero;
		this.tarifa_diaria = tarifa_diaria;
		this.logcaj = logcaj;
		canCajeros++;
	}
	
	//SETTERS AND GETTERS
	public int getID_Empleado() {
		return ID_Empleado;
	}
	public void setID_Empleado(int iD_Empleado) {
		ID_Empleado = iD_Empleado;
	}
	public int getDías_asistidos() {
		return días_asistidos;
	}
	public void setDías_asistidos(int días_asistidos) {
		this.días_asistidos = días_asistidos;
	}
	public int getDías_falta() {
		return días_falta;
	}
	public void setDías_falta(int días_falta) {
		this.días_falta = días_falta;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getTipo_cajero() {
		return tipo_cajero;
	}
	public void setTipo_cajero(String tipo_cajero) {
		this.tipo_cajero = tipo_cajero;
	}
	public double getTarifa_diaria() {
		return tarifa_diaria;
	}
	public void setTarifa_diaria(double tarifa_diaria) {
		this.tarifa_diaria = tarifa_diaria;
	}
	public Login getLogcaj() {
		return logcaj;
	}
	public void setLogcaj(Login logcaj) {
		this.logcaj = logcaj;
	}
	//MÉTODOS
	public double Sueldo_Bruto(){
		return días_asistidos*tarifa_diaria;
	}
	public double Descuentos_AFP(){
		return Sueldo_Bruto()*afp_porcentaje;
	}
	public double Sueldo_Neto(){
		return Sueldo_Bruto()-Descuentos_AFP();
	}
	   
}
