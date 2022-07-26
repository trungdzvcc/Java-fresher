package Day6.Excercise.Point;

public class Main {
    public static void main(String[] args){
        // Point2D
        System.out.println("\t\t\t\tPoint 2D ");
        Point2D point2d = new Point2D(6,8);
        System.out.println(point2d);
        point2d.setXY(5, 6);
        float[] XY = point2d.getXY();
        for (float i : XY){
            System.out.println(i);
        }

        System.out.println("\t\t\t\tPoint 3D ");
        Point3D point3d = new Point3D(6,8,7);
        System.out.println(point3d);
        point3d.setZYZ(5, 6,7);
        float[] XYZ = point3d.getXYZ();
        for (float i : XYZ){
            System.out.println(i);
        }
    }
}
