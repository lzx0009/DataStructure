package day190528;

import java.io.*;

public class bufferedstream {
    public static void main(String[] args) {

        try {
            FileReader fis = new FileReader("D://demo.txt");
            BufferedReader bis = new BufferedReader(fis);

            File file = new File("d://demodo.txt");
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            if (!file.exists()){
                file.createNewFile();
            }
            String code = bis.readLine();
            while (code!=null){
                System.out.println( code);
                bw.newLine();
                bw.write(code);
//                bw.flush();
                code = bis.readLine();
            }
            bw.close();
            bis.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
