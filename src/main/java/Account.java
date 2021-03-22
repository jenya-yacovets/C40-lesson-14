public class Account implements Runnable{
    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    private boolean checkBalance(int money) {
        String name = Thread.currentThread().getName();
        System.out.println(name + "проверяет баланс");

        if(balance >= money) {
            System.out.println("Для " + name + " деньги есть. Баланс " + balance);
            return true;
        }

        System.out.println("Для " + name + " деньг нет. Баланс " + balance);
        return false;
    }

    public synchronized void cashWithdraw(int money) {
        String name = Thread.currentThread().getName();
        System.out.println(name + " пытается снять с баланса " + money);

        if(checkBalance(money)) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance -= money;
            System.out.println(name + " снял со счета " + money + " на счету осталось " + balance);
        }
    }

    @Override
    public void run() {

    }
}
