package sentenciasrepetitivas;

import java.util.Scanner;

public class NumerosPrimos {

	public static void main(String[] args) {
		//Generar los primeros n números primos
		Scanner teclado = new Scanner(System.in);
		System.out.println("¿Cuántos número primos quieres generar?");
		int n = teclado.nextInt();
		int candidato = 3;
		//candidato es el número que probamos como primo
		while(n>0) {
			int divisor = candidato - 1;
			// disminuimos en nº de el divisor para probar todos los numeros anteriores
			int resto;
			do {
				resto = candidato % divisor;
				if(resto !=0) /*porque este if???????, Aqui no esprimo porqueel resto no es 0*/
						divisor--;
			} while(divisor > 1 && resto > 0);
				if(divisor == 1) {
					//si divisor es = a 1 entonces la divion es exacta ergo es primo
					System.out.println(candidato + " Es primo");
					n--;
					
				}
				candidato++;
		}
			
		}
	}


