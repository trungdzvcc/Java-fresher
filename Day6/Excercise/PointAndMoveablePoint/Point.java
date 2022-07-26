package Day6.Excercise.PointAndMoveablePoint;

public class Point {
    private float x = 0;
    private float y = 0;
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public Point() {
    }
    public float getX() {
        return x;
    }
    public void setX(float x) {
        this.x = x;
    }
    public float getY() {
        return y;
    }
    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float[] getXY(){
        float[] XY = new float[2];
        XY[0]=x;
        XY[1]=y;
        return XY;
    }
    @Override
    public String toString() {
        return "x=" + x + ", y=" + y ;
    }
}
