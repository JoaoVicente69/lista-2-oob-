/*13.Fa�a um programa para o c�lculo de uma folha de pagamento, sabendo que os
descontos s�o do Imposto de Renda, que depende do sal�rio bruto (conforme tabela
abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11% do Sal�rio Bruto, mas
n�o � descontado (� a empresa que deposita). O Sal�rio L�quido corresponde ao
Sal�rio Bruto menos os descontos. O programa dever� pedir ao usu�rio o valor da sua
hora e a quantidade de horas trabalhadas no m�s.
Desconto do IR:
Sal�rio Bruto at� 900 (inclusive) - isento
Sal�rio Bruto at� 1500 (inclusive) - desconto de 5%
Sal�rio Bruto at� 2500 (inclusive) - desconto de 10%
Sal�rio Bruto acima de 2500 - desconto de 20% Imprima na tela as informa��es, dispostas
conforme o exemplo abaixo. No exemplo o valor da hora � 5 e a quantidade de hora � 220.
 Sal�rio Bruto: (5 * 220) : R$ 1100,00
 (-) IR (5%) : R$ 55,00
 (-) INSS ( 10%) : R$ 110,00
 FGTS (11%) : R$ 121,00
 Total de descontos : R$ 165,00
 Sal�rio Liquido : R$ 935,00*/
import java.util.Scanner;
public class ex13 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("quanto voc� ganha por hora?");
		double salario =0;
		salario= entrada.nextDouble();
		System.out.println("quantas horas por dia mes voc� trabalha?");
		int horas=0;
		horas=entrada.nextInt();
		
			double salario_bruto= 0;
			salario_bruto = salario * horas;
		if (salario_bruto<=900) {
			System.out.println("seu Salario � de "+salario_bruto + " voc� � isento");
		}else if (salario_bruto<=1500) {
 			
			// desconto
			double desconto = 0;
			int des=5;
			desconto = (salario_bruto*5)/100;
			//sindicato
			double sind = 0;
			sind = (salario_bruto*3)/100;
			//FGTS
			double ir=0;
			ir=(salario_bruto*11)/100;
			//salario liquido,
			double desconto_total=desconto+sind;
			double salario_liquido=0;
			salario_liquido=salario_bruto -(desconto+sind);
			double total_desconto= ir+desconto+sind;
			
			System.out.println("Sal�rio Bruto: ("+salario+" * "+horas+") : R$ "+salario_bruto+"\r\n" + 
 		            " (-) IR ("+des+") : R$ "+desconto+"\r\n" +
 		            " (-) Sindicato ("+sind+"): R$"+sind+"\r\n"+
 		            " (-) INSS ( 10%) : R$ 110,00\r\n" + 
 		            " FGTS (11%) : R$ "+ir+",00\r\n" + 
 		            " Total de descontos : R$ "+total_desconto+",00\r\n "+ 
 		            " Sal�rio Liquido : R$ "+salario_liquido+",00");
			
		}else if (salario_bruto<=2500) {
			// desconto
			double desconto = 0;
			int des=10;
			desconto = (salario_bruto*10)/100;
			//sindicato
			double sind = 0;
			sind = (salario_bruto*3)/100;
			//FGTS
			double ir=0;
			ir=(salario_bruto*11)/100;
			//salario liquido
			double desconto_total=desconto+sind;
			double salario_liquido=0;
			salario_liquido=salario_bruto -desconto_total;
			 
			System.out.println("Sal�rio Bruto: ("+salario+" * "+horas+") : R$ "+salario_bruto+"\r\n" + 
			 		            " (-) IR ("+des+") : R$ "+desconto+"\r\n" +
			 		           "  (-) Sindicato ("+sind+"): R$"+sind+"\r\n"+
			 		            " (-) INSS ( 10%) : R$ 110,00\r\n" + 
			 		            " FGTS (11%) : R$ "+ir+",00\r\n" + 
			 		            " Total de descontos : R$ "+desconto_total+",00\r\n "+ 
			 		            " Sal�rio Liquido : R$ "+salario_liquido+",00");
			
			
		}else {
			// desconto
			double desconto = 0;
			int des=20;
			desconto = (salario_bruto*20)/100;
			//sindicato
			double sind = 0;
			sind = (salario_bruto*3)/100;
			//FGTS
			double ir=0;
			ir=(salario_bruto*11)/100;
			//salario liquido
			double salario_liquido=0;
			double desconto_total=desconto+sind;
			double total_desconto= ir+desconto+sind;
			
			
			System.out.println("Sal�rio Bruto: ("+salario+" * "+horas+") : R$ "+salario_bruto+"\r\n" + 
 		            " (-) IR ("+des+") : R$ "+desconto+"\r\n" +
 		            " (-) Sindicato ("+sind+"): R$"+sind+"\r\n"+
 		            " (-) INSS ( 10%) : R$ 110,00\r\n" + 
 		            " FGTS (11%) : R$ "+ir+",00\r\n" + 
 		            " Total de descontos : R$ "+desconto_total+",00\r\n "+ 
 		            " Sal�rio Liquido : R$ "+salario_liquido+",00");
		}
			

	}

}
