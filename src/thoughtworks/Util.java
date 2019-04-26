import java.util.regex.Pattern;

public class Util {


    static boolean checkInput(String input){
        boolean tag = true;
        String[] arr = formatInput(input);
        String pattern = "[\\d ]*";

        boolean msg = Pattern.matches(pattern, input);
        if (arr.length!=2||!msg){
            tag = false;
        }
        return tag;
    }

    static String[] formatInput(String input){
        String[] arr = input.split(" ");
        return arr;
    }

    public static boolean checkFormat(String map, int size){

        boolean tag = false;
        for (int i = 0 ; i < size ; i++){
            String tep = String.valueOf(map.charAt(i));
            if(tep.equals("G")||tep.equals("R")||tep.equals("F")){
                tag = true;
            }else {
                return tag;
            }
        }
        return tag;
    }

    static boolean checkSize(String map, int size){
        boolean tag = true;
        if (map.length()!=size){
            tag = false;
        }
        return tag;
    }


}
