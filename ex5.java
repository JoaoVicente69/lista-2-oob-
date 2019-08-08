//Faça um Programa que verifique se uma letra digitada é vogal.
import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		
	Scanner entrada = new Scanner(System.in);
	System.out.println("escreva uma letra");
char l =' ';
	l=entrada.nextLine().charAt(0);

	switch(l){
	case'a':
	case'e':
	case'i':
	case'o':
	case'u':

		System.out.println("a letra "+l+" e uma vogal");
		break;
	 default:
		System.out.println("a letra "+l+" e uma consoante");
	}

	}

}
