package LacoDecisao;

import java.util.Scanner;

public class LacoDecisao_AprovadoOuNao_Aula {

	public static void main(String[] args) {
		
		float n1, n2, n3, media;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite a primeira nota: ");
		n1 = leia.nextInt();
		System.out.println("Digite a segunda nota: ");
		n2 = leia.nextInt();
		System.out.println("Digite a terceira nota: ");
		n3 = leia.nextInt();
		
		media = (n1 + n2 + n3)/3;
		
		if (media >= 7 && media <10) {
			System.out.println("Aprovado " +media);
		} else if (media >= 5 && media <7 ) {
			System.out.println("Exame " +media);
		} else {
			System.out.println("Reprovado " +media);
		} 
		
		
	
		

	}

}
