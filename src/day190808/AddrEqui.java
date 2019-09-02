package day190808;

public class AddrEqui {
    public static void main(String[] args) {

        String h1 = "hello";
        String h2 = new String("hello");
        String h3 = new String("hello");
        String h4 = h1;
        String h5 = "hello";

        System.out.println(h5.compareTo(h1));

        System.out.println(h1.equals(h2));
        System.out.println(h3 == h2);
        System.out.println(h5 == h4);
    }
}
