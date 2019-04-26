package numberlist;

import java.util.Scanner;

public class NumGroup {
    public static void main(String[] args){

        NumFun array = new NumFun();

        Scanner scan = new Scanner(System.in);
        // �Ӽ��̽�������
        // next��ʽ�����ַ���
        System.out.println("next��ʽ���գ�");
        // �ж��Ƿ�������
//        String str1 = null;

        int str1 =0;
        while (scan.hasNextInt()) {
            str1 = scan.nextInt();
            array.add(str1);
            System.out.println(array.size());
        }
        System.out.println(array.toString());
    }

}
