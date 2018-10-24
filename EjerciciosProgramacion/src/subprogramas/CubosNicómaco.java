package subprogramas;

import java.util.Scanner;
  
public class CubosNicómaco {
	
//	static int impar() {
//		int y = 0;
//		int x = -1;
//		x+=2;
//		y+=x;
//	}
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int x = -1;
		 System.out.println("Numero de Cúbos: ");
		 int n = teclado.nextInt();
		 
	 
		 for(int i=1; i<=n;i++) {
			 System.out.println(i + "º cubo= " + (x+(2*i)) );
		 }
//			 while (i>=x) {
//				 System.out.println(i+"º Nº impar= " + (y+=2) );
//				 x++;
//			 }
//		 }
		 
		

	}

}
