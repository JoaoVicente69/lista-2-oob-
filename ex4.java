/*Fa�a um Programa que pe�a para entrar com um ano com 4 d�gitos e determine se o
mesmo � ou n�o bissexto. */
import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("escreva um ano com 4 digitos");
	int ano=0;
	ano = entrada.nextInt();
    
     if(ano % 400 == 0){
        System.out.println(ano + " � bissexto.");
    } else if((ano % 4 == 0) && (ano % 100 != 0)){
        System.out.println(ano + " � bissexto.");
    } else{
        System.out.println(ano + " n�o � bissexto");
    }
		
	}

}
