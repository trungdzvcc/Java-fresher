package Day9.Excercise;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CoppyFile {
    public List<Integer> readFile(String filePath){
        List<Integer> numbers = new ArrayList<>();
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                numbers.add(Integer.parseInt(line));
            }
            br.close();
        } catch (Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }

        return numbers;
    }

    public void writeFile(String filePath, List<Integer> numbers){

            for (Integer number : numbers) {
                System.out.println(number);
            }


        try {
            FileWriter writer = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            int i = 0;
            for (int j = 0; j < numbers.size(); j++){
                bufferedWriter.write(numbers.get(j).toString()+'\n');
            }
            System.out.println("Count characteristics " + i);
            System.out.println("Successfully written ");

            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        CoppyFile coppyFile = new CoppyFile();
        List<Integer> numbers = coppyFile.readFile("C:/Users/My PC/Desktop/Java-fresher/src/Day9/Practive/number.txt");
        coppyFile.writeFile("C:/Users/My PC/Desktop/Java-fresher/src/Day9/Excercise/coppy.txt", numbers);
    }
}
