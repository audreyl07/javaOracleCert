package S28BestPractice.AdvancedLocking;

public class StampedLockTestEx {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();
        Runnable depositTask = () -> {
            for (int i = 0; i < 3; i++) {
                account.deposit(100);
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        };

        Runnable withdrawTask = () -> {
            for (int i = 0; i < 3; i++) {
                account.withdraw(50);
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        };

        Runnable readTask = () -> {
            for (int i = 0; i < 3; i++) {
                account.getBalanceO();
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            ;
        };

        Thread depositT = new Thread(depositTask, "Depositor");
        Thread withdrawT = new Thread(withdrawTask, "Withdrawer");
        Thread readT = new Thread(readTask, "Reader");

        depositT.start();
        withdrawT.start();
        readT.start();

        try {
            depositT.join();
            withdrawT.join();
            readT.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Final balance: " + account.getBalance());
    }
}
