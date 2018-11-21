import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		/*
		 * Programa que cree un vector de números enteros de un tamaño especificado por
		 * el usuario, mayor que 1 y menor o igual que 50. El vector se llenará con
		 * números aleatorios comprendidos entre -100 y 100 sin repetir ninguno. A
		 * continuación se creará un segundo vector que contenga los elementos del
		 * anterior almacenados en orden inverso.
		 */
		Scanner teclado = new Scanner(System.in);
		int n;
		do {
			System.out.println("¿Tamaño del Array? (Entre 1 & 50):");
			n = teclado.nextInt();
			if (n < 2 || n > 50) {
				System.out.println("Entre 1 y 50  retrasado ");
				n = teclado.nextInt();
			}
		} while (n < 0 && n >= 50);

		int[] vector = new int[n];
		Random r = new Random();
		for (int i = 0; i < n; i++) {
			vector[i] = r.nextInt(201) - 100;
		}
		int[] vectorInvertido = new int[vector.length];
		for (int i = 0; i < n; i++) {
			vectorInvertido[vector.length - 1 - i] = vector[i];
		}
		for (int i = 0; i < n; i++) {
			System.out.print(vector [i] + " ");
		}
		for (int i = 0; i < n; i++) {
			System.out.print(vectorInvertido [i] + " ");
		}
	}
}
