package LacoDecisao;

import java.util.Scanner;

public class if_ex04 {

	public static void main(String[] args) {
		
	Scanner leia = new Scanner (System.in);
	
	System.out.println("Vertebrado ou Invertebrado? ");
	String coluna = leia.nextLine();
	
	
	//se for vertebrado
	if (coluna.equalsIgnoreCase("vertebrado")) {
		System.out.println("Ave ou Mamífero? ");
		String opcao = leia.nextLine();
	
	if (opcao.equalsIgnoreCase("ave")) {
		System.out.println("Carnívoro ou Onívoro?");
		String comida = leia.nextLine();
		
		if (comida.equalsIgnoreCase("carnívoro")) {
			System.out.println("O Animal é uma Águia");
		}else {
			System.out.println("O animal é uma Pomba");
		}
		
	//se for mamifero
			} else {
				System.out.println("Onívoro ou Herbívoro?");
				String comida = leia.nextLine();
				
				if (comida.equalsIgnoreCase("onivoro")) {
					System.out.println("Homem");
				} else {
					System.out.println("Vaca");
				}
			}
		//se for invetebrado
		} else {
			System.out.println("Inseto ou Anelídeo?");
			String opcao = leia.nextLine();
			
			//se for inseto
			if (opcao.equalsIgnoreCase("inseto")) {
				System.out.println("Hematófago ou Herbívoro?");
				String comida = leia.nextLine();
				
				if (comida.equalsIgnoreCase("hematofago")) {
					System.out.println("É uma pulga");
				} else {
					System.out.println("É uma lagarta");
				}
				
			//se for anelideo
			} else {
				System.out.println("Hematófago ou Onívoro?");
				String comida = leia.nextLine();
				
				if (comida.equalsIgnoreCase("hematofago")) {
					System.out.println("É uma Sanguessuga");
				} else {
					System.out.println("É uma Minhoca");
				}
			}
			
		}
	
	}

}
