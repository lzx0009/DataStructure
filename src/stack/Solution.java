package stack;

public class Solution {

    int[] array=new int[]{};

    public void push(int node) {
        int[] tep =new int[array.length+1];
        int i=0;
        for(i=0;i<array.length;i++){
            tep[i]=array[i];
        }
        tep[array.length]=node;
        array=tep;
    }

    public void pop() {
        int[] tep =new int[array.length-1];
        int i=0;
        for(i=0;i<array.length-1;i++){
            tep[i]=array[i];
        }
        array=tep;
    }

    public int top() {
        return array[array.length-1];
    }

    public int min() {
        int min=array[array.length-1];
        for(int i=0;i<array.length-1;i++){
            if(min>array[i]){
                min=array[i];
            }
        }
        return min;
    }


}