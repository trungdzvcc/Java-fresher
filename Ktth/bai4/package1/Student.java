package Ktth.bai4.package1;

public abstract class Student {
    protected String name ;
    protected int  age;
    private String Location ;
    
    public Student() {
    }
    public Student(String name, int age, String location) {
        this.name = name;
        this.age = age;
        Location = location;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getLocation() {
        return Location;
    }
    public void setLocation(String location) {
        Location = location;
    }  
    public abstract void say();

    

}
