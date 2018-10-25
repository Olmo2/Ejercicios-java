package sentenciasrepetitivas;

import java.util.Scanner;

public class CubosNicomaco {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numeroimpar = -1;
		System.out.println("Numero de cubos a calcular");
		int n = teclado.nextInt();

		for (int i = 1; i <= n; i++) {

		numeroimpar = numeroimpar + 2;
		int suma = numeroimpar;
		for (int j = 2; j <= i; j++) {
		numeroimpar +=2 ;
		
		suma = suma + numeroimpar;
		}
		System.out.println(i + "^3= " + suma);
		}

		}
}

	
