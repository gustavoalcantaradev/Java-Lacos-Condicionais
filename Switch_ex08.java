package LacoDecisao;

import java.util.Scanner;

public class Switch_ex08 {

	public static void main(String[] args) {
		
	Scanner leia = new Scanner (System.in);
	
	int op;
	float saldo = 1000, saque, deposito;
	System.out.println("******* Menu *******");
	System.out.println("\n1 - Saldo");
	System.out.println("2 - Saque");
	System.out.println("3 - Depósito");
	System.out.println("\nEscolha uma opção: ");
	op = leia.nextInt();
	
	switch (op){
	
	case 1:
		System.out.println("Saldo: R$ " +saldo);
		break;
		
	case 2:
		System.out.println("Digite o valor que deseja sacar: R$ ");
		saque = leia.nextFloat();
		
		saldo = saldo - saque;
		
		if (saldo <= 0) {
			System.out.println("Saldo insuficiente!");
		} else {
			System.out.println("Novo saldo: R$ "+saldo);
		}
		break;
		
	case 3:
		System.out.println("Digite o valor para depositar: R$ ");
		deposito = leia.nextFloat();
		saldo = saldo + deposito;
		System.out.println("Novo saldo: R$ "+saldo);
		break;
	}

	}

}
