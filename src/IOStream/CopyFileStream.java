package IOStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileStream {
    public static void main(String[] args) throws IOException {
        String path = "d://testStream.txt";
        File file = new File(path);
        copyfiles(file);
    }

    private static void copyfiles(File file) throws IOException {

        if(file.isDirectory()){
//            if (null != file.listFiles()) {
//                File[] listFiles = file.listFiles();
//                for (File file1: listFiles){
//                    if(file1.isDirectory()){
//                        copyfiles(file1);
//                    } else {
//                        String str = file1.getAbsolutePath().replace("d:", "e:");
//                        System.out.println(str);
//                        FileOutputStream fos = new FileOutputStream(new File(str));
//                        FileInputStream fis = new FileInputStream(file1);
//                        byte[] b = new byte[5];
//                        int read = fis.read(b);
//                        fos.write(b);
//                        fos.flush();
//                        fos.close();
//                    }
//                }
//            } else {
//                file.mkdirs();
//            }
        } else {
            FileOutputStream fos = new FileOutputStream(new File(file.getAbsolutePath().replace("d:", "e:")));
            FileInputStream fis = new FileInputStream(file);
            byte[] b = new byte[5];
            int read = fis.read(b);
            while (read != -1) {

                fos.write(b,0,read);
                read = fis.read(b);
            }
            fos.flush();
            fos.close();

        }
    }
}
