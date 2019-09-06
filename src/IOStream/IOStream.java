package IOStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class IOStream {
    public static void main(String[] args) throws IOException {
        String path = "d://testStream.txt";
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        File file = new File(path);
        if (file.exists()) {
//            file.delete();
        } else {
            file.createNewFile();
        }

        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] b = new byte[5];
        int read = fileInputStream.read(b);
        while (read != -1){
            System.out.print(new String(b,0,read));
            read = fileInputStream.read(b);
        }

        FileOutputStream fileOutputStream = new FileOutputStream(file);
        byte[] bytes = "你回家了嘛".getBytes();
        fileOutputStream.write(bytes);
        fileOutputStream.flush();
        fileOutputStream.close();
        System.out.println("写入完成");


//        File[] files = file.listFiles();
//        for (File file1:files){
//            System.out.println("文件路径"+file1.getPath()+"  文件修改时间："+(sd.format(new Date(file1.lastModified()))));
//        }

    }
}
