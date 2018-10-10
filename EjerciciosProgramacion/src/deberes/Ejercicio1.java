package deberes;

import java.util.Scanner;

public class Ejercicio1 {
	

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//Configuarar entrada del teclado
		
		double capital;
		System.out.println("Importe a invertir");
		capital = teclado.nextDouble();
		//utilizar el teclado
		 
		double total;
		total = capital * 1.02;
		// una variable
		
		double ganancia;
		ganancia = capital *0.02;
		// una variable
		
		System.out.printf("Resultado de la inversion: " + "%.2f %n", total);
	
		System.out.printf("Capital bruto ganado: "+ "%.2f %n", ganancia);
		//System.out.printf da formato a la salida de datos
		teclado.close();

	}

}
