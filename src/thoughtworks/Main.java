package thoughtworks;

import test.thoughtworks.Util;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        String size_in = null;
        String map = null;
        Scanner in = new Scanner(System.in);

        System.out.println("请输入地图大小（行 列）：");
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

            System.out.println("请输入地图：");
            if (in.hasNextLine()){
                map = in.nextLine();
            }
            in.close();
            //地图大小检查
//            if (Util.checkSize(map, size)){
//                地图输入格式检查
//
//                if(Util.checkFormat(map, size)){
//                    定义行开始、结束位置
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
