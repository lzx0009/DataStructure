package threadDemo;

public class Consumer implements Runnable {

    private basket basket;

    public Consumer(threadDemo.basket basket) {
        this.basket = basket;
    }

    @Override
    public void run() {
        synchronized (basket){
            if (basket.getTag() == 0){
                try {
                    basket.wait();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            System.out.println("当前库存："+basket.getTag()+"  开始消费1");
            basket.rmTag();
            basket.notify();
        }
    }
}
