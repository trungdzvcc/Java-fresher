package TH2;

import TH2.Model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        //Create a student object to store student data
        ArrayList<Student> array=new ArrayList<Student>();
        //4. Use the cycle to return to the main interface again
        while (true) {
            //1. Write the main interface with the output statement
            System.out.println( "--------- -------------------------------");
            System.out.println ("1. Add students");
            System.out.println("2. Delete students");
            System.out.println ("3. Edit students");
            System.out.println ("4. Print students");
            System.out.println("5. Exit");
            System.out.println ("please enter your choice");

            // 2. Use scanner to enter data with keyboard
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();

            //3. Complete the selection of operation with switch statement
            switch (line) {
                case "1":
                    System.out.println ("add student");
                    addStudent(array);
                    break;
                case "2":
                    System.out.println ("delete student");
                    deleteStudent(array);
                    break;
                case "3":
                    System.out.println ("modify student");
                    updateStudet(array);
                    break;
                case "4":
                    System.out.println ("Print students");
                    FindallStudent(array);
                    break;
                case "5":
                    System.out.println ("thank you for using");
 //                   break;
                    System. exit(0); // JVM exit

            }
        }
    }


    public static void addStudent(ArrayList<Student> array) {
        Scanner sc=new Scanner(System.in);
        System.out.println ("please enter student name");
        String name=sc.nextLine();
        System.out.println ("please enter student birth Day");
        String birthDay=sc.nextLine();
        Student s=new Student();
        s.setName(name);
        s.setBirthDay(birthDay);
        array.add(s);
        System.out.println ("student added successfully");

    }
    public static boolean isUsed(ArrayList<Student> array,String name) {
        boolean flag=false;
        for (int i=0;i< array.size();i++) {
            Student s=array.get(i);
            if (s.getName().equals(name)) {
                flag=true;
                break;
            }
        }
        return flag;
    }
    public static void FindallStudent(ArrayList<Student> array) {
        if (array.size()==0){
            System.out.println ("no information, please add information first in the query");
            return;
        }
        for (int i=0;i< array.size();i++) {
            Student s= array.get(i);
            System.out.println ("HS "+(i+1)+ " | Name: "+s.getName() + " | BirthDay " + s.getBirthDay() );
        }
    }
    public  static void deleteStudent(ArrayList<Student> array) {

        Scanner sc=new Scanner(System.in);

        System.out.println ("please enter the student ID of the student you want to delete");
        int sid=sc.nextInt();
        int index=-1;
        for (int i=0;i< array.size();i++) {
            Student s =array.get(i);
            if (Student.id == sid) {
                index=i;
                break;
            }
        }
        if (index==-1) {
            System.out.println ("the information does not exist, please re-enter");
        } else {
            array.remove(index);
            System.out.println ("delete student succeeded");
        }
    }

    public  static void updateStudet(ArrayList<Student> array) {

    }



}
