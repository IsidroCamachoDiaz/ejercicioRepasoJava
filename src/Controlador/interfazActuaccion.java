package Controlador;

import java.util.List;

import Modelo.empleado;

public interface interfazActuaccion {

	public void registroEmpleado(List <empleado> empleados);
	public void modificarEmpleado(List <empleado> empleados);
	public void exportarArchivo(List <empleado> empleados);
}
