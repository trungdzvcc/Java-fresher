package EXAM2.MODEL;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    public static int id = 0;
    private ClassRoom classRoom;
    public ClassRoom getClassRoom() {
        return classRoom;
    }
    public void setClassRoom(ClassRoom classRoom) {
        this.classRoom = classRoom;
    }
    private String fullName;
    private  int idStudent;
    private int day;
    private int month ;
    private int year;
    private Date birthDay;

    public Student() {
        id++;
        idStudent = id;
    }

    public Student(ClassRoom room, String fullName, int idStudent, Date birthDay) {
        this.classRoom = room;
        this.fullName = fullName;
        this.idStudent = idStudent;
        this.birthDay = birthDay;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYearx() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getBirthDay() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        return formatter.format(birthDay);
    }

    public void setBirthDay(String dateBirthDay) {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        try {
            date = formatter.parse(dateBirthDay);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.birthDay = date;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                "classRoom='" + classRoom+
                ", idStudent=" + idStudent +
                ", birthDay=" + getBirthDay() +
                '}';
    }
}
