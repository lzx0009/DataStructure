package test;

import java.io.File;
import java.util.*;

public class Iterator{


    public  static void main(String[] args){

        Map m = new TreeMap();
        m.put(1,11);
        m.put(2,22);
        m.put(3,33);
        m.put(4,"");
        System.out.println(m.toString());

        Map m1 = new HashMap();
        m1.put(1,11);
        m1.put(2,22);
        m1.put(3,33);
        m1.put("",33);
        m1.put("","");
        System.out.println(m1.toString());

        List l = new LinkedList();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(3);
        System.out.println(l.toString());

        Set s = new TreeSet();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(3);
        System.out.println(s.toString());

//        boolean tag = false;
//        String map = "GFR";
//        for (int i = 0 ; i < 3 ; i++){
//            String tep = String.valueOf(map.charAt(i));
//            if(tep.equals("G")){
//                tag = true;
//            }
//        }
//S


//        int i=2;
//        LinkedList arr = new LinkedList();
//        arr.add(0);
//        arr.add(1);
//        arr.add(2);
//        System.out.println("当前集合为："+arr.toString());
//        arr.add(i,0);
//        System.out.println(i+"位置插入后集合为："+arr.toString());
//
//        ArrayList arrayList = new ArrayList();
//        arrayList.addAll(arr);
//        System.out.println(arrayList.contains(3));
//        System.out.println(arrayList.contains(1));
//        Iterator ar = (Iterator) arrayList.iterator();
//        System.out.println(ar.toString());


//        Iterator it = (Iterator) arr.iterator();
//        System.out.println(it.toString());

//        Map map= new HashMap();
//        map.put(1,1.0);
//        map.put(2,2.0);
//        map.put(3,3.0);
//        System.out.println(map);
//        System.out.println(map.toString());
//        System.out.println(map.values().toString());
//        List list = new LinkedList();
////        Iterator iter = (Iterator) list.iterator();
//        Iterator iterator = (Iterator) map.values().iterator();

    }
}
