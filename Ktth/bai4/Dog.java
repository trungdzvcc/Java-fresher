package Ktth.bai4;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
        //TODO Auto-generated constructor stub
    }
    public void say(){
        System.out.println("hi" + super.getName());
    }
    
}
