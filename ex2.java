/*Faça um Programa que peça um valor e mostre na tela se o valor é positivo, negativo
ou zero. */

import java.util.Scanner;


public class ex2 {

	public static void main(String[] args) {
		
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("escreva um numero");
	int nun=0;
	nun=entrada.nextInt();
	
	if(nun>1) {
		System.out.println("o numero digitado é positivo");
	}else if(nun==0) {
		System.out.println("o numero digitado é igual a zero");	
	}else {
		System.out.println("o numero digitado é negativo");
		
	}
	

		

	}

}
