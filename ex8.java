import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
	    int q,w,r,t = 0;
	    System.out.println("Escreva  as 2 notas do Bimestre"); 
					 	q = entrada.nextInt();
					 	w = entrada.nextInt();

					 	float p=(q+w)/7;
		if (p<7) {
			System.out.println("reprovado");
		}else {
			System.out.println("aprovado");

	}
	}
}
