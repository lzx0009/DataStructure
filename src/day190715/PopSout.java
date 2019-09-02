package day190715;

public class PopSout {

    public static void main(String[] args) {
        int[] arr = {9,8,5,2,1,7};

        for (int i = 0; i<6; i++){
            for (int j=0; j<5-i; j++){
                if (arr[j]>=arr[j+1]){
                    int tep = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j]= tep;
                }
            }
        }
        System.out.println("冒泡排序：");
        for (int a:arr ) {
            System.out.println(a);
        }
    }
}
