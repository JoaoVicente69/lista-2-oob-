/*Faça um Programa que verifique se uma letra digitada é "F" ou "M". Conforme a letra
escrever: F - Feminino, M - Masculino. */
import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("escreva F - para feminino e M - para Masculino ");
	char sexo =' ';
	sexo = entrada.nextLine().charAt(0);
	
	if(sexo== 'f'){
		System.out.println("feminino");
	}else{
		System.out.println("Masculino");
	}
	entrada.close();

	}

}
;