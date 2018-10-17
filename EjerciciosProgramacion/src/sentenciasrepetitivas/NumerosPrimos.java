package sentenciasrepetitivas;

import java.util.Scanner;

public class NumerosPrimos {

	public static void main(String[] args) {
		//Generar los primeros n números primos
		Scanner teclado = new Scanner(System.in);
		System.out.println("¿Cuántos número primos quieres generar?");
		int n = teclado.nextInt();
		int candidato = 3;
		while(n>0) {
			int divisor = candidato - 1;
			int resto;
			do {
				resto = candidato % divisor;
				if(resto !=0) /*porque este if???????*/
						divisor--;
			} while(divisor > 1 && resto > 0);
				if(divisor == 1) {
					System.out.println(candidato + " Es primo");
					n--;
					
				}
				candidato++;
		}
			
		}
	}


