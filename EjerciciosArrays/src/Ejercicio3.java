import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		/*
		 * Programa que cree un vector de números enteros de un tamaño especificado por
		 * el usuario, mayor o igual que 10 y menor o igual que 1.000.000. El vector se
		 * llenará con números aleatorios comprendidos entre -100 y 100. A continuación
		 * mostrará la suma de los números almacenados. Teniendo en cuenta que hay quien
		 * piensa que el número 13 es el número de la mala suerte, si se encuentra
		 * almacenado en alguna posición del vector, no se sumará ni este número ni los
		 * que se encuentren almacenados en las 13 posiciones siguientes (o las que haya
		 * hasta el final del vector si estas son menos de 13) si la suma de todos ellos
		 * es distinta de 7.
		 */
		Scanner teclado = new Scanner(System.in);
		int n;
		do {
			System.out.println("¿Tamaño del Array? (Entre 10 & 1.000.000):");
			n = teclado.nextInt();
			if (n < 10 || n >= 1000000) {
				System.out.println("Entre 10 y 1.000.000  retrasado ");
				n = teclado.nextInt();
			}
		} while (n < 10 && n >= 1000000);
		int[] vector = new int[n];
		Random r = new Random();
		for (int i = 0; i < n; i++) {
			vector[i] = r.nextInt(201) - 100;
		}

		int suma = 0;
		int parcial;
		for (int i = 0; i < n; i++) {

			if (vector[i] != 13) {
				suma += vector[i];
			} else {

				parcial = vector[i];

				for (int j = i + 1; j < vector.length && j < i + 13; j++) {
					parcial += vector[i];
				}
				if (parcial == 7) 
					i += 13;
			}
		}
		System.out.println("Suma: " + suma);
	}
}
