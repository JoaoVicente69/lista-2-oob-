/*Fa�a um Programa que leia tr�s n�meros e mostre o maior e o menor deles*/
import java.util.Scanner;
public class ex10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		{

			int a;
			int b;
			int c;
			int d;
			int e;
			int maior;
			int menor;

			Scanner entrada = new Scanner( System.in );

			System.out.println("Entre com o primeiro n�mero");
			a = input.nextInt();

			System.out.println("Entre com o segundo n�mero");
			b = input.nextInt();

			System.out.println("Entre com o terceiro n�mero");
			c = input.nextInt();

			maior = a;
			menor = a;

			if (b > maior) {
				maior = b ;
				}

			if (c > maior) {
				maior = c ;
				}

			System.out.println("o maior numeor foi "+maior);

			if (b < menor) {
				menor = b ;
				}

			if (c < menor) {
				menor = c ;
				}


			System.out.println("o menor numero foi "+menor);
		
		
	}
	
	}

}
