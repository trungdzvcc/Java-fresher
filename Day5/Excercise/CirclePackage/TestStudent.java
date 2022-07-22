package Day5.Excercise.CirclePackage;
import Day5.Excercise.StudentPackage.Student;
public class TestStudent extends Student{
    public static void main(String[] args){
        Student student = new Student();
        student.setName("Trung");
        student.setClasses("H3");
        // TestStudent in CirclePackage 
        student.show();
    }
    
}
