import java.util.Scanner;

public class maiorMenor {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int anoA, anoN, idade, i=1;
		
		while(i<=6) {
			
			System.out.println("Digite o ano atual: ");
			anoA=leia.nextInt();
			
			System.out.println("Digite o ano de nascimento: ");
			anoN=leia.nextInt();
			
			idade=anoA-anoN;
			
			System.out.println("Sua idade é de : "+idade+" anos");
			
			if(idade>=18) {
				System.out.println("e você é maior de idade ");
			}else {
				System.out.println("e você é menor de idade ");
			}
			
			i++;
		}
		
		

	}

}
