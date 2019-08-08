import java.util.Scanner;
public class ex23 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
	int idade1,idade2,idade3=0;
		System.out.println("escreva 3 idades");
	idade1=entrada.nextInt();
	idade2=entrada.nextInt();
	idade3=entrada.nextInt();
	
	float media_idade=0;
	media_idade=(idade1+idade2+idade3)/3;
	
	if(media_idade<25) {
		System.out.println("Turma Jovem");
	}else if((media_idade>=25)&(media_idade<40)) {
		System.out.println("Turma Adulta");
	}else {
		System.out.println("Turma Idosa");
	}

	}

}
