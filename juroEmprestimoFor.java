package exerciciosLaco;

import java.util.Scanner;

public class juroEmprestimoFor {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double juros, mensal, total, empres;
		int i, mesPaga;
		
		System.out.println("Digite o valor do empréstimo: ");
		empres=leia.nextDouble();
		
		System.out.println("Digite o número de meses para o pagamento: ");
		mesPaga=leia.nextInt();
		
		total=empres;
		
		for(i=1; i<=mesPaga; i++) {
			juros=total*2.5/100;
			total=total + juros;
		}
		
		juros=total-empres;
		mensal=total/mesPaga;
		
		System.out.println("O valor pago foi "+total);
		System.out.println("O valor dos juros foi "+juros);
		System.out.println("O valor das prestações mensais foram de "+mensal);
		
		
		leia.close();

	}
}
