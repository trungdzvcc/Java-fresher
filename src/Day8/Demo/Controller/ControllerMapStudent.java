package Day8.Demo.Controller;

import Day8.Demo.Model.Student;
import Day8.Demo.View.ViewStudent;

import java.util.HashMap;
import java.util.Map;

public class ControllerMapStudent {
    private ViewStudent view;

    public ControllerMapStudent(ViewStudent view) {
        this.view = view;
    }

//    public static   Student Mapstudent(Student student1 , Student student2 , Student student3 ){
//        // write Map
//        Map<Integer, Student> studentMap = new HashMap<Integer, Student>();
//        studentMap.put(1,student1);
//        studentMap.put(1,student2);
//        studentMap.put(3,student3);
//        studentMap.put(4,student1);
//
//        for(Map.Entry<Integer, Student> student : studentMap.entrySet()){
//            System.out.println(student.toString());
//        }
//        System.out.println("xong");
//        return (Student) studentMap;
//
//    }
public void Mapstudent(Student student1){
    // write Map
    Student st = view.getStudentInfo();
    Map<Integer, Student> studentMap = new HashMap<Integer, Student>();
    //studentMap.put(1,(String) (st.getAge()));
//    studentMap.put(1,student2);
//    studentMap.put(3,student3);
    studentMap.put(4,student1);

    for(Map.Entry<Integer, Student> student : studentMap.entrySet()){
        System.out.println(student.toString());
    }
}

    public ViewStudent getView() {
        return view;
    }

    public void setView(ViewStudent view) {
        this.view = view;
    }
}
