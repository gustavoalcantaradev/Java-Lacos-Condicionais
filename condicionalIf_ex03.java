package LacoDecisao;

import java.util.Scanner;

public class condicionalIf_ex03 {

	public static void main(String[] args) {


		String nome;
		int idade, prim;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite o seu nome: ");
		nome = leia.next();
		System.out.println("Digite a sua idade: ");
		idade = leia.nextInt();
		
		if (idade >= 18 && idade <= 59) {
			System.out.println("\n"+nome + " está apto para doar sangue!");
		} else if (idade >= 60 && idade <= 69) { 
			
			System.out.println("Escolha uma opção: ");
			System.out.println("\n 1 - sim");
			System.out.println(" 2 - não");
			System.out.println("\n Já doou sangue? ");
			prim = leia.nextInt();
			
			switch (prim) {
			case 1:
				System.out.println("\n"+nome+ " Você não está apto para doar sangue!");
				break;
			case 2:
				System.out.println("\n"+nome+ " Vecê esta apto para doar sangue!");
				break;
			}
			
		} else {
			System.out.println("\n"+nome+ " Você não está apto");
		}
		
		
		
			
		}
		 

	}
