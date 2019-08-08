import java.util.Scanner;
public class ex29 {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	char combustivel=' ';
	double valor,pagar, desconto =0;
	
	
	System.out.println("voce quer G -gasolina A-alcool?");
	combustivel= entrada.nextLine().charAt(0);	
	System.out.println("quantidade");
	
	valor=entrada.nextFloat();
	if(combustivel=='g') {
		if (valor<20) {
		desconto=0.03;
		pagar=valor-(0.03*valor);
		pagar=pagar*2.50;
		System.out.println("valor a pagar "+pagar);
		}else {
			desconto=0.03;
			pagar=valor-(0.05*valor);
			pagar=pagar*2.50;
			System.out.println("valor a pagar "+pagar);
		}
		
	}else {
		if (valor<20) {

		desconto=0.03;
		pagar=valor-(0.04*valor);
		pagar=pagar*1.90;
		System.out.println("valor a pagar "+pagar);
		}else {
			desconto=0.03;
			pagar=valor-(0.06*valor);
			pagar=pagar*1.90;
			System.out.println("valor a pagar "+pagar);
	
		}	
	
	}
	
	}
}
