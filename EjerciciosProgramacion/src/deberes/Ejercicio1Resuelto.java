package deberes;

import java.util.Scanner;

public class Ejercicio1Resuelto {

	public static void main(String[] args) {
			Scanner teclado = new Scanner(System.in);
			float capital;
		//	float retribucion; //podemos ahorrarnos esto
			
			
			//Utilizamos float en vez de double por la cantidad de memoria que consume
			System.out.println("introduce el capital: ");
			capital = teclado.nextFloat();
			//retribucion = capital * 1.02f; // no es necesario
			
			
			// la "f" convierte el 1.02 en "float" aun siendo "double"
		//	System.out.println("Retribución: "+ retribucion); 
			System.out.println("Retribución: "+ capital * 0.02f);
			teclado.close();
			//el "+" aqui realiza una union de dos trozos de texto el valor numérico se interpreta como texto
			// falta formatear la salida de datos
		
	}

}
