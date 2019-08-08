import java.util.Scanner;

public class ex24 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
	    int q,w,r= 0;
	    System.out.println("Escreva  as 3 notas do Bimestre"); 
					 	q = entrada.nextInt();
					 	w = entrada.nextInt();
					 	r = entrada.nextInt();
					 	float p=(q+w+r)/3;
		if ((p>=7)&(p<10)) {
			System.out.println("aprovado com media "+ p);
		}else if (p<7) {
			System.out.println("reprovado com media "+p);
		}else if(p==10) {
			System.out.println("Aprovado com Distinção com media "+ p);
		}
	}

}
