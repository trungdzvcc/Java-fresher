package Day4.Excercise;
import java.util.Scanner;

class inforFan{
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    private int speed = SLOW;
    private boolean on;
    private double radius=5;
    private String color;
    
    public inforFan() {
    }

    public inforFan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public boolean isOn() {
        return on;
    }
    public void setOn(boolean on) {
        this.on = on;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String toString(int speed ,String color, double radius , boolean on){
        String print = new String();
        if(on==true){
           print = ("speed : " + speed + " - color : " + color  + " - radius : " + radius + " - fan is on"); 
        }else{
            print=("speed : " + speed + " - color : " + color + " - radius : " + radius + " - fan is off");
        }
        return print;
    }
}
public class Fan {
    public static void main(String[] args){
        inforFan fan1 = new inforFan(); 
        inforFan fan2 = new inforFan();
        System.out.println("Fan 1 : \n" +fan1.toString(inforFan.FAST,"yellow",10,true));
        System.out.println("Fan 2 : \n" +fan2.toString(inforFan.MEDIUM,"blue",5,false));
    }
     
}
