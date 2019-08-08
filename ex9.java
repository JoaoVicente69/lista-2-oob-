import java.util.Scanner;

/*. Tendo como dado de entrada a altura, peso e sexo, construa um algoritmo que calcule
o peso ideal, utilizando as seguintes fórmulas:
Para homens: (72.7*h) - 58
Para mulheres: (62.1*h) - 44.7
(h = altura)
Ao final o algoritmo deve mostrar:
- Altura, peso e sexo;
- Peso Ideal;
- Mensagem se está acima, abaixo ou no peso ideal;*/
public class ex9 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Se você for home digite F e se for mulher digite M");
		char sexo =' ';
		double resultado = 0;
		sexo = entrada.nextLine().toUpperCase().charAt(0);
		System.out.println("qual sua altura?");
		double a=entrada.nextDouble();
		System.out.println("qual seu peso?");
		double peso=entrada.nextDouble();
		
		if (sexo == 'f'){
			resultado= (62.1*a) - 44.7;
			if(resultado<peso) {
				System.out.println("acima do pesso ideal");
			}else if(resultado>peso) {
				System.out.println("abaixo do pessoa ideal");
			} else{System.out.println("peso ideal");}
		}else {
			resultado=(72.7*a) - 58;
			if(resultado< peso) {
				System.out.println("acima do pesso ideal");
			}else if(resultado>
			peso) {
				System.out.println("abaixo do pessoa ideal");
			} else{System.out.println("peso ideal");}
		}
	System.out.println("seu peso ideal para seu sexo e altura é de "+ resultado+"Kg");
	
	entrada.close();
	
	}

}
