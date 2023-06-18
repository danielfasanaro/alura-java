public class Account {
  private String accountHolder;
  private String accountType;
  private double accountBalance;

  Account(String accountHolder, String accountType, double accountBalance) {
    this.accountHolder = accountHolder;
    this.accountType = accountType;
    this.accountBalance = accountBalance;
  }

  public String getAccountHolder() {
    return accountHolder;
  }

  public String getAccountType() {
    return accountType;
  }

  public double getAccountBalance() {
    return accountBalance;
  }

  public void cashIn(double value) {
    this.accountBalance += value;
  }

  public void cashOut(double value) {
    if (this.accountBalance >= value) {
      this.accountBalance -= value;
    } else {
      System.out.println("Não há saldo suficiente!");
    }
  }
}
