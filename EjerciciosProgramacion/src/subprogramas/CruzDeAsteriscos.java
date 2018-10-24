package subprogramas;

import java.util.Scanner;

public class CruzDeAsteriscos {
	static Scanner teclado = new Scanner(System.in);
	
	static int obtenerFC(String fc) {
		int x;  
		do {
			System.out.println("Número de "+ fc + ": ");
			x = teclado.nextInt();
			if (x < 3 || x % 2 == 0) {
				System.out.println("Número de"+ fc +" incorrecto ");
			}
			} while (x < 3 || x % 2 == 0);
			return x;
	}
	
	public static void main(String[] args) {
		int M=obtenerFC("Filas");
		int N=obtenerFC("Columnas");

//		System.out.println("Introduce valores impares y mayores que 3: ");
//
//		System.out.println("¿Ancho? (M)");
//		M = teclado.nextInt();
//
//		System.out.println("¿Alto? (N)");
//		N = teclado.nextInt();

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (j == M / 2 || i == N / 2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		teclado.close();

	}

}
