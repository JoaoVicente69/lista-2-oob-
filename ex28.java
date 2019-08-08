import java.util.Scanner;
public class ex28 {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	int q1,q2,q3,q4,q5=0;
	int invetigacao=0;
	System.out.println("responda as perguntas\n0-verdadeiro\n1-falso\n");
	
	System.out.println("Telefonou para a vítima?");
	q1=entrada.nextInt();
	
	System.out.println("Esteve no local do crime?");
	q2=entrada.nextInt();
	
	System.out.println("Mora perto da vítima?");
	q3=entrada.nextInt();
	
	System.out.println("Devia para a vítima?");
	q4=entrada.nextInt();
	
	System.out.println("Já trabalhou com a vítima?");
	q5=entrada.nextInt();
	
	invetigacao=q1+q2+q3+q4+q5;
	
	if(invetigacao==2) {
		System.out.println("Suspeita");
	}else if((invetigacao==3)||(invetigacao==4)) {
		System.out.println("Cúmplice");
	}else if (invetigacao==5) {
		System.out.println("Assassino");
		
	}
	
	
	}

}





