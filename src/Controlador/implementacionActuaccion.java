package Controlador;

import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

import Modelo.Util;
import Modelo.empleado;
import Modelo.interfazEscritura;
import Modelo.implementacionEscritura;

public class implementacionActuaccion implements interfazActuaccion {

	@Override
	public void registroEmpleado(List<empleado> empleados) {
		Scanner leer = new Scanner (System.in);
		try {
			
			//Se pide los valores
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
		//Se usa el metodo para que un numero disponible
		int numeroRegistro=Util.daNumero(empleados);
		System.out.println("Su numero de empleado es: "+numeroRegistro);
		//Se añade a la lista el nuevo empleado
		empleados.add(new empleado(nombre,apellidos,dni,fechaNac,titulacion,numeroSeguridad,numCuenta,numeroRegistro));
		//Excepciones
		}catch(InputMismatchException  im) {
			System.out.println("Error: no puso el valor correcto o el numero es demasiado grande");
		}
		catch(NoSuchElementException ns) {
			System.out.println("Error: puso un numero demasiado grande");
		}
		catch(Exception e) {
			System.out.println("Error: "+e.getMessage());
		}

	}

	@Override
	public void modificarEmpleado(List<empleado> empleados) {
		Scanner leer = new Scanner (System.in);
		try {
			//Se comprueba si la lista esta vacia
		if(empleados.isEmpty()) {
			System.out.println("No hay registrado ningun usuario");
		}
		else {
			//Si no esta vacia se pide su numero de empleado
		System.out.println("Introduzca su Numero de empleado: ");
		int num=leer.nextInt();
		boolean encontrado=false;
		//Se recorre el bucle para comprobar si esta el empleado
		for(int i=0;i<empleados.size();i++) {
			if(empleados.get(i).getNumRegistro()==num) {
				//Se pide los valores del usuario nuevos
				System.out.println("Nombre: ");
				empleados.get(i).setNombre(leer.next());
				System.out.println("Apellidos: ");
				empleados.get(i).setApellidos(leer.next());
				System.out.println("Titulacion mas Alta: ");
				empleados.get(i).setTitulacionMasAlta(leer.next());
				// se pone a true si encontro su usuario
				encontrado=true;
			}
		}
		if(!encontrado)
			System.out.println("No se ha encontrado el usuario");
		}
		//Excepciones
		}catch(InputMismatchException ime) {
			System.out.println("No puso el tipo dato pedido");
		}
		catch(NoSuchElementException ns) {
			System.out.println("No hay mas datos de entrada");
		}catch(Exception e) {
			System.out.println("Error: "+e.getMessage());
		}
		
	}

	@Override
	public void exportarArchivo(List<empleado> empleados) {
		Scanner leer = new Scanner (System.in);
		boolean encontrado=false;
		interfazEscritura inter = new implementacionEscritura();
		try {
			//Se comprueba la lista si esta vacia
		if(empleados.isEmpty())
			System.out.println("no hay usuaios para exportar");
		
		else {
			//Se pide el numero de empleado
		System.out.println("Registro: Introduzca su numero de Empleado:");
		int numR=Util.CapturaEntero("Introduzca su numero de Registro", 0, 9999);
		 PrintWriter pw = inter.abrirArchivo("C:\\Users\\Puesto3\\Desktop\\Ficheros\\empleados.txt", false);
		 //Se recorre la lista para encontarr su usuario
			for(int i=0;i<empleados.size();i++) {
				
				if(empleados.get(i).getNumRegistro()==numR) {
					//se pregunta cuantos usuarios quiere exportar
					int num = Util.CapturaEntero("Elija cuantos usuarios quiere \n1-El suyo Unico\n2-Todos\n0-Salir\n", 0, 2);		
					switch(num) {
					case 1:
						inter.Escribir(pw, empleados.get(i).toString());
						System.out.println("Se paso lo datos correctamente");
						break;
					case 2:
						//Se hace un bucle para escribir todos los usuarios de la lista
						for(int e=0;e<empleados.size();e++) {
							inter.Escribir(pw, empleados.get(e).toString());
						}
						System.out.println("Se Paso los datos correctamente");
						break;
					}
					// si encuentra el usuario se pone a true
					encontrado=true;
				}
			}
			//se cierra el archivo
			inter.Cerrar(pw);
			if(!encontrado)
				System.out.println("No tiene permiso para exportar o no se encontro su numero");
		}	
		}catch(Exception e) {
			System.out.println("Error: "+e.getMessage());
		}
	}
}

