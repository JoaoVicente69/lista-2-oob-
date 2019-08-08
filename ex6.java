/*Faça um Programa que peça um número inteiro e se este número for par, transforme-o
em impar e vice-versa.*/
import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	System.out.println("escreva um numero inteiro");
	int num=0;
	num =entrada.nextInt();
	
	if(num/2 == 0) {
		num= num+1;
		System.out.println(num);
		
	}else {
		num=num-1;
		System.out.println(num);
	}	

	}

}
