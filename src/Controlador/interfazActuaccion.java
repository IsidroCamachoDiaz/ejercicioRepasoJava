package Controlador;

import java.util.List;

import Modelo.empleado;

public interface interfazActuaccion {
	/**
	 * La interfaz pricipal de los procesos del menu
	 * 
	 * **/
	
	/**
	 * Pide los valores al empleados y crea un nuevo empleado en la lista
	 * 
	 * **/
	public void registroEmpleado(List <empleado> empleados);
	/**
	 * Pide su numero de empleado para modificar su informacion
	 * 
	 * **/
	public void modificarEmpleado(List <empleado> empleados);
	/**
	 * Exporta los datos al archivo ya sea una persoan o varias
	 * 
	 * **/
	public void exportarArchivo(List <empleado> empleados);
}
