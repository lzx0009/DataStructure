package test.threadthoughtworks;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

import static java.lang.String.valueOf;

public class checkmapsize implements Runnable {
    private String map;
    private String mapSize;

    public checkmapsize(String map, String mapSize) {
        this.map = map;
        this.mapSize = mapSize;
    }

    @Override
    public void run() {
        boolean tag =true;
        while (tag) {

            for (int i = 0; i < map.length(); i++) {
                String tep = valueOf(map.charAt(i));
                if (tep.equals("G") || tep.equals("R") || tep.equals("F")) {
                } else {
                    System.out.println("Invalid celltype 网格不合法");
//                    return;
                }
            }

            System.out.println("Invalid celltype 网格不合法 执行完成");

            tag=false;
        }
    }
}
