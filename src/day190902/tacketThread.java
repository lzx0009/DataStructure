package day190902;

public class tacketThread implements Runnable {

    private static int tickets = 50;
    private String name;
    private static Object o = new Object();

    tacketThread(String name){
        this.name = name;
    }
    @Override
    public void run() {
        Loop1: while (true){
            synchronized (o){
                if (tickets > 0){
                    System.out.println(this.name+"出售"+(tickets--)+"号票");
                } else {
                    break Loop1;
                }
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
        System.out.println(this.name+"售票截止");
    }
}
