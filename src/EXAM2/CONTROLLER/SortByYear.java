package EXAM2.CONTROLLER;

import EXAM2.MODEL.Student;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

public class SortByYear implements Comparator<Student> {


    @Override
    public int compare(Student o1, Student o2) {
        Student s1 = (Student) o1;
        Student s2 = (Student) o2;
        Date date1 = new Date();
        Date date2 = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        try {
            date1 = formatter.parse(s1.getBirthDay());
            date2 = formatter.parse(s2.getBirthDay());
        } catch (ParseException e) {
            e.printStackTrace();
        }
       return date1.compareTo(date2);

    }
}
