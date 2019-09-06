package threadDemo;

public class Produce implements Runnable {

    private basket basket;

    public Produce(threadDemo.basket basket) {
        this.basket = basket;
    }

    @Override
    public void run() {
        synchronized (basket){
            if (basket.getTag() != 0){
                try {
                    basket.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("当前库存："+basket.getTag()+"   开始进行生产1");
            basket.addTag();
            basket.notify();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
