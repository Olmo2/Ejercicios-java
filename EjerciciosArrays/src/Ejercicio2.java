import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n;
		do {
			System.out.println("¿Tamaño del Array? (Entre 10 & 1.000.000):");
			n = teclado.nextInt();
			if (n < 10 || n > 1000000) {
				System.out.println("Entre 10 y 1.000.000  retrasado ");
				n = teclado.nextInt();
			}
		} while (n < 10 && n >= 1000000);

		int[] vector = new int[n];
		Random r = new Random();
		long t0 = System.currentTimeMillis();
		for (int i = 0; i < n; i++) {
			int valor;
			do {
				valor = r.nextInt(2000000) - 999999;
				// "i - 1 " es el valor hasta el que el bucle va a buscar = p
			} while (repetido(vector, valor, i - 1));

			vector[i] = valor;
		}
		long t1 = System.currentTimeMillis();
		delorean(t1 - t0);
		
//		for (int i = 0; i < n; i++) {
//			System.out.print(vector [i] + " ");
//		}
//		System.out.println();
	}

	static boolean repetido(int[] vector, int valor, int p) {
		for (int i = 0; i <= p; i++) {
			if (vector[i] == valor) {
				return true;
			}
		}
		return false;
	}
	
	static void delorean(long t) {
		long m = t /60000;
		t = t % 60000;
		long s = t /1000;
		t = t % 1000;
		System.out.println(m + "m " + s + "s " + t + "ms");
	}
	
}
