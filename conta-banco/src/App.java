import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua conta");
        double conta = scanner.nextInt();

        System.out.println("Digite sua Agencia");
        String agencia = scanner.next();

        System.out.println("Digite seu nome");
        String nomeCliente = scanner.next();

        System.out.println("Digite seu saldo");
        double saldo = scanner.nextDouble();

        System.out.println("Ola " + nomeCliente + " Obrigado por criar sua conta em nosso banco, sua agencia é "
                + agencia + " conta " + conta + " e seu saldo " + saldo + " ja esta disponivel para saque");
    }
}