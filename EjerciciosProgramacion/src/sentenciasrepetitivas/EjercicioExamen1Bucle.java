package sentenciasrepetitivas;

import java.util.Scanner;

public class EjercicioExamen1Bucle {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int M;
		int N;

		System.out.println("Introduce valores impares y mayores que 3: ");

		System.out.println("�Ancho? (M)");
		M = teclado.nextInt();

		System.out.println("�Alto? (N)");
		N = teclado.nextInt();

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
