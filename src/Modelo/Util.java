package Modelo;

import java.util.Scanner;

public class Util {
	public static int CapturaEntero(String texto,int min,int max){
		boolean ok=true;
		int num=0;
		Scanner leer = new Scanner (System.in);
		do {
		try {	
		System.out.println(texto+"del "+min+" a "+max);
		num=leer.nextInt();
			if(num<min||num>max) {
				System.out.println("Error: No puso un numero entre los valores pedidos");
			}
		}catch(Exception e) {
			System.out.println("Error: "+e.getMessage());
			ok=false;
		}
		}while(!ok||num>min||num>max);
		return num;
	}
}
