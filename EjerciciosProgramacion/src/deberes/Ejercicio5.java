package deberes;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		float examenm;
		float taream1;
		float taream2;
		float taream3;

		System.out.println("Nota del Examen: ");
		examenm = teclado.nextFloat();
		
		System.out.println("Nota de la Tarea 1: ");
		taream1 = teclado.nextFloat();
		
		System.out.println("Nota de la Tarea 2: ");
		taream2 = teclado.nextFloat();
		
		System.out.println("Nota de la Tarea 3: ");
		taream3 = teclado.nextFloat();
		
		//System.out.printf("Nota Examen " + "%.2f %n", examenm );
		System.out.printf("Media Tareas " + "%.2f %n", (taream1+taream2+taream3)/3);
		
		System.out.printf("Nota Final " + "%.2f %n", examenm * 0.9 + ((taream1+taream2+taream3)/3)*0.1);
		teclado.close();
		
		
	}

}
