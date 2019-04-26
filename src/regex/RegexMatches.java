package regex;

import java.util.regex.Pattern;

public class RegexMatches {
    public static  void main(String[] args){
        String lint = "23 42";
        String pattern = "[\\d ]*";

        if (Pattern.matches(pattern,lint))
        {

            System.out.println("ok");
        }

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
