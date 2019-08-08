import java.util.Scanner;
public class ex14 {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	int dia_semana=0;
	
	System.out.println("escreva um numero de 1 a 7 para ser sua representação em dia da semana");
	dia_semana=entrada.nextInt();
	
	switch (dia_semana) {
	case 1:
		System.out.println("domindo");
		break;
	case 2:
		System.out.println("segunda feira");
		break;
	case 3:
		System.out.println("terça feira");
		break;
	case 4:
		System.out.println("quarta feira");
		break;
	case 5:
		System.out.println("quinta feira");
		
		break;
	case 6:
		System.out.println("sexta feira");
		break;
	case 7:
		System.out.println("sabado ");
		break;

		
	
	}
	
	}

}
