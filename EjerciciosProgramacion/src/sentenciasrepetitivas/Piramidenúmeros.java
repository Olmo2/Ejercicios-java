package sentenciasrepetitivas;

public class Piramidenúmeros {

	public static void main(String[] args) {

		for (int i = 0; i <= 10; i++) {
			int n = i % 10;
			int espacios = 10 - i;
			int digitos = i + i - 1;
			int j;
			for (j = 0; j < espacios; j++) {
				System.out.print(" ");

			}
			for (int t = 0; t < digitos; t++) {
				System.out.print(n);
				
				n = n % 10 +1;
			
//				if (t >= digitos / 2 || ) {
//		
//					n = n % 10 - 1 ;
//				} else {
//					n = n % 10 + 1;
//				}
					
			}
			
				System.out.println();

			}

		}
	
}
