package EXAM2.CONTROLLER;

import EXAM2.MODEL.Student;

import java.util.Comparator;

public class SortByName implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getFullName().compareTo(o2.getFullName());
    }
}
