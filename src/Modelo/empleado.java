package Modelo;

public class empleado {

	//Atributos
	String nombre;
	String apellidos;
	String dni;
	String fechaNac;
	String titulacionMasAlta;
	int numSeguridad;
	int numCuentaBancaria;
	int numRegistro;
	
	//Constructores
	public empleado(String nombre, String apellidos, String dni, String fechaNac, String titulacionMasAlta,
			int numSeguridad, int numCuentaBancaria,int numRegistro) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.fechaNac = fechaNac;
		this.titulacionMasAlta = titulacionMasAlta;
		this.numSeguridad = numSeguridad;
		this.numCuentaBancaria = numCuentaBancaria;
		this.numRegistro=numRegistro;
	}
	//Geters y Seters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getTitulacionMasAlta() {
		return titulacionMasAlta;
	}
	public void setTitulacionMasAlta(String titulacionMasAlta) {
		this.titulacionMasAlta = titulacionMasAlta;
	}
	public String getDni() {
		return dni;
	}
	public String getFechaNac() {
		return fechaNac;
	}
	public int getNumRegistro() {
		return numRegistro;
	}
	//Metodos
	@Override
	public String toString() {
		return nombre + ";" + apellidos + ";" + dni + ";" + fechaNac
				+ ";" + titulacionMasAlta ;
	}
	
}
