package LacoDecisao;

import java.util.Scanner;

public class Switch_Lanchonete_ex05 {

	public static void main(String[] args) {
		
		int op, quantidade, preco;
		
		Scanner leia = new Scanner (System.in);
		
		
		System.out.println("Menu: ");
		System.out.println("\n 1 - Cachorro quente");
		System.out.println(" 2 - X-Salada");
		System.out.println(" 3 - X-Bacon");
		System.out.println(" 4 - Bauru");
		System.out.println(" 5 - Refrigerante");
		System.out.println(" 6 - Suco de laranja");
		System.out.println("\n Escolha Sua opção: ");
		op = leia.nextInt();
		System.out.println("Quantidade:");
		quantidade = leia.nextInt();
		
		
		switch(op) {
		case 1: 
			preco = (quantidade * 10);
			System.out.println("\n Produto: Cachorro quente");
			System.out.println("Valor total: R$" +preco);
			break;
		case 2: 
			preco = (quantidade * 15);
			System.out.println("\n Produto: X-Salada");
			System.out.println("Valor total: R$" +preco);
			break;
		case 3: 
			preco = (quantidade * 18);
			System.out.println("\n Produto: X-Bacon");
			System.out.println("Valor total: R$" +preco);
			break;
		case 4: 
			preco = (quantidade * 12);
			System.out.println("\n Produto: Bauru");
			System.out.println("Valor total: R$" +preco);
			break;
		case 5: 
			preco = (quantidade * 8);
			System.out.println("\n Produto: Refrigerante");
			System.out.println("Valor total: R$" +preco);
			break;
		case 6: 
			preco = (quantidade * 13);
			System.out.println("\\n Produto: Suvo de laranja");
			System.out.println("Valor total: R$" +preco);
			break;
			default:
				System.out.println("Opção invalida");
		}

	}

}
