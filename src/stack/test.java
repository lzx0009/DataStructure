package stack;

public class test {

    public static void main(String []args){
        Solution s=new Solution();
        s.push(3);
        s.push(2);
        s.push(3);

        System.out.println(s.toString());
        System.out.println(s.min());
    }
}
