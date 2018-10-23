package sentenciasrepetitivas;

import java.util.Scanner;

public class Ejercicio9AnexoA {
	
	public static void main(String args[]) {
		
	Scanner sc = new Scanner(System.in);
	int n , resultado = 0;
	
	System.out.println("Cuántos números desea sumar");
	n = sc.nextInt();
	
	for(int i = 0; i <= n; i++) {
		
		resultado = resultado + i;
	}
	
	System.out.println(resultado);
	}

}
