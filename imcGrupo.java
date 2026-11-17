package lacoFor;

import java.util.Scanner;

public class imcGrupo {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double peso, altura, imc, i;
		int  bp=0, n=0 ,sb=0, obe=0;
		
		
		for(i=1; i<16; i++) {
			System.out.println(" ");
			System.out.println("Digite o peso: ");
			peso=leia.nextDouble();
			
			System.out.println("Digite a altura: ");
			altura=leia.nextDouble();
			
			imc=peso/(altura*altura);
			
			if(imc<22) {
				System.out.println("baixo peso ");
				bp++;
			}else if(imc<27){
				System.out.println("Peso normal");
				n++;
			}else if(imc<30){
				System.out.println("Sobrepeso");
				sb++;
			}else {
				System.out.println("Obesidade");
				obe++;
			}
			System.out.println(" ");
			System.out.println("Baixo peso: "+bp);
			System.out.println("Peso normal: "+n);
			System.out.println("Sobrepeso: "+sb);
			System.out.println("Obesidade: "+obe);
			
		}
		
		leia.close();
	}

}
