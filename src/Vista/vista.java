package Vista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Modelo.Util;
import Modelo.empleado;
import Controlador.implementacionActuaccion;
import Controlador.interfazActuaccion;

public class vista {

	public static void main(String[] args) {
		//Creamos lo necesario
		Scanner leer = new Scanner (System.in);
		int opcion=0;
		List <empleado> empleados = new ArrayList <empleado> ();
		interfazActuaccion inter = new implementacionActuaccion ();
		//Entra en el bucle 
		do {
			Util.menu();
			opcion=Util.CapturaEntero("Introduzca una opcion", 0, 3);
			//Comprueba la opcion depediendo de lo que necesite
			switch(opcion) {
			case 1:
				inter.registroEmpleado(empleados);
				break;
			case 2:
				inter.modificarEmpleado(empleados);
				break;
			case 3:
				inter.exportarArchivo(empleados);
				break;
			}
			
		}while(opcion!=0);
		//Cierra el scanner
		leer.close();
	}

}
