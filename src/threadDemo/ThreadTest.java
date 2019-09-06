package threadDemo;

public class ThreadTest {
    public static void main(String[] args) {

        basket b = new basket();
        Produce p = new Produce(b);
        Consumer c = new Consumer(b);

        new Thread(c).start();
        new Thread(p).start();
    }
}
