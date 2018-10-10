package deberes;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		float parcial1;
		float parcial2;
		float parcial3;
		float examen;
		float trabajo;
		
		System.out.println("Nota parcial 1: ");
		parcial1 = teclado.nextFloat();
		
		System.out.println("Nota parcial 2: ");
		parcial2 = teclado.nextFloat();
		
		System.out.println("Nota parcial 3: ");
		parcial3 = teclado.nextFloat();
		
		System.out.println("Nota Examen Final: ");
		examen = teclado.nextFloat();
		
		System.out.println("Nota Trabajo Final: ");
		trabajo = teclado.nextFloat();
		
		System.out.printf("Calificación Final: "+ "%.2f %n", ((parcial1+parcial2+parcial3)/3)*0.55+examen*0.3+trabajo*0.15);
		teclado.close();
		
	}

}
