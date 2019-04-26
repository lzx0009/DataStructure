package chat02;

import java.util.*;

public class Main {
    public static void main(String[] a){
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Iterator itt = list.iterator();
        System.out.println("list遍历");
        while (itt.hasNext()){
            System.out.println(itt.next());
        }


        Set set = new HashSet();
        set.add(21);
        set.add(22);
        set.add(23);
        Iterator iterator1 = set.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }

        Map<Integer,String> map = new HashMap<Integer, String>();
        map.put(1,"a");
        map.put(2,"ab");
        map.put(3,"abc");
        System.out.println("keySet遍历");
        for (int i:map.keySet() ) {
            System.out.print(map.get(i)+" ");
            System.out.println();
        }


        Iterator<Map.Entry<Integer,String>> it = map.entrySet().iterator();
        System.out.println("iterator遍历");
        while(it.hasNext()){
            System.out.print(it.next()+" ");
            System.out.println();

        }


        System.out.println("Map.Entry遍历");
        for (Map.Entry<Integer,String> m:map.entrySet()) {
            System.out.print(m+" ");
            System.out.println();

        }

        System.out.println(map.values());
        Iterator iterator = map.values().iterator();
       while (iterator.hasNext()){
           System.out.println(iterator.next());
       }
    }
}
