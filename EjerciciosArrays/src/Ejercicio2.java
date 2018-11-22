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
		long t0 = System.nanoTime();
		for (int i = 0; i < n; i++) {
			int valor;
			do {
				valor = r.nextInt(2000000) - 999999;
				// "i - 1 " es el valor hasta el que el bucle va a buscar = p
			} while (repetido(vector, valor, i - 1));

			vector[i] = valor;
		}
		long t1 = System.nanoTime();
		delorean(t1 - t0);
		
		
		long t2 = System.nanoTime();
		int numeromenor = vector[0];
		int numeromayor = vector[0];
		for(int i = 1; i < vector.length; i++) {
			if(numeromenor > vector[i]) 
				numeromenor = vector[i];
			if(numeromayor < vector[i]) 
				numeromayor = vector[i];
		}
		
	
		long t3 = System.nanoTime();
		
		
		System.out.println("El mayor número es: " + numeromayor);
		System.out.println("El menor número es: " + numeromenor);
		System.out.println("La difenrencia es: " + (numeromayor - numeromenor));
		delorean(t3 - t2);
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
			long m = t /60000000000L;
			t = t % 60000000000L;
			long s = t /1000000000L;
			t = t % 1000000000L;
			System.out.println(m + "m " + s + "s " + t + "ns");
		}
	

	
	
	
}
