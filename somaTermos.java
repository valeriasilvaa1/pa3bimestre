package lacoFor;

import java.util.Scanner;

public class somaTermos {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int soma=0, n, i;
		
		System.out.println("Digite a quantidade de termos: ");
		n=leia.nextInt();
		
		for(i=1;i<=n;i++) {
			soma=soma+i;
		}
		
		System.out.println("A soma desses termos é: "+soma);
		
		leia.close();
	}
}
