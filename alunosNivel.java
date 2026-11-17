package switchCase;

import java.util.Scanner;

public class alunosNivel {
	public static void main(String[] args) {

	int idade;

	Scanner leia = new Scanner(System.in);


	System.out.println("Digite a idade: ");

	idade=leia.nextInt();
	
	switch (idade) {

		case 6:
			System.out.println("Dente de leite");
			break;

		case 7:
			System.out.println("Junior");
			break;

		case 8:
			System.out.println("Junior Max");
			break;

		case 9:
			System.out.println("Junior Master");
			break;

		case 10:
			System.out.println("Master");
			break;

		default:
			System.out.println("Idade inválida");

		}


		leia.close();

		}
}




	
	