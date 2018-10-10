package deberes;

import java.util.Scanner;

public class Ejercicio2Resuelto {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float comision1;
		float comision2;
		float comision3;
		//"final float" añade un valor que va a ser constante, en este caso el sueldo
		//y el porcetaje de comision sobre cada venta
		final float sueldo = 1200;
		// "0.1f"--> transforma en variable tipo "float"
		final float porcentaje = 0.1f;
		System.out.println("Valor de venta 1: ");
		comision1 = teclado.nextFloat() * porcentaje;
		
		System.out.println("Valor de venta 2: ");
		comision2 = teclado.nextFloat() * porcentaje;
		
		System.out.println("Valor de venta 3: ");
		comision3 = teclado.nextFloat() * porcentaje;
		//sueldo base 1200 euros
		System.out.printf("Comisión sobre venta 1: " + "%.2f %n", comision1);
		System.out.printf("Comisión sobre venta 2: " + "%.2f %n", comision2);
		System.out.printf("Comisión sobre venta 3: " + "%.2f %n", comision3);
		// metemos la operacion entre parentesis para que la interprete como una operación
		System.out.printf("Sueldo Final: " + "%.2f %n", (comision1 + comision2 + comision3 +1200) );
		teclado.close();

	}

}
