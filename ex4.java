/*Faça um Programa que peça para entrar com um ano com 4 dígitos e determine se o
mesmo é ou não bissexto. */
import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("escreva um ano com 4 digitos");
	int ano=0;
	ano = entrada.nextInt();
    
     if(ano % 400 == 0){
        System.out.println(ano + " é bissexto.");
    } else if((ano % 4 == 0) && (ano % 100 != 0)){
        System.out.println(ano + " é bissexto.");
    } else{
        System.out.println(ano + " não é bissexto");
    }
		
	}

}
