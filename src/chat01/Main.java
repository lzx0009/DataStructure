package chat01;

public class Main {
    public static void main(String[] args){


        test t1 = new test(1);
        test t2 = new test(1);
        System.out.println("==  false  :  "+(t1==t2) );
        System.out.println("equals  true  :  "+(t1.equals(t2)) );
        int a = 2;
        int b = 2;
        Integer aa = 2;
        Integer bb = 2;
        String a1 = "qq";
        String b1 = "qq";
        String a2 = new String("qq");
        String b2 = new String("qq");
        System.out.println("a==b true :  " +(a == b));
        System.out.println("a1==b1 true :  "+(a1 == b1));
        System.out.println("a2==b2 true :  "+(a2 == b2));
        System.out.println("aa==bb true :  "+(aa == bb));
        System.out.println("a1.equal(b1) true :  "+( a1.equals(b1)  ));
        System.out.println("a2.equal(b2)  false  :"+( a2.equals(b2)  ));
        System.out.println("aa.equal(bb)  false  :"+( aa.equals(bb)  ));
    }
}
