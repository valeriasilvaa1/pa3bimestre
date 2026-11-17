package exerciciosLaco;

import java.util.Scanner;

public class notaAlunoDoWhile {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double n1,n2,nf;
		String resposta1;
		
		do{
			System.out.println("Digite a primeira nota");
			n1 = leia.nextDouble();
			
			System.out.println("Digite a segunda nota");
			n2 = leia.nextDouble();
			
			nf = (n1 + n2)/2;
			if (nf >= 7)
				System.out.println("Você foi aprovado" + nf);
				else
					System.out.println("Você foi reprovado" + nf);
			   System.out.println("Deseja continuar? Sim ou não?");
			    resposta1 = leia.next();
			    
		} while (resposta1.equalsIgnoreCase("Sim"));
				
		leia.close();
	}
}
