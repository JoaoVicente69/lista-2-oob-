import java.util.Scanner;

public class ex31 {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	int tipo_carne, cartao=0;
	double preco,quantidade =0;
	double valor=0;
	double valor_des=0;
	
	
	System.out.println("que carne você deseja?");
	System.out.println("1 para File Duplo R$ 4,90 por Kg R$ 5,80 por Kg\r\n" + 
			"2 para Alcatra R$ 5,90 por Kg R$ 6,80 por Kg\r\n" + 
			"3 para Picanha R$ 6,90 por Kg R$ 7,80 por Kg");
	tipo_carne=entrada.nextInt();
	 System.out.println("em qual a quantidade?");
	 quantidade=entrada.nextDouble();
	
	switch(tipo_carne) {
	case 1:
		if(quantidade<=5){
			preco= 4.90;
			valor=preco*quantidade;
		}else {
			preco= 5.80;
			valor=preco*quantidade;
			}
		break;
	case 2:
		if(quantidade<=5){
			preco= 5.90;
			valor=preco*quantidade;
		}else {
			preco= 6.80;
			valor=preco*quantidade;
		}
		break;
	case 3:
		if(quantidade<=5){
			preco= 6.90;
			valor=preco*quantidade;
		}else {
			preco= 7.80;
			valor=preco*quantidade;
		}
	break;	
	}
	System.out.println("voce possui o cartao da loja 1 para SIM 2 para NÃO");
		cartao=entrada.nextInt();
	switch (cartao) {
	case 1:
		valor_des=valor-(valor*0.10);
	System.out.println("sua compra ira custar "+valor_des);
		break;

	case 2:
		System.out.println("sua compra ira custar "+valor);
		break;
	}
	}

}
