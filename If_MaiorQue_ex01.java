package LacoDecisao;

import java.util.Scanner;

public class CondicionalIf_MaiorQue_ex01 {

	public static void main(String[] args) {
		
		float n1, n2, n3, resultado;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o Primeiro número: ");
		n1 = leia.nextFloat();
		System.out.println("Digite o Segundo número: ");
		n2 = leia.nextFloat();
		System.out.println("Digite o Terceiro número: ");
		n3 = leia.nextFloat();
		
		if (n1 + n2 == n3){
			System.out.println("A somo do primeiro número com o segundo é igual ao terceiro");
		}else if (n1 + n2 >= n3) {
			System.out.println("A soma do primeiro número com o segundo é Maior que o terceito");
		} else {
			System.out.println("A soma do primeiro número com o segundo é Menor que o terceiro");
		} 
	}

}
