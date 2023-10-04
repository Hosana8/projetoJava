
import java.util.Scanner;

public class ContaTerminal {
  public static void main(String[] args) throws Exception {

    Scanner scanner = new Scanner(System.in);

    System.out.println(" Conta bancáncaria ");

    System.out.println(" Por favor, insira o número da  sua conta bancária ");
    int número = scanner.nextInt();

    System.out.println(" Forneça o número da  sua agência ");
    String agência = scanner.next();

    System.out.println("Por favor, informe seu nome ");
    String nomeCliente = scanner.next();

    System.out.println("Informe o valor do seu saldo atual ");
    double saldo = scanner.nextDouble();

    System.out.println("Olá, " + nomeCliente + " obrigado por criar uma conta em nosso banco,");
    System.out.println("sua agência é " + agência + " , conta " + número);
    System.out.println("e seu saldo " + saldo + " já está disponível  para saque .");

  }

}
