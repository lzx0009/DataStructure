package test.threadthoughtworks;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

import static java.lang.String.valueOf;

public class checkmapformat implements Runnable {
    private String map;
    private String mapSize;

    public checkmapformat(String map, String mapSize) {
        this.map = map;
        this.mapSize = mapSize;
    }

    @Override
    public void run() {
        boolean tag=true;
        while (tag) {
            String[] arr = mapSize.trim().split(" ");
            String pattern = "[\\d ]*";

            boolean msg = Pattern.matches(pattern, mapSize);
            Map<String, Integer> param = new HashMap<String, Integer>();
            if (arr.length != 2 || !msg) {
                System.out.println("Incorrect mesh size. 大小不合法");
//                tag=false;
            } else {
                int row = Integer.parseInt(arr[0]);
                int col = Integer.parseInt(arr[1]);

                if (map.length() != row * col) {
                    System.out.println("Data mismatch 大小不匹配");
//                    tag=false;
                }
            }

            System.out.println("Data mismatch 执行完成");
            tag=false;

        }
    }
}
