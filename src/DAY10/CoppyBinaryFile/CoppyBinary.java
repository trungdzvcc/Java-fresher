package DAY10.CoppyBinaryFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CoppyBinary {
    public static void main(String[] args) {

        String sourceFile = "C:\\Users\\Mai Ngoc Trung\\IdeaProjects\\FresherJava\\src\\DAY10\\Test\\CoppyBinaryFile\\sourceFile";
        String destFile = "C:\\Users\\Mai Ngoc Trung\\IdeaProjects\\FresherJava\\src\\DAY10\\Test\\CoppyBinaryFile\\tagetFile";
        FileInputStream fin = null;
        FileOutputStream fout = null;

        try {
            fin = new FileInputStream(sourceFile);
            fout = new FileOutputStream(destFile);

            byte[] buffer = new byte[1024];
            int noOfBytes = 0;

            System.out.println("Copying file using streams");

            while ((noOfBytes = fin.read(buffer)) != -1) {
                fout.write(buffer, 0, noOfBytes);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found" + e);
        }
        catch (IOException ioe) {
            System.out.println("Exception while copying file " + ioe);
        }
        finally {
            // close the streams using close method
            try {
                if (fin != null) {
                    fin.close();
                }
                if (fout != null) {
                    fout.close();
                }
            }
            catch (IOException ioe) {
                System.out.println("Error while closing stream: " + ioe);
            }
        }
    }
}
