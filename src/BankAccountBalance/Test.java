package BankAccountBalance;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Bank Account Menu: ");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Deposit amount: ");
                    account.deposit(input.nextInt());
                    break;
                case 2:
                    System.out.println("Withdraw amount: ");
                    try {
                        account.withdraw(input.nextInt());
                    } catch (InsufficientFundException e) {
                        //throw new RuntimeException(e);
                        System.out.println(e.toString());
                    }
                    break;
                case 3:
                    System.out.println("Current balance: " + account.getBalance());
                    break;

            }
        } while (choice >= 1 && choice <= 3);
        System.out.println("bye....");

    }
}
