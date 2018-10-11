package deberes;

import java.util.Scanner;
//Ejercicio7: Dados X y Y, verificar si X es divisible por Y.
public class DeterminarDivisibilidad {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int X;
		int Y;
		
		System.out.println("Introduce el Primer Número: ");
		X = teclado.nextInt();

		System.out.println("Introduce el Segundo Número: ");
		Y = teclado.nextInt();
		
		if(X%Y==0) {
			System.out.println(X + " Es Divisible entre " + Y);
		}
		else {
			System.out.println(X + " No es Divisible entre " + Y);
		}
		teclado.close();
	}

}
