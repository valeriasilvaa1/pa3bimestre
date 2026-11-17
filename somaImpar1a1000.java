package listaDoWhile;

public class somaImpar1a1000 {
	public static void main(String[] args) {
		int i=1, soma=0;
		
		do {
			soma = soma+i;
			i=i+2;
		}while(i<1001);
		
		System.out.println("a soma dos números impares de 1 a 1000 é: "+soma);

	}

}

