package Day8.Demo.View;

import Day8.Demo.Model.Student;
import LoginMVC.Model;

import java.util.Scanner;

public class ViewStudent {
    public static Scanner scanner = new Scanner(System.in);
    public void showMessage(String smg) {
        System.out.println(smg);
    }
    public Student getStudentInfo() {

        Student st = new Student();
        System.out.print("Name: ");
        st.setName(scanner.next());
        System.out.print("Age: ");
        st.setAge(Integer.parseInt(scanner.next()));
        System.out.print("Addres: ");
        st.setAddress(scanner.next());
        return st;
    }
}
