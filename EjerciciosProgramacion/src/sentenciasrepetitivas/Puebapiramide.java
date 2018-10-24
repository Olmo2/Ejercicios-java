package sentenciasrepetitivas;

public class Puebapiramide {

	public static void main(String[] args) {
		 int i,j;
		  for(i=1;i<=10;i++)
		  {
		   for(j=1;j<=10-i;j++)
		   System.out.print(" ");
		   for(j=i;j<=i+i-1;j++)
		   System.out.print(j%10);
		   for(j=j-2;j>=i;j--)
		   System.out.print(j%10);
		   System.out.println();
		  }
		 }
		}

	