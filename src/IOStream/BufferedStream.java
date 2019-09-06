package IOStream;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BufferedStream {
    public static void main(String[] args) {
        String path = "e://testStream.txt";
        File file = new File(path);

        FileReader fileReader;
        FileWriter fileWriter;
        BufferedReader bufferedReader;
        BufferedWriter bufferedWriter;

        int count;

        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            if (1==1){
                System.out.println("使用readline方法读取");
                String line = bufferedReader.readLine();
                while (line != null){
                    System.out.println(line.split(":")[0]+"号是"+line.split(":")[1]);
                    line = bufferedReader.readLine();
                }
            } else {
                //byte[] b = new byte[1024];
                count = bufferedReader.read();
                System.out.println("使用read方法读取");

                while (count != -1){
                    System.out.println((char)count);
                    count = bufferedReader.read();
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("准备数据写入......");
        System.out.println("请输入数据：");

        File toFile = new File("d://testStream.txt");
        try {
            fileWriter = new FileWriter(toFile, true);
            bufferedWriter = new BufferedWriter(fileWriter);

            List list = new ArrayList<String>();
            list.add("张三");
            list.add("李四");
            list.add("王五");
            for (Object s: list ) {
                bufferedWriter.write((String) s);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
