
import java.util.Scanner;

public class SimulacaoBancaria {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double saldo = 0;
    double saldoDepositado;
    double saldoSacado;
   
    while (true) {

      System.out.println("");
      System.out.println("Digite 1 para realizar depósitos");
      System.out.println("Digite 2 pra realizar saques");
      System.out.println("Digite 3 para ver saldo em conta");
      System.out.println("Ou Digite 0 para encerrar o programa");

      int opcao = scanner.nextInt();
     
      switch (opcao) {
        case 1:
          System.out.print("Informe o valor a ser depositado: ");
          saldoDepositado = scanner.nextDouble();
          saldo += saldoDepositado;
          break;

        case 2:
          System.out.print("Informe o valor a ser sacado: ");
          saldoSacado = scanner.nextDouble();

          if (saldo > saldoSacado) {
            saldo -= saldoSacado;
          }

          if (saldo < saldoSacado) {
            System.out.println("Saldo insuficiente");
          }

          break;

        case 3:
          System.out.println("O seu saldo em conta é de: R$" + saldo);
          break;

        case 0:
          System.out.println("Programa encerrado");
          break;

        // Exibe mensagem de opção inválida se o usuário escolher uma opção inválida:
        default:
          System.out.println("Opção inválida. Tente novamente.");
      }

      if (opcao == 0) {
        break;
      }
    }
    scanner.close();
  }
}

