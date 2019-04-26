package test.thoughtworks;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

import static java.lang.String.valueOf;

public class Util {

        //������ĵ�ͼ���н��м��
     public  Map<String, Integer> formatInput(String input){
        //����������н��и�ʽ��
          String[] arr = input.trim().split(" ");
        //���������ݽ��й���  �����������ֻ�ո�
          String pattern = "[\\d ]*";
          boolean msg = Pattern.matches(pattern, input);
          Map<String, Integer> param = new HashMap<String, Integer>();
          if (arr.length!=2||!msg){
              return param;
          }else {
              int row = Integer.parseInt(arr[0]);//��ȡ��ʽ����������
              int col = Integer.parseInt(arr[1]);
              if (row*col>0){
                  param.put("row", row);
                  param.put("col", col);
                  param.put("size", row*col);
              }
              return param;
          }
     }

      //������ĵ������ݽ��м��
     public  boolean checkMapFormat(String map, int size){

         for (int i = 0 ; i < size ; i++){
            String tep = valueOf(map.charAt(i));
            if(tep.equals("G")||tep.equals("R")||tep.equals("F")){
            }else {
                return false;
            }
        }
        return true;
     }

     //��ͼ��С�Ƿ������������ƥ��
     public  boolean checkSize(String map, int size){
        boolean tag = true;
        if (map.length()!=size){
            tag = false;
        }
         return tag;
     }

      //�Ե�ͼ���и�ʽ����� start���п�ʼ  end����ĩβ
    public void show(int row, int col, String map){
        int start;
        int end;
        for (int i= 0; i<row ; i++){
            start = i*col;
            end = (i+1)*col;
            //�ж��Ƿ�Ϊ������
            if (i%2==0){
                System.out.println(map.substring(start, end));
            }else {
                StringBuffer str = new StringBuffer(map.substring(start, end));
                System.out.println(str.reverse());
            }
        }
    }
}
