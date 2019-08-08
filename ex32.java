import java.util.Scanner;
public class ex32 {
// (a,a,b,b,c,c,d,d,e,e) 
	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	char [] notas= new char [9];
	int cont=0;
	
	System.out.println("escreva as 10 resposta da prova(a,b,c ou d");
	for(int k =0; k <10; k++) {
	System.out.println("Q1");
	notas[k]=entrada.nextLine().charAt(0);
		if (notas[0]=='a') {cont=cont+1;}
	System.out.println("Q2");
	notas[k]=entrada.nextLine().charAt(0);
		if (notas[1]=='a') {cont=cont+1;}
	System.out.println("Q3");
	notas[k]=entrada.nextLine().charAt(0);
		if (notas[2]=='b') {cont=cont+1;}
	System.out.println("Q4");
	notas[k]=entrada.nextLine().charAt(0);
		if (notas[3]=='b') {cont=cont+1;}
	System.out.println("Q5");
	notas[k]=entrada.nextLine().charAt(0);
		if (notas[4]=='c') {cont=cont+1;}
	System.out.println("Q6");
	notas[k]=entrada.nextLine().charAt(0);
		if (notas[5]=='c') {cont=cont+1;}
	System.out.println("Q7");
	notas[k]=entrada.nextLine().charAt(0);
		if (notas[6]=='d') {cont=cont+1;}
	System.out.println("Q8");
	notas[k]=entrada.nextLine().charAt(0);
		if (notas[7]=='d') {cont=cont+1;}
	System.out.println("Q9");
	notas[k]=entrada.nextLine().charAt(0);
		if (notas[8]=='e') {cont=cont+1;}
	System.out.println("Q10");
	notas[k]=entrada.nextLine().charAt(0);
		if (notas[9]=='e') {cont=cont+1;}
	System.out.println("sua pontuação final foi de "+cont+"\n");
	}
	System.out.println("GABARITO ");
	for(int k =0; k <10; k++) {
		System.out.println("Q1: resposta correta A sua resposta" +notas[k]);
		System.out.println("Q2: resposta correta  A sua resposta" +notas[k]);
		System.out.println("Q3: resposta correta  B sua resposta" +notas[k]);
		System.out.println("Q4: resposta correta  B sua resposta" +notas[k]);
		System.out.println("Q5: resposta correta  C sua resposta" +notas[k]);
		System.out.println("Q6: resposta correta  C sua resposta" +notas[k]);
		System.out.println("Q7: resposta correta  D sua resposta" +notas[k]);
		System.out.println("Q8: resposta correta  D sua resposta" +notas[k]);
		System.out.println("Q9: resposta correta  E sua resposta" +notas[k]);
		System.out.println("Q10: resposta correta Esua resposta" +notas[k]);
		
	}

	}
	}
