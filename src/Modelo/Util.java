package Modelo;

import java.util.List;
import java.util.Scanner;

public class Util {
	//Esta clase la uso como herramientas durante varios procesos y la pongo static
	
	//Pedimos un numero y que lo ponga entre los valores
	public static int CapturaEntero(String texto,int min,int max){
		//ponemos una variable boleana para las comprobaciones
		boolean ok=true;
		int num=0;
		Scanner leer = new Scanner (System.in);
		do {
		try {	
			//Pedimos el numero si pone un formato incorrecto cambiara la variable y se 
			//repite el bucle
		System.out.println(texto+"del "+min+" a "+max);
		num=leer.nextInt();
		//Si no pone algun numer de los valores le avisara
			if(num<min||num>max) {
				System.out.println("Error: No puso un numero entre los valores pedidos");
			}
		}catch(Exception e) {
			System.out.println("Error: "+e.getMessage());
			ok=false;
		}
		}while(!ok||num<min||num>max);
		return num;
	}
	//Reccorrera la lista para darle un id a la persona
	public static int daNumero(List <empleado> lista) {
		//pedimos la lista y la recorremos
		int id=0;
		 for(int i=0;i<lista.size();i++) {
			 int j=lista.get(i).getNumRegistro();
			 //Si se ueda alguna id disponible se quedra con la pequeña si cogera uno nuevo
			 if(id<j)
				 id=j;
		 }
		 return id+1;
	}
	//el menu de la aplicacion
	public static void menu() {
		System.out.println("--------------------------------------------------");
		System.out.println("Bienvenido:");
		System.out.println("1-Ingreso");
		System.out.println("2-Modificar Empleado");
		System.out.println("3-Exportar En Un Archivo");
		System.out.println("0-Salir");
		System.out.println("--------------------------------------------------");
	}
}
