//Fa�a um Programa que pe�a dois n�meros e imprima o maior deles
import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("escreva dois numeros");
	int nun1,nun2=0;
	nun1=entrada.nextInt();
	nun2= entrada.nextInt();
	
		if (nun1>nun2) {
			System.out.println("o maior numero � "+nun1);
		}else {
			System.out.println("o maior numero � "+nun2);
		}
	}

}
