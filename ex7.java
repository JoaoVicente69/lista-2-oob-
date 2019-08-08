/*Faça um Programa que leia três números e mostre-os em ordem decrescente*/
import java.util.Arrays;
import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	int numeros[] = new int[3];
	System.out.println("Escreva numero");
	for(int k =0; k<numeros.length;k++) {
	numeros[k]=entrada.nextInt();
	}
	
	Arrays.sort(numeros);
	for (int j = 0; j < numeros.length; j++) 
 	  {
 		System.out.print(numeros[j]+ "  ");       		
	  }
 	  
}
}
