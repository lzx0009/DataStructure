package test.thoughtworks;

import java.util.Scanner;
import java.util.regex.Pattern;

import static java.lang.String.valueOf;

public class Geography {
    private int col;
    private int row;
    private String mapSize;
    private String mapStr1;
    private String mapStr2;

    public boolean ready(){

        mapStr1 = "";
        mapStr2 = "";
        mapSize = "";
        boolean tag = true;
        Scanner scan = new Scanner(System.in);
        System.out.println("�����������������к����ݣ�");
        if(scan.hasNextLine()){
            mapSize = scan.nextLine().trim();
        }

        //���м��
        if (formatMapSize()){

            if (scan.hasNextLine()) {
                mapStr1 = scan.nextLine().trim();
            }
            if (scan.hasNextLine()) {
                mapStr2 = scan.nextLine().trim();
            }

            String ss = new StringBuffer(mapStr2).reverse().toString();
//            String tepStr =
            mapStr1=mapStr1+ss;
            //����ͼ���ȼ��
            if (mapStr1.length()==col*row){

                //����ͼ���ݼ��
                if (!checkMapStr()){
                    System.out.println("Invalid celltype.");
                    tag = false;
                }
            }else {
                System.out.println("Data mismatch.");
                tag = false;
            }

        }else {
            System.out.println("Incorrect mesh size.");
            tag = false;
        }

        return tag;
    }

    public void show(){

        for (int i= 0; i<row ; i++){
            int start = i*col;
            int end = (i+1)*col;
            //ż�����������
            if (i%2==0){
                System.out.println(mapStr1.substring(start, end));
            }else {
                StringBuffer str = new StringBuffer(mapStr1.substring(start, end));
                System.out.println(str.reverse());
            }
        }
    }

    private boolean formatMapSize() {
        String[] arr = mapSize.split(" ");
        //���������ݽ��й���  �����������ֻ�ո�
        String pattern = "[\\d ]*";
        boolean msg = Pattern.matches(pattern, mapSize);
        if (arr.length!=2||!msg){
            return false;
        }else {
            row = Integer.parseInt(arr[0]);//��ȡ��ʽ����������
            col = Integer.parseInt(arr[1]);
            if (row*col==0){
                return false;
            }
        }
        return true;
    }

    private Boolean checkMapStr(){

//        for (int i = 0 ; i < mapStr.length() ; i++){
//            String tep = valueOf(mapStr.charAt(i));
            String pa = "[FRG]*";
            boolean tag = Pattern.matches(pa,mapStr1);
//            if (!tag){
//                return false;
//            }
//            if(tep.equals("G")||tep.equals("R")||tep.equals("F")){
//            }else {
//                return false;
//            }
//        }
        return tag;

    }

}
