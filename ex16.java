import java.util.Scanner;

public class ex16 {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
    int q,w,r,t = 0;
    System.out.println("Escreva  as 4 notas do Bimestre"); 
				 	q = entrada.nextInt();
				 	w = entrada.nextInt();
				 	r = entrada.nextInt();
				 	t = entrada.nextInt();
				 	float p=(q+w+r+t)/4;
	if (p<=3) {
		System.out.println("reprovado");
	}else if ((p>3)&(p<=6.9)) {
		System.out.println("exame");
	}else {
		System.out.println("aprovado");
	}


	}

}
