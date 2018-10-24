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
				
				
			
				if (t >= digitos / 2  ) {
		
					System.out.print(n--%10);
				} else if (t <= digitos / 2  )
					System.out.print(n++%10);
				}
					
			
			
				System.out.println();

			}

		}
}

