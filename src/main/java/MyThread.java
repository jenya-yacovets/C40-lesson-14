public class MyThread extends Thread{

    @Override
    public void run() {
        System.out.println("Это выполняется в отдельном потоке");
    }
}
