package test.threadthoughtworks;

import test.thoughtworks.Util;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        String mapsize = "10 10";
        String map = "GFRRFGGFFRRGFRRFGGFFRRGFRRFGGFFRRGFRRFGGFFRRGFRRFGGFFRRGFRRFGGFFRRGFRRFGGFFRRGFRRFGGFFRRGFRRFGGFFRRGFRRFGGFFRR";
        checkmapformat c1 = new checkmapformat(map,mapsize);
        checkmapsize c2 = new checkmapsize(map,mapsize);
        Thread t1 = new Thread(c1);
        t1.start();
//        t1.join();
        Thread t2 = new Thread(c2);
        t2.start();
//        t2.join();
        if (t1.isAlive()||t2.isAlive()){

        }else {

//            Util.show(10,10,map);
        }

    }
}
