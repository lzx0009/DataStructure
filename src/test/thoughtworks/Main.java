package test.thoughtworks;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Geography geography = new Geography();
        //准备入参
        if (geography.ready()){
            //入参没问题则进行输出
            geography.show();
        }
//============================================================================

//        Class cc = Class.forName("test.thoughtworks.Geography");
//        Object o = cc.newInstance();
//        Method m = cc.getMethod("ready");
//        Method m1 = cc.getMethod("show");
//
//        if ((boolean)m.invoke(o)){
//            m1.invoke(o);
//        }


//============================================================================
//        //mapSize用来接收输入的行列数
//        //map用来接收输入的地图内容
//        Scanner sc = new Scanner(System.in);
//        Util com.util = new Util();
//        System.out.println("请输入网格大小：");
//
//        String mapSize = null;
//        if (sc.hasNextLine()) {
//            mapSize = sc.nextLine();
//        }
//        Map<String, Integer> param = com.util.formatInput(mapSize);
//        if (param.size() == 0) {
//            System.out.println("Incorrect mesh size.");
//
//        } else {
//            String map = null;
//            System.out.println("地形:");
//            if (sc.hasNextLine()) {
//                map = sc.nextLine();
//            }
//            sc.close();
//
//            int col = param.get("col");
//            int row = param.get("row");
//            //地图内容与输入的大小是否匹配
//            if (map.length() == col * row) {
//                boolean tag = com.util.checkMapFormat(map, col * row);
//                //所输入的地图内容是否合法
//                if (tag) {
//                    com.util.show(row, col, map);
//
////                    Util.show(row, col, map);
//                } else {
//                    System.out.println("Invalid celltype.");
//                }
//            } else {
//                System.out.println("Data mismatch.");
//            }
//
//        }
    }
}
