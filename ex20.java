import java.util.Scanner;

public class ex20 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int ano,mes,dia =0;
		
		System.out.println("Escreva o dia:");
		dia=entrada.nextInt();
		System.out.println("Escreva o mês:");
		mes=entrada.nextInt();
		System.out.println("Escreva ano:");
		ano=entrada.nextInt();
	if (((dia<1)&(dia>31))&(mes<1)&(mes>12)) {
		System.out.println("dados errados");
	}else if ((mes == 2)&(dia>28)&(dia<=0)){
		System.out.println("0"+dia+"/0"+mes+"/"+ano+" ano bissesto");
		
	}else if  (((dia>=1)&(dia<=31))&(mes>=1)&(mes<=12)){
		System.out.println("0"+dia+"/0"+mes+"/"+ano);
	}else {
		System.out.println("dados errados");
	}
	}
}
