package aplication;

import entities.Conta;
import entities.ContaPoupanca;
import entities.ContaPrime;

public class Program {

	public static void main(String[] args) {
		
		Conta acc = new Conta(1001, "Bruno", 0.0);
		ContaPrime cp = new ContaPrime(1002, "Maria", 0.0, 500.0);
		
		//UPCASTING
		// Variavel Conta 'class conta' | acc1 'Variavel Criada para instanciar as 2 contas Conta normal e Prime  ' | cp 'Variavel Conta Prime'
		
		Conta acc1 = cp;
		Conta acc2 = new ContaPrime(1003,"Bob", 0.0, 200.0);
		Conta acc3 = new ContaPoupanca(1004, "Ana", 0.0, 0.01);
		
		// DOWNCASTING
		
		ContaPrime acc4 = (ContaPrime)acc2;
		acc4.emprestimo(100.0);
		
		//ContaPrime acc5 = (ContaPrime)acc3;
		if (acc3 instanceof ContaPrime) {
			ContaPrime acc5 = (ContaPrime)acc3;
			acc5.emprestimo(200.0);
			System.out.println("Emprestimo !");
		}
		
		if (acc3 instanceof ContaPoupanca) {
			ContaPoupanca acc5 = (ContaPoupanca)acc3;
			acc5.saldoAtualizado(); 
			System.out.println("Atualizado !");
		}
		
	}

}
