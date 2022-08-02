package StudentManager;

import java.util.ArrayList;

public class ListArray {
    private ArrayList<Student> studentList;

    public ListArray(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public ListArray() {
        this.studentList = new ArrayList<Student>();
    }

    public  void addStudent(Student student) {
        this.studentList.add(student);
    }
    public  void print() {
        for (Student st : studentList) {
            System.out.println(st);
            
        }
    }
}
