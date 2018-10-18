package sentenciasrepetitivas;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n;
		System.out.println("¿Cuántos números quieres saber?");
		n=teclado.nextInt();
		float valor1 =0;
		float valor2 =1;
		float valord =0;
		for(int i=0; i<=n;i++) {
			System.out.println(valord = (valor1 + valor2));
			valor2 = valor1;
			valor1 = valord;
			
		
		

			}

		}
	}
