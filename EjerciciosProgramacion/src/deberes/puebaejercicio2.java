package deberes;

import java.util.Scanner;

public class puebaejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float venta;
		float comision;
		float sueldo = 1200;
		final float porcentaje = 0.1f;
		
		System.out.println("Valor De la Venta 1: ");
		venta = teclado.nextFloat();
		comision = venta*porcentaje;
		sueldo += comision;
		System.out.println(sueldo );

	}

}
