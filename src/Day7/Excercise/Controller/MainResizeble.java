package Day7.Excercise.Controller;

import Day7.Excercise.Model.Resizeble.Circle;
import Day7.Excercise.Model.Resizeble.Rectangle;
import Day7.Excercise.Model.Resizeble.Shape;
import Day7.Excercise.Model.Resizeble.Square;

import java.util.Random;

public class MainResizeble {
    public static void main(String[] args){
        Circle c1 = new Circle(6);
        Square s1 = new Square(4);
        Rectangle r1 = new Rectangle(9,8);

        Shape[] shapes = new Shape[3];
        shapes[0] = c1;;
        shapes[1] = s1;
        shapes[2] = r1;

        //Pre-resize
        System.out.println("Pre-resize");
        for (Shape i : shapes){
            System.out.println(i);
        }
        Random r = new Random();
        int randomInt = r.nextInt(100) + 1;
        for (Shape i : shapes){
            i.resize(randomInt);
        }

        System.out.println();
        System.out.println("After-resize");

        //After-resize
        for (Shape i : shapes){
            System.out.println(i);
        }
    }
}
