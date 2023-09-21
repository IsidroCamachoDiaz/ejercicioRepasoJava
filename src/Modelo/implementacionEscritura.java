package Modelo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class implementacionEscritura implements interfazEscritura {

	public PrintWriter abrirArchivo(String ruta,boolean sobreEscribir) {
		//Se pone los objetos a nulos
				FileWriter fichero = null;
		        PrintWriter pw = null;
		        try
		        {
		        	//se pasa la ruta y se pone a true para que sobrecriba y dej alo anterior
		            fichero = new FileWriter(ruta,sobreEscribir);
		            pw = new PrintWriter(fichero);
		            //Cabecera
			        pw.println("Nombre;Apellidos;DNI;Fecha de Nacimiento;Titulacion Mas Alta");

		        } catch (IOException ioe) {
		        	//Si no lo encunetra manada el error
		        	System.out.print("[ERROR] - FICHERO NO ENCONTRARO: " + fichero + "\n" + ioe);
		        } 		       
		        return pw;
	}
	public PrintWriter Escribir(PrintWriter pw,String texto) {
		//Se pide el texto para escribir y se escribe
		pw.println(texto);
		return pw;
	}
	
	public void Cerrar(PrintWriter fichero) {
		//Cierra el fichero
		fichero.close();
	}
}
