public class Person extends Thread{
    private Account account;

    public Person(String name, Account account) {
        super(name);
        this.account = account;
    }

    @Override
    public void run() {
        for(int i=0; i<5; i++) {
            account.cashWithdraw(10);
        }
    }
}
