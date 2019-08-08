import java.util.Scanner;
public class ex19 {

	public static void main(String[] args) {
		
		    int a, b, c , delta, d = -4, b2, v2;
		    double r2,r1;    
		    //Renomeando importações
		    Scanner entrada = new Scanner(System.in);

		    //Capturando variáveis
		    System.out.println("Seja bem vindo a Calculadora de Equações do 2º Grau !");
		    System.out.print("Digite o termo \"a\": ");
		        a = entrada.nextInt();
		     if (a==0) {
		    	 System.exit(0);
		     }
		    System.out.print("Digite o termo \"b\": ");
		        b = entrada.nextInt();
		    System.out.print("Digite o termo \"c\": ");    
		        c = entrada.nextInt();
		        b2 = b*b;
		        v2 = ((-4)*(a)*(c));
		        delta = (b*b)+((-4)*(a)*(c));
		       if(delta<0) {
		    	   System.out.println("A equação não possui raizes reais. Informe ao usuário e");
		    	   System.exit(0);
		       }
		    if (v2 > 0) {
		        System.out.println("Resolução da Fórmula de Báskara: " + b2 + "+" + v2);
		    }    
		        else
		            System.out.println("Resolução da Fórmula de Báskara: " + b2 + "-" + v2);
		    System.out.println("Resolução da Fórmula de Báskara: " + (delta));

		    System.out.println("");

		    //Fórmula Geral da Equação de segundo grau.
		    System.out.println("Resultados das raízes: ");
		    if (delta < 0){ 
		        System.out.println("Não existe raíz real, Delta=0");
		    }
		        else {
		            r1 = (-b + Math.sqrt(delta)) / (2*a);
		                System.out.println("A 1º raíz é: " + r1);
		            r2 = (-b - Math.sqrt(delta)) / (2*a);
		                System.out.println("A 2º raíz é: " + r2);

		        }
		    }
		}
	


