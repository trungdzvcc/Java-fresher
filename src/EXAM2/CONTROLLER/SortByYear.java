package EXAM2.CONTROLLER;

import EXAM2.MODEL.Student;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

public class SortByYear implements Comparator<Student> {


    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getYearx() == o2.getYearx()){
            return 0;
        }else if (o1.getYearx() > o2.getYearx()){
            return 1;
        }else {
            return -1;
        }

    }
}
