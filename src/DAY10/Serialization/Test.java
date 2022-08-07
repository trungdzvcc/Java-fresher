package DAY10.Serialization;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {
        List<studennt> students = new ArrayList<studennt>();
//        students.add(new studennt("A" , "famel"));
//        students.add(new studennt("b" , "male"));
//        students.add(new studennt("C" , "famel"));
//        FileOutputStream out = null;
//        ObjectOutputStream oos = null;
//        try {
//            out = new FileOutputStream("C:\\Users\\Mai Ngoc Trung\\IdeaProjects\\FresherJava\\src\\DAY10\\Test\\Serialization\\studentlist.txt");
//            oos = new ObjectOutputStream(out);
//            oos.writeObject(students);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }finally {
//            if(out != null){
//                out.close();
//            }
//            if(oos != null){
//                oos.close();
//            }
//        }
        FileInputStream in = null;
        ObjectInputStream inputStream = null;
        try {

            in = new FileInputStream("C:\\Users\\Mai Ngoc Trung\\IdeaProjects\\FresherJava\\src\\DAY10\\Test\\Serialization\\studentlist.txt");
            inputStream = new ObjectInputStream(in);
            students = (List<studennt>) inputStream.readObject();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(in != null){
                in.close();

            }
            if(inputStream!=null){
                 inputStream.close();
            }

        }
        System.out.println("ket qua");
        for(int i = 0; i <students.size(); i++){
            students.get(i).Show();
        }
    }
}
