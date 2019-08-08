/*As Organizações Tabajara resolveram dar um aumento de salário aos seus
colaboradores e lhe contrataram para desenvolver o programa que calculará os
reajustes.0
o Faça um programa que recebe o salário de um colaborador e calcule o reajuste
segundo o seguinte critério, baseado no salário atual:
o salários até R$ 280,00 (incluindo) : aumento de 20%
o salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
o salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
o salários de R$ 1500,00 em diante : aumento de 5% Após o aumento ser
realizado, informe na tela:
o o salário antes do reajuste;
o o percentual de aumento aplicado;
o o valor do aumento;
o o novo salário, após o aumento. */
import java.util.Scanner;
public class ex12 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("qual seu salario");
		float salario=0;
		salario=entrada.nextFloat();
		double novo_salario=0;
		double almento=0;
	
		if(salario<=280) {
			almento=(salario*0.20);
			novo_salario=almento+salario;
			
		}else if((salario>=150)||(salario<=700)) {
			almento=(salario*0.15);
			novo_salario=almento+salario;
			
		}else if((salario>=700)||(salario<=1500)) {
			almento=(salario*0.10);
			novo_salario=almento+salario;
			
		}else {
			almento=(salario*0.05);
			novo_salario=almento+salario;
			
		}
	System.out.println("O salario atual é de "+ salario+ "\n O almento sera de "+almento+"\n O salrio com reajuste sera de "+novo_salario);
		}
}
