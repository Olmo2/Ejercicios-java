package sentenciasrepetitivas;

import java.util.Scanner;

public class EjercicioExamen3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int numero = 0;
		System.out.println("Inicio de la secuencia(Número entero mayor que 1):");
		numero = teclado.nextInt();
		if (numero % 2 == 0) {
			do {
					System.out.println(numero/2);
					numero=(numero/2);
				}while (numero>=1);
			} else { 
			do {
				 
					System.out.println((numero * 3) + 1);
					numero = ((numero * 3) + 1);
				} while(numero>=1);
			
			}
		teclado.close();
		}
	

	}

