package sentenciasrepetitivas;

import java.util.Scanner;

public class Triangulos {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int a;
		int b;
		int c;
		
		
		System.out.println("Lado a");
		a = teclado.nextInt();
		
		System.out.println("Lado b");
		b = teclado.nextInt();
		
		System.out.println("Lado c");
		c = teclado.nextInt();
		
		if(a < b+c && c < a+b && b < a + c ) { 
			System.out.println("Tri�ngulo v�lido");
			if(a != b && a!= c && b != c ){
				System.out.println("Tri�ngulo Escaleno");
			}
			if(a == b && a == c) {
				System.out.println("Tri�ngulo Equil�tero");
			}
			if((a == b && a!=c) || (c == b && a!=c) ) {
				System.out.println("Tri�ngulo Is�sceles");
			}
		}
		else {
			System.out.println("Tri�ngulo no v�lido");
		}
	}
}
