package deberes;

import java.util.Scanner;
//Ejercicio 3: Determine si un n�mero Z es par o impar.
public class DeterminacionDeParidad {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int Z;
		
		System.out.println("Introduce un N�mero: ");
		Z = teclado.nextInt();
		
		
		 if (Z % 2 == 0) {
			 System.out.println(Z + " es Par ");
		 }
		 else {
			 System.out.println(Z + " es Impar ");
		 }
			teclado.close();	
	}
	}

