package numberlist;

import java.util.Arrays;

public class NumFun {

    private int[] arr;

    public NumFun() {
        arr = new int[0];
    }

    public void add(int a){
        int[] tep = new int[arr.length+1];
        for (int i=0;i<arr.length;i++){
            tep[i] = arr[i];
        }
        tep[arr.length]=a;
        arr=tep;
    }

    public int size(){
        return arr.length;
    }

    @Override
    public String toString() {
        return "NumFun{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
}
