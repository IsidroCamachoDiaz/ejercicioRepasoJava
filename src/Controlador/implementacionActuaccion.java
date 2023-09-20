package Controlador;

import java.util.List;
import java.util.Scanner;

import Modelo.Util;
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
		System.out.println("Introduzca su DNI: ");
		String dni = leer.next();
		System.out.println("Introduzca su Fecha de Nacimiento: ");
		String fechaNac = leer.next();
		System.out.println("Introduzca su Titulacion mas Alta: ");
		String titulacion = leer.next();
		System.out.println("Introduzca su numero de la Seguridad Social: ");
		int numeroSeguridad = leer.nextInt();
		System.out.println("Introduzca su Numero de Cuenta Bancaria: ");
		int numCuenta= leer.nextInt();
		//Falta numero de registro
		int numeroRegistro=Util.daNumero(empleados);
		empleados.add(new empleado(nombre,apellidos,dni,fechaNac,titulacion,numeroSeguridad,numCuenta,numeroRegistro));
		
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
