package regex;

import java.util.regex.Pattern;

public class RegexMatches {
    public static  void main(String[] args){
        String lint = "2342adfa";
        String pattern = "[0-9]*[a-z]*";

        System.out.println(Pattern.matches(pattern,lint));

//        Pattern r = Pattern.compile(pattern);
//        Matcher m = r.matcher(lint);
//        if (m.find()){
//            System.out.println("found value:"+m.group(0));
//            System.out.println("found value:"+m.group());
////            System.out.println("found value:"+m.group(2));
////            System.out.println("group:"+m.group(3));
//            System.out.println("groupCount:"+m.groupCount());
//        }
    }
}
