/*As Organiza��es Tabajara resolveram dar um aumento de sal�rio aos seus
colaboradores e lhe contrataram para desenvolver o programa que calcular� os
reajustes.0
o Fa�a um programa que recebe o sal�rio de um colaborador e calcule o reajuste
segundo o seguinte crit�rio, baseado no sal�rio atual:
o sal�rios at� R$ 280,00 (incluindo) : aumento de 20%
o sal�rios entre R$ 280,00 e R$ 700,00 : aumento de 15%
o sal�rios entre R$ 700,00 e R$ 1500,00 : aumento de 10%
o sal�rios de R$ 1500,00 em diante : aumento de 5% Ap�s o aumento ser
realizado, informe na tela:
o o sal�rio antes do reajuste;
o o percentual de aumento aplicado;
o o valor do aumento;
o o novo sal�rio, ap�s o aumento. */
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
	System.out.println("O salario atual � de "+ salario+ "\n O almento sera de "+almento+"\n O salrio com reajuste sera de "+novo_salario);
		}
}
