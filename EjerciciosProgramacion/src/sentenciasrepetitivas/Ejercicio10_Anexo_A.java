package sentenciasrepetitivas;

import java.util.Scanner;

public class Ejercicio10_Anexo_A {
	
	public static void main(String args[]) {
		
	Scanner sc = new Scanner(System.in);
	int n;
		
	System.out.println("Cuántos cuadrados de los n nñumeros naturales desea obtener?");
	n = sc.nextInt();
		
	for(int i = 0; i <= n; i++) {
		
		System.out.println(i + "\t,su cuadrado es:" + (i * i));
		
	}
	
	sc.close();
	
	}

}
