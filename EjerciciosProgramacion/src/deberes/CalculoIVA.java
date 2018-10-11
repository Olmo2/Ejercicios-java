package deberes;

import java.util.Scanner;

public class CalculoIVA {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		float precio;
		int factor;
		
		System.out.println("Valor del producto");
		precio = teclado.nextFloat();
		
		System.out.println("Tipo de I.V.A");
		factor = teclado.nextInt();
		
		if(factor == 4) {
			System.out.println("PVP: " + (precio * factor*1.01));
		}
		else {
			if(factor == 7) {
				System.out.println("PVP: " + (precio * factor*1.01));
		}
			else {
				if(factor == 16) {
					System.out.println("PVP: " + (precio * factor*1.01));
			}
				else {
						System.out.println("El valor no es valido ha de ser 4,7 o 16 " );
				}
			}

		}
	}
}