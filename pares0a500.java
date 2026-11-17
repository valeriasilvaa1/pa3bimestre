package listaDoWhile;

public class pares0a500 {

	public static void main(String[] args) {
			int i=1;
			
			do {
				if(i%10==0) {
					System.out.println(i+" Divisível por 10");
				}else {
					System.out.println(i);
				}
				i=i+1;
				
			}while(i<501);

		}

	}

