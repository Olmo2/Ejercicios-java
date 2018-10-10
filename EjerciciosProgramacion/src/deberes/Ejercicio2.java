package deberes;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float comision1;
		System.out.println("Valor de venta 1: ");
		comision1 = teclado.nextFloat();
		
		float comision2;
		System.out.println("Valor de venta 2: ");
		comision2 = teclado.nextFloat();
		
		float comision3;
		System.out.println("Valor de venta 3: ");
		comision3 = teclado.nextFloat();
		//sueldo base 1200 euros
		System.out.printf("Comisión sobre venta 1: " + "%.2f %n", comision1*0.1);
		System.out.printf("Comisión sobre venta 2: " + "%.2f %n", comision2*0.1);
		System.out.printf("Comisión sobre venta 3: " + "%.2f %n", comision3*0.1);
		System.out.printf("Sueldo Final: " + "%.2f %n", comision1*0.1 + comision2*0.1 + comision3*0.1 +1200  );
	teclado.close();
	}

}
