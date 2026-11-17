package lacoFor;

import java.util.Scanner;

public class anoSoma {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int anoI, anoF, ano, quan=0;
		
		System.out.println("Digite o ano inicial: ");
		anoI=leia.nextInt();
		
		System.out.println("Digite o ano final: ");
		anoF=leia.nextInt();
		
		for(ano=anoI;ano<=anoF;ano++) {
			if((ano%4==0  && ano % 100 != 0) || (ano%400==0)) {
				System.out.println(ano);
				quan++;
			}
		}
		System.out.println("O número de anos é: "+quan);
		
		leia.close();
	}	
     
}    