package Controlador;

import java.util.List;
import java.util.Scanner;

import Modelo.empleado;

public class implementacionActuaccion implements interfazActuaccion {

	@Override
	public void registroEmpleado(List<empleado> empleados) {
		Scanner leer = new Scanner (System.in);
		try {
		System.out.println("Introduzca su nombre: ");
		String nombre = leer.next();
		System.out.println("Introduzca sus apellidos: ");
		String apellidos = leer.next();
		}catch(Exception e) {
			System.out.println("Error: "+e.getMessage());
		}

	}

	@Override
	public void modificarEmpleado(List<empleado> empleados) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exportarArchivo(List<empleado> empleados) {
		// TODO Auto-generated method stub

	}

}
