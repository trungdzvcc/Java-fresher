package Day9.Practive;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFileExample {
    public void readFileText(String filePath) {
        try {

            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);

            }
            br.close();

            System.out.println("Tổng = " + sum);
        } catch (Exception e) {

            System.err.println("file not found");
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter url");
//        Scanner scanner = new Scanner(System.in);
        String path = "C:/Users/My PC/Desktop/Java-fresher/src/Day9/Practive/numbers.txt";
        ReadFileExample readfileEx = new ReadFileExample();
        readfileEx.readFileText(path);
    }
}
