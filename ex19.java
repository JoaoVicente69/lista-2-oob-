import java.util.Scanner;
public class ex19 {

	public static void main(String[] args) {
		
		    int a, b, c , delta, d = -4, b2, v2;
		    double r2,r1;    
		    //Renomeando importa��es
		    Scanner entrada = new Scanner(System.in);

		    //Capturando vari�veis
		    System.out.println("Seja bem vindo a Calculadora de Equa��es do 2� Grau !");
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
		    	   System.out.println("A equa��o n�o possui raizes reais. Informe ao usu�rio e");
		    	   System.exit(0);
		       }
		    if (v2 > 0) {
		        System.out.println("Resolu��o da F�rmula de B�skara: " + b2 + "+" + v2);
		    }    
		        else
		            System.out.println("Resolu��o da F�rmula de B�skara: " + b2 + "-" + v2);
		    System.out.println("Resolu��o da F�rmula de B�skara: " + (delta));

		    System.out.println("");

		    //F�rmula Geral da Equa��o de segundo grau.
		    System.out.println("Resultados das ra�zes: ");
		    if (delta < 0){ 
		        System.out.println("N�o existe ra�z real, Delta=0");
		    }
		        else {
		            r1 = (-b + Math.sqrt(delta)) / (2*a);
		                System.out.println("A 1� ra�z �: " + r1);
		            r2 = (-b - Math.sqrt(delta)) / (2*a);
		                System.out.println("A 2� ra�z �: " + r2);

		        }
		    }
		}
	


