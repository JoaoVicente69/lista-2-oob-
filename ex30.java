/*Até 5 Kg Acima de 5 Kg
Morango R$ 2,50 por Kg R$ 2,20 por Kg
Maçã R$ 1,80 por Kg R$ 1,50 por Kg*/
import java.util.Scanner;

public class ex30 {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	 double fruta,quantidade,pagar,preco=0;
	
	
	System.out.println("que frustas você que 1 para morango ou 2 para maçã?");
	fruta=entrada.nextDouble();
	System.out.println("qual quantidade (Kg)?");
	quantidade=entrada.nextDouble();

	if(fruta==1) {
		
		if(quantidade<=5){
			preco= 2.50;
			pagar=preco*quantidade;
		}else {
			preco= 2.20;
			pagar=preco*quantidade;
		}
		if ((quantidade>8)&(pagar>25)) {
			pagar=pagar-(pagar*0.10);
			System.out.println("valor a pagar com desconto "+ pagar);
		}
	}else
		if(quantidade<=5){
			preco= 1.80;
			pagar=preco*quantidade;
		}else {
			preco= 1.50;
			pagar=preco*quantidade;
			
		}
		
		if ((quantidade>8)&(pagar>25)) {
			pagar=pagar-(pagar*0.10);
			System.out.println("valor a pagar com desconto "+ pagar);
		}
		System.out.println("valor a pagar"+ pagar);	
		}
	}
	


