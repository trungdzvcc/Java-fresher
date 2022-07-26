package Day6.Excercise.PointAndMoveablePoint;

public class Main {
    public static void main(String[] args){
        System.out.println("\t\t\t\tPoint  ");
        Point point = new Point(6,8);
        System.out.println(point);
        point.setXY(5, 6);
        float[] XY = point.getXY();
        for (float i : XY){
            System.out.println(i);
        }
        System.out.println("\t\t\t\t Moveable Point "); 
        MovabePoint movabePoint = new MovabePoint(2,9);
        System.out.println(movabePoint);

        movabePoint.setSpeed(6,7);
        float[] speed = movabePoint.getSpeed();
        for (float i : speed){
            System.out.println(i);
        }
        
       float[] speedMove = movabePoint.move();
       System.out.print("move :");
       for (float i : speedMove){
        System.out.print("["+i+"]");
    }
    }
    
}
