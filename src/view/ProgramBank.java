package view;
import java.util.ArrayList;
import java.util.Scanner;
import model.Conta;


public class ProgramBank {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Conta> list = new ArrayList<>();
	
		System.out.println("Quantidade de contas: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Account: " + i + " ");
			System.out.println("Account number: ");
			int numero = sc.nextInt();
			System.out.println("Name: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("Balance Available: ");
			double saldo = sc.nextDouble();
			
			list.add(new Conta(numero, nome, saldo));
		}
	
	
	System.out.println("------------------------------");
	System.out.println("Bank Account List");
	for (Conta conta : list) {
		System.out.println(conta);
	
	
	}
	
	
	
	
	}

}
