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
			System.out.println("Triángulo válido");
			if(a != b && a!= c && b != c ){
				System.out.println("Triángulo Escaleno");
			}
			if(a == b && a == c) {
				System.out.println("Triángulo Equilátero");
			}
			if((a == b && a!=c) || (c == b && a!=c) ) {
				System.out.println("Triángulo Isósceles");
			}
		}
		else {
			System.out.println("Triángulo no válido");
		}
	}
}
