package LacoDecisao;

import java.util.Scanner;

public class Switch_OpcoesSelect_Aula {

	public static void main(String[] args) {
		
		int op;
		
		Scanner leia = new Scanner (System.in);
		
		
		System.out.println("\n Selecione a sua opção: ");
		System.out.println("1 - Carro");
		System.out.println("2 - Moto");
		System.out.println("3 - Onibus");
		System.out.println("4 - Caminhão");
		System.out.println("Escolha sua opção: ");
		op = leia.nextInt();	
		
		switch(op) {
		case 1:
			System.out.println("Carro");
			break;
		case 2:
			System.out.println("Moto");
			break;
		case 3:
			System.out.println("Onibus");
			break;
		case 4:
			System.out.println("Caminhão");
			break;
			default:
				System.out.println("Opção invalida");
		}
		
		
		

	}

}
