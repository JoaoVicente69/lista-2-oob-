/*.Faça um Programa que pergunte em que turno você estuda. Peça para digitar MMatutino ou V-Vespertino ou N- Noturno. Imprima a mensagem "Bom Dia!", "Boa
Tarde!" ou "Boa Noite!" , conforme o caso. */
import java.util.Scanner;
public class ex11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("em que turmo você estuda\nM- Matutino\nV-Vespertino\nN- Noturno");
	
		char turno = entrada.nextLine().charAt(0);	
	
		if(turno=='m') {System.out.println("bom dia");
		}else if(turno=='v') {System.out.println("boa tarde");
		}else if(turno=='n') {
			System.out.println("boa noite");
		}
		
	}

}
