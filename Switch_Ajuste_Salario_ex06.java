package LacoDecisao;

import java.util.Scanner;

public class Switch_Ajuste_Salario_ex06 {

	public static void main(String[] args) {
		
		String colaborador;
		int cargo;
		float salario, novoSalario, reajuste;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Qual o seu nome? ");
		colaborador = leia.nextLine();
		
		System.out.println(" 1 - Gerente");
		System.out.println(" 2 - Vendedor");
		System.out.println(" 3 - Supervisor");
		System.out.println(" 4 - Motorista");
		System.out.println(" 5 - Estoquista");
		System.out.println(" 6 - Técnico de TI");
		System.out.println("Cargo: ");
		cargo = leia.nextInt();
		
		System.out.println("Qual o seu Salário?");
		salario = leia.nextFloat();
		
		switch(cargo) {
		case 1: 
			reajuste = 1.10F;
			novoSalario = (salario * reajuste);
			System.out.println("Nome do Colaborador: " +colaborador);
			System.out.println("Cargo: Gerente");
			System.out.println("Salário: R$" +novoSalario);
			break;
		case 2: 
			reajuste = 1.07F;
			novoSalario = (salario * reajuste);
			System.out.println("Nome do Colaborador: " +colaborador);
			System.out.println("Cargo: Vendedor");
			System.out.println("Salário: R$" +novoSalario);
			break;
		case 3: 
			reajuste = 1.09F;
			novoSalario = (salario * reajuste);
			System.out.println("Nome do Colaborador: " +colaborador);
			System.out.println("Cargo: Supervisor");
			System.out.println("Salário: R$" +novoSalario);
			break;
		case 4: 
			reajuste = 1.06F;
			novoSalario = (salario * reajuste);
			System.out.println("Nome do Colaborador: " +colaborador);
			System.out.println("Cargo: Motorista");
			System.out.println("Salário: R$" +novoSalario);
			break;
		case 5: 
			reajuste = 1.05F;
			novoSalario = (salario * reajuste);
			System.out.println("Nome do Colaborador: " +colaborador);
			System.out.println("Cargo: Estoquista");
			System.out.println("Salário: R$" +novoSalario);
			break;
		case 6: 
			reajuste = 1.08F;
			novoSalario = (salario * reajuste);
			System.out.println("Nome do Colaborador: " +colaborador);
			System.out.println("Cargo: Técnico de TI");
			System.out.println("Salário: R$" +novoSalario);
			break;
		}
		
		
	}

}
