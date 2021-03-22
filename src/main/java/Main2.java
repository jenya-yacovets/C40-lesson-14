public class Main2 {
    public static void main(String[] args) {

        Account account = new Account(50);

        Person person1 = new Person("Вася", account);
        Person person2 = new Person("Гриша", account);

        person1.start();
        person2.start();
    }
}
