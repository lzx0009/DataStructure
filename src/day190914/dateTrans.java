package day190914;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;

public class dateTrans {
    public static void main(String[] args) {

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date now = new Date();
        String sNow = dateFormat.format(now);
        System.out.println(sNow);
        sNow = sNow.replaceAll("-","");
        sNow = sNow.replaceAll(":","");
        System.out.println(sNow);


        String patten = "acbcacba33cba33";
        String regex = "^([abc]*)(3*)([a-z0-9]*)";
        System.out.println(Pattern.matches(regex,patten));

        System.out.println(64<<3);
        int a = 3;
        byte b = 127;
        double qb = 3.1;
        System.out.println(a+b);


        ConcurrentHashMap map = new ConcurrentHashMap();

    }
}
