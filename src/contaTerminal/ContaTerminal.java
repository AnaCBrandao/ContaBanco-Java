package contaTerminal;
import java.util.Scanner;

public class ContaTerminal {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Por favor, digite o número da Agencia: ");
        String agencia = scanner.nextLine();
        
        System.out.print("Por favor, digite o número da Conta: ");
        String numero = scanner.nextLine();
        
        System.out.print("Por favor, digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();
        
        System.out.print("Por favor, digite o saldo da conta: ");
        String saldo = scanner.nextLine();
	
        System.out.print("Olá " +nomeCliente+ ", obrigado por criar uma conta em nosso banco, sua agência é " +agencia+ ", conta" +numero+ " e seu saldo " +saldo+ " já está disponivel para saque.");
	}
}
