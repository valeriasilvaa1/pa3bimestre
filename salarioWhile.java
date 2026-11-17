package exerciciosLaco;

import java.util.Scanner;

public class salarioWhile {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int i=1, maiorMes=1, menorMes=1,mm=11;
		double soma=0, maior=0,menor=0, media, salario,salIni;
		
		while(i <= 12){
			
			System.out.println("Digite o salário do mês "+i+":");
			salario=leia.nextDouble();
			
			soma=soma+salario;
			
			if(salario > maior) {
				maior=salario;
				maiorMes=i;
			}else if(salario < menor) {
				menor=salario;
				menorMes=i;
			}
			i++;
			
		}
		
		media=soma/12;
		System.out.println(soma);
		System.out.println(media);
		System.out.println(maiorMes);
		System.out.println(maior);
		System.out.println(menorMes);
		System.out.println(menor);
		
		leia.close();
	}

}
