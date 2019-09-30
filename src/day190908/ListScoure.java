package day190908;

import java.util.*;

public class ListScoure {
    public static void main(String[] args) {
        List<int[]> list = new LinkedList<int[]>();
        int[] i1;
        i1 = new int[]{1,2,3};
        int i2[] = new int[]{2,1,0};

        list.add(i1);
        list.add(i2);

        Iterator<int[]> iterator = list.iterator();
        while (iterator.hasNext()) {
            int[] next = iterator.next();
            for (int i:next){
                System.out.println(i);
            }
        }

        Map map = new HashMap();
        map.put(1,101);
        map.put(2,202);
        map.put("","NULL");
        map.put("","");
        Set entrySet = map.entrySet();
        Iterator iterator1 = entrySet.iterator();
        while (iterator1.hasNext()) {
            Map.Entry o = (Map.Entry) iterator1.next();
            System.out.println(o.getKey()+":"+o.getValue());
        }

        int i = 1;
        for ( ; true; i++) {
            System.out.println(i);
            if (i ==4)break;
        }
    }
}
