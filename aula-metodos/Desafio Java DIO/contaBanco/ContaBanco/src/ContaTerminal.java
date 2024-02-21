import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Bem vindo ao Banco X");

        System.out.println("Para criar sua conta siga as instruções a seguir.");

        System.out.println("Digite seu nome:");
        String nome = scanner.next();

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número da sua Conta:");
        int conta = scanner.nextInt();

        System.out.println("Qual valor deseja sacar?");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                + ", conta " + conta + " e seu saldo de R$ " + saldo + " já está disponível para saque!");
    }
}
