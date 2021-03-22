public class Calculation implements Runnable {
    private int count;

    public Calculation(int count) {
        this.count = count;
    }

    @Override
    public void run() {
        for (int i=0; i<count; i++) {
            String name = Thread.currentThread().getName();
            System.out.println(name + " | " + i);
        }
    }
}
