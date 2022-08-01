package Day8.Demo;
import Day8.Demo.Controller.ControllerMapStudent;
import Day8.Demo.Model.Student;
import Day8.Demo.View.ViewStudent;
import LoginMVC.Model;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        ViewStudent view = new ViewStudent();
        ControllerMapStudent controller = new ControllerMapStudent(view);
        Student model = new Student();
        controller.Mapstudent(model);
     //   System.out.println("...........Set");
//        Set<Student> students = new HashSet<Student>();
//        students.add(student1);
//        students.add(student2);
//        students.add(student3);
//        students.add(student4);

//        for(Student student : students){
//            System.out.println(student.toString());
//        }
    }

}
