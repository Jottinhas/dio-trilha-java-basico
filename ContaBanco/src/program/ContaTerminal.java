package program;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
        System.out.print("Digite o seu nome: ");
        String nomeCliente = sc.nextLine();
        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = sc.next();
        System.out.print("Usuário: ");
        int numero = sc.nextInt();
        System.out.print("Saldo atual: ");
        double saldo = sc.nextDouble();
        
        
        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco,"
        + " sua agência é "+agencia+", conta "+numero
        + " e seu saldo "+saldo+" já está disponível para saque.");
        
		sc.close();
	}

}
