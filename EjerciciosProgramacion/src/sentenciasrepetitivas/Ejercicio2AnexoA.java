package sentenciasrepetitivas;

import java.util.Scanner;

public class Ejercicio2AnexoA {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
			/*Hacer una tabla de la función f(x)=1/x, con 11 valores, comenzando en
			un número negativo A y terminando en –A, los valores de x deben estar
			igualmente espaciados. Note que la serie pasará por x=0.*/
	float x=-6;
	float y;
	
	for(int i=1; i<=11; i++){
		
		x++;
		y=1/x;
		System.out.println("Para x =" + x + " y es igual a " + y);
		
	
	}
	
	{
	}
	}
}
