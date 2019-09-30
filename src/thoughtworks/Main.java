package thoughtworks;

import test.thoughtworks.Util;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        String size_in = null;
        String map = null;
        Scanner in = new Scanner(System.in);

        System.out.println("请输入地图大小：");
        if (in.hasNextLine()){
            size_in = in.nextLine().trim();
        }
//        boolean tag = Util.checkInput(size_in);
//        if (!tag){
//            System.out.println("Incorrect mesh size.");
//        }else {
//            String[] arr = Util.formatInput(size_in);
//
//            int row = Integer.parseInt(arr[0]);
//            int col = Integer.parseInt(arr[1]);
//            int size = row*col;

            System.out.println("请输入地图内容：");
            if (in.hasNextLine()){
                map = in.nextLine();
            }
            in.close();
            //��ͼ��С���
//            if (Util.checkSize(map, size)){
//                ��ͼ�����ʽ���
//
//                if(Util.checkFormat(map, size)){
//                    �����п�ʼ������λ��
//                    MapFormat.show(row, col, map);
//                }else {
//                    System.out.println("Data mismatch");
//                }
//            }else {
//                System.out.println("Invalid celltype");
//            }
//        }
//

    }


}
