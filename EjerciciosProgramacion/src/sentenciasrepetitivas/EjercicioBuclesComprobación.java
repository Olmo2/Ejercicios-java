package sentenciasrepetitivas;

import java.util.Scanner;

public class EjercicioBuclesComprobación {

	public static void main(String[] args) {
		//Usaremos el bucle While para comprobar varias veces si un número es dibisible entre otro varias veces
		Scanner teclado = new Scanner(System.in);
		int numero1;
		int numero2;
		int respuesta;
		
		System.out.println("¿Comprobar si un número es divisible entre otro? SI(1)/NO(0)");
		respuesta = teclado.nextInt();
		
		while(respuesta==1) {
			System.out.println("Introduce un Número");
			numero1 = teclado.nextInt();
			
			System.out.println("Introduce un Número");
			numero2 = teclado.nextInt();
			
			if (numero1 % numero2 == 0)
				System.out.println(numero1 + " Es Divisible entre " + numero2);
			else
				System.out.println(numero1 + " No Es Divisible entre " + numero2);
			System.out.println("¿Comprobar si un número es divisible entre otro? (s(1)/n(0))");
			respuesta = teclado.nextInt();
		}
		
	}

}
