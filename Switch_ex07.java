package LacoDecisao;

import java.util.Scanner;

public class Switch_ex07 {

	public static void main(String[] args) {
		
	Scanner leia = new Scanner(System.in);
	
	int op;
	float num1, num2, resultado;
	
	System.out.println("1 - Soma");
	System.out.println("2 - Subtração");
	System.out.println("3 - Multiplicação");
	System.out.println("4 - Divisão");
	System.out.println("Escolha uma opção: ");
	op = leia.nextInt();
	
	System.out.println("Digite o Primeiro número: ");
	num1 = leia.nextFloat();
	System.out.println("Digite o Segundo número: ");
	num2 = leia.nextFloat();
	
	switch (op) {
	
	case 1:
		resultado = num1 + num2;
		System.out.println("\nResultado: "+num1+ " + " +num2+ " = " +resultado);
		break;
		
	case 2:
		resultado = num1 - num2;
		System.out.println("\nResultado: "+num1+ " - " +num2+ " = " +resultado);
		break;
		
	case 3:
		resultado = num1 * num2;
		System.out.println("\nResultado: "+num1+ " X " +num2+ " = " +resultado);
		break;
		
	case 4:
		resultado = num1 / num2;
		System.out.println("\nResultado: "+num1+ " / " +num2+ " = " +resultado);
		break;
		default:
			System.out.println("Opção invalida! ");
	}
	
	
	
	}

}
