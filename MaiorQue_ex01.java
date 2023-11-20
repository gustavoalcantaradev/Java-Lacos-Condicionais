package LacoDecisao;

import java.util.Scanner;

public class MaiorQue_ex01 {

	public static void main(String[] args) {
		
		float n1, n2, n3, resultado;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o Primeiro número: ");
		n1 = leia.nextFloat();
		System.out.println("Digite o Segundo número: ");
		n2 = leia.nextFloat();
		System.out.println("Digite o Terceiro número: ");
		n3 = leia.nextFloat();
		
		if (n1 + n2 == n3) {
			System.out.println("A soma do primeiro e segundo número é igual que o terceiro");
		} else if (n1 + n2 >= n3) {
			System.out.println("A soma do primeiro e segundo número é mair que o terceiro");
		} else {
			System.out.println("A soma do primeiro e segundo número é menor que o terceiro");
		}
	}

}
