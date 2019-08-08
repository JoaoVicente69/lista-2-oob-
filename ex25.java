import java.util.Scanner;
public class ex25 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num0=0;
		float div_num=0;
		System.out.println("escreva um numero ");
		num0=entrada.nextInt();
	div_num= num0%2;
	
	if (div_num==0) {
		System.out.println("par");
		
	}else {
		System.out.println("impar");
	}
		
	}

}
