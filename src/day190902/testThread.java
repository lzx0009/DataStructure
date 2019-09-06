package day190902;

public class testThread {
    public static void main(String[] args) {
        tacketThread t1 = new tacketThread("窗口1");
        tacketThread t2 = new tacketThread("窗口2");
        tacketThread t3 = new tacketThread("窗口3");

        Thread tt1 = new Thread(t1);
        Thread tt2 = new Thread(t2);
        Thread tt3 = new Thread(t3);
        tt1.start();
        tt2.start();
        tt3.start();
    }
}
