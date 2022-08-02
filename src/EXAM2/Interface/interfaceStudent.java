package EXAM2.Interface;

import EXAM2.MODEL.Student;

import java.util.List;

public interface interfaceStudent {
    public  void enterStudent();
    public void getStudentInfo ();
    public  void editStudent();
    public  void deleteStudent();
    public List<Student> searchStudentByName();
    public  void sortByNameStudent();
    public void  searchStudentByBirthDay();


}
