import java.util.Scanner;

public class ex17 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
	    int q,w,r,t = 0;
	    System.out.println("Escreva  as 2 notas do Bimestre"); 
					 	q = entrada.nextInt();
					 	w = entrada.nextInt();
					 	float p=(q+w)/2;
		if (p<=4) {
			System.out.println("sua notas foram"+q+","+w+"\n sua media ficou"+p+"\n conceito E\nreprovado");
		}else if ((p>9)&(p<=10)) {
			System.out.println("sua notas foram"+q+","+w+"\n sua media ficou"+p+"\n conceito A\naprovado");
		}else if ((p>7.5)&(p<=9)){
			System.out.println("sua notas foram"+q+","+w+"\n sua media ficou"+p+"\n conceito B\naprovado");
		}else if ((p>6)&(p<=7.5)){
			System.out.println("sua notas foram"+q+","+w+"\n sua media ficou"+p+"\n conceito C\nexame");
		}else if ((p>4)&(p<=6)){
			System.out.println("sua notas foram"+q+","+w+"\n sua media ficou"+p+"\n conceito C\nexame");
		}
	}
}
