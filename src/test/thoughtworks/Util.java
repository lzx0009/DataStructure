package test.thoughtworks;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

import static java.lang.String.valueOf;

public class Util {

        //对输入的地图行列进行检查
     public  Map<String, Integer> formatInput(String input){
        //对输入的行列进行格式化
          String[] arr = input.trim().split(" ");
        //对行列内容进行过滤  仅可输入数字或空格
          String pattern = "[\\d ]*";
          boolean msg = Pattern.matches(pattern, input);
          Map<String, Integer> param = new HashMap<String, Integer>();
          if (arr.length!=2||!msg){
              return param;
          }else {
              int row = Integer.parseInt(arr[0]);//获取格式化的行列数
              int col = Integer.parseInt(arr[1]);
              if (row*col>0){
                  param.put("row", row);
                  param.put("col", col);
                  param.put("size", row*col);
              }
              return param;
          }
     }

      //对输入的地型内容进行检查
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

     //地图大小是否与输入的内容匹配
     public  boolean checkSize(String map, int size){
        boolean tag = true;
        if (map.length()!=size){
            tag = false;
        }
         return tag;
     }

      //对地图进行格式化输出 start：行开始  end：行末尾
    public void show(int row, int col, String map){
        int start;
        int end;
        for (int i= 0; i<row ; i++){
            start = i*col;
            end = (i+1)*col;
            //判断是否为奇数行
            if (i%2==0){
                System.out.println(map.substring(start, end));
            }else {
                StringBuffer str = new StringBuffer(map.substring(start, end));
                System.out.println(str.reverse());
            }
        }
    }
}
