package deberes;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		float presupuesto;
		
		System.out.println("Presupuesto de este a�o: ");
		presupuesto = teclado.nextFloat();

		System.out.printf("Presupuesto Ginecolog�a: " + "%.2f %n", presupuesto*0.40);
		System.out.printf("Presupuesto Traumatolog�a: " + "%.2f %n", presupuesto*0.30);
		System.out.printf("Presupuesto Pediatr�a: " + "%.2f %n", presupuesto*0.30 );
		teclado.close();
	}

}
