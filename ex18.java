import java.util.Scanner;

public class ex18 {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	float a,b,c=0;
	System.out.println("escreva as medidas dos lado do triangilo");
	a=entrada.nextFloat();
	b=entrada.nextFloat();
	c=entrada.nextFloat();
	
	float soma_lados=0;
	soma_lados = a+b;
	
	if (soma_lados<c) {
		System.out.println("Não é um triangulo");
	}else if ((a==b)&(b==c)) {
		System.out.println("Triângulo Equilátero");
	}else if ((a==b)&(b==c)&(c==a)) {
		System.out.println("Triângulo Isósceles:");
	}else if ((a!=b)&(a!=c)&(c!=b)) {
		System.out.println("Triângulo Escaleno");
	}
	}

}
