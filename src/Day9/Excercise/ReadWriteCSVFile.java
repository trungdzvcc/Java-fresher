package Day9.Excercise;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteCSVFile {
    public  static String[] helo ;
     public static void readFile(String filePath){
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                helo = data;
            }

            br.close();
        } catch (Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
    }
    public void pirnt(){
        for (int i = 0; i <helo.length; i++) {
            System.out.println(helo[i]);
        }
    }
    public static void main(String[] args) {
        ReadWriteCSVFile readWriteCSVFile = new ReadWriteCSVFile();
        readWriteCSVFile.readFile("C:\\Users\\My PC\\Desktop\\Java-fresher\\src\\Day9\\Excercise\\pathToCsv.csv");
//        coppyFile.writeFile("C:/Users/My PC/Desktop/Java-fresher/src/Day9/Excercise/coppy.txt", numbers);
        readWriteCSVFile.pirnt();
    }


}
