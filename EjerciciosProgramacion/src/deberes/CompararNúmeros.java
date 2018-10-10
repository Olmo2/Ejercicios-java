package deberes;

import java.util.Scanner;

public class CompararNúmeros {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero1;
		int numero2;
		
		System.out.println("Primer Número: ");
		numero1 = teclado.nextInt();
		
		System.out.println("Segundo Número: ");
		numero2 = teclado.nextInt();
		
		
		if(numero1>numero2) {
			System.out.println("El primer numero es mayor: " + numero1);
		}
		else {
			System.out.println("El segundo numero es mayor: " + numero2);
			
		}
		/*if(numero2>numero1) {
			System.out.println("El segundo numero es mayor: ");
		}
		if(numero1==numero2) {
			System.out.println("No me engañas, has metido el mismo número: ");
		}*/
	}
}
