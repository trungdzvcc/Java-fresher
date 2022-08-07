package DAY10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestFile {
    public static void main(String[] args){
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
             fileInputStream = new FileInputStream("C:\\Users\\Mai Ngoc Trung\\IdeaProjects\\FresherJava\\src\\DAY10\\Test\\test.txt");
            fileOutputStream = new FileOutputStream("C:\\Users\\Mai Ngoc Trung\\IdeaProjects\\FresherJava\\src\\DAY10\\Test\\test_out.txt");
             int ch;
             while ((ch =fileInputStream.read())!=-1){
                 System.out.print((char)ch);
                 fileOutputStream.write(ch);
             }
        } catch (Exception e) {
            Logger.getLogger(TestFile.class.getName()).log(Level.SEVERE,null,e);
        }finally {
            if (fileInputStream != null){
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    Logger.getLogger(TestFile.class.getName()).log(Level.SEVERE,null,e);
                }
            }
        }
    }

}
