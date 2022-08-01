package TH2.Model;

public class Student {
    public static int id=0;
    private String name;


    private String birthDay;

    public Student() {
        id++;
    }

    public Student(String name, String birthDay) {
        this.name = name;
        this.birthDay = birthDay;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

