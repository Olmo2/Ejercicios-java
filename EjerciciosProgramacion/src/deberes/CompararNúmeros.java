package deberes;

import java.util.Scanner;

public class CompararNúmeros {
/*Dados dos números verificar cual es mayor (considerar la igualdad)*/
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero1;
		int numero2;
		
		System.out.println("Primer Número: ");
		numero1 = teclado.nextInt();
		
		System.out.println("Segundo Número: ");
		numero2 = teclado.nextInt();
		
		
		if(numero1 > numero2) {
			System.out.println(numero1 + " es mayor que " + numero2);
		}
		else {
			if (numero1 < numero2) {
				System.out.println(numero2 + "es menor que " + numero1);
			}
			else {
				System.out.println(  numero1 + " es igual que " + numero2 );
			}
		}
		
		
		teclado.close();
	}
}
