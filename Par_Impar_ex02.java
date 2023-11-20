package LacoDecisao;

import java.util.Scanner;

public class Par_Impar_ex02 {

	public static void main(String[] args) {
		
		int n1;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite um número:");
		n1 = leia.nextInt();
		
		if(n1 % 2 == 0 && n1 >= 2) {
            System.out.println("\nO numero " + n1 + " e par e positivo!");
        }else if(n1 % 2 == 0 && n1 < 0) {
            System.out.println("\nO numero " + n1 + " e par e negativo!");
        }else if(n1 % 2 == 1 && n1 >= 1) {
            System.out.println("\nO numero " + n1 + " e impar e positivo!");
        }else{
            System.out.println("\nO numero " + n1 + " e impar e negativo!");
        }
		

	}

}


