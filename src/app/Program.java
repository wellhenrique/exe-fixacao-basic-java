package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    Account account;

    System.out.print("Enter account number: ");
    int accountNumber = sc.nextInt();

    System.out.print("Enter account holder: ");
    sc.nextLine();
    String accountName = sc.nextLine();

    System.out.print("Is there an initial deposit (y/n)? ");
    char initialDeposit = sc.next().charAt(0);

    if (initialDeposit == 'y') {
      System.out.print("Enter initial deposit value: ");
      double depositValue = sc.nextDouble();
      account = new Account(accountNumber, accountName, depositValue);
    } else {
      account = new Account(accountNumber, accountName);
    }

    System.out.println();
    System.out.println("Account data:");
    System.out.println(account);

    sc.close();
  }
}