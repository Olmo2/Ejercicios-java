package deberes;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		float presupuesto;
		
		System.out.println("Presupuesto de este año: ");
		presupuesto = teclado.nextFloat();

		System.out.printf("Presupuesto Ginecología: " + "%.2f %n", presupuesto*0.40);
		System.out.printf("Presupuesto Traumatología: " + "%.2f %n", presupuesto*0.30);
		System.out.printf("Presupuesto Pediatría: " + "%.2f %n", presupuesto*0.30 );
		teclado.close();
	}

}
