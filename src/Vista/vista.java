package Vista;

import java.util.Scanner;

import Modelo.Util;

public class vista {

	public static void main(String[] args) {
		Scanner leer = new Scanner (System.in);
		int opcion=0;
		do {
			opcion=Util.CapturaEntero("Introduzca una opcion", 0, 4);
			switch(opcion) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			}
			
		}while(opcion!=0);
		leer.close();
	}

}
