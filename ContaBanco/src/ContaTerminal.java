import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar e receber o número da conta
        System.out.println("Por favor, digite o número da Conta:");
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        // Solicitar e receber o número da agência
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        // Solicitar e receber o nome do cliente
        System.out.println("Por favor, digite o seu Nome:");
        String nomeCliente = scanner.nextLine();

        // Solicitar e receber o saldo da conta
        System.out.println("Por favor, digite o Saldo da Conta:");
        double saldo = scanner.nextDouble();

        // Exibir a mensagem de confirmação
        String mensagem = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", 
                                         nomeCliente, agencia, numeroConta, saldo);
        System.out.println(mensagem);

        scanner.close();
    }
}
