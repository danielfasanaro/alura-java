import java.util.Scanner;

public class BankAccount {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Account newAccount = new Account("Daniel Fasanaro", "Corrente", 1500.00);
    System.out.printf("""
        ******************************
        Dados iniciais do cliente:
        
        Nome:             %s
        Tipo da conta:    %s
        Saldo inicial:    %.2f
        ******************************
        """, newAccount.getAccountHolder(), newAccount.getAccountType(), newAccount.getAccountBalance());

    int option;
    do {
      System.out.printf("""
          
          Operações:
          
          1- Consultar Saldo
          2- Realizar Depósito
          3- Realizar Saque
          4- Sair
          
          Digite a opção desejada:
          """);
      option = scanner.nextInt();
      switch (option) {
        case 1:
          System.out.printf("O saldo atual é: %.2f%n", newAccount.getAccountBalance());
          break;
        case 2:
          System.out.println("Insira o valor do depósito:");
          newAccount.cashIn(scanner.nextDouble());
          System.out.printf("Novo saldo: %.2f%n", newAccount.getAccountBalance());
          break;
        case 3:
          System.out.println("Insira o valor do saque:");
          double value = scanner.nextDouble();
          if (value <= newAccount.getAccountBalance()) {
            newAccount.cashOut(value);
            System.out.printf("Novo saldo: %.2f%n", newAccount.getAccountBalance());
          } else {
            System.out.println("Saldo insuficiente!");
          }
          break;
        case 4:
          break;
        default:
          System.out.println("Insira uma opção válida!");
      }
    } while (option != 4);
  }
}