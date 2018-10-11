package deberes;

import java.util.Scanner;

public class TipoDeIvaCorrección {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float precio;
		System.out.println("Introduce precio");
		precio = teclado.nextFloat();
		System.out.println("Tipo de I.V.A: (0) 7% - (1) 10% - (2) 21%");
		int tipoIVA = teclado.nextInt();
		float iva = 0;
		if (tipoIVA == 0) {
			iva = 0.07f;
		} else {
			if (tipoIVA == 1) {
				iva = 0.1f;
			} else {
				if (tipoIVA == 2) {
					iva = 0.21f;
				} else {
					System.out.println("Introduce un valor válido");
				}
			}
		}
		
		if (iva != 0) {
			double totalIVA = precio * iva;
			double total = precio + totalIVA;

		}

	}

}
