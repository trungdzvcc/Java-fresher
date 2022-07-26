package Day6.Excercise.PointAndMoveablePoint;

public class MovabePoint extends Point{
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;
    public MovabePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovabePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovabePoint() {
    }
    public float getxSpeed() {
        return xSpeed;
    }
    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }
    public float getySpeed() {
        return ySpeed;
    }
    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed , float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed() {
        float[] Speed = new float[2];
        Speed[0]=xSpeed;
        Speed[1]=ySpeed;
        return Speed;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString()+" Speed = " + "[" + xSpeed + ","+ySpeed + "]";
    }
    public float[] move(){
        this.setX(getX()+xSpeed);
        this.setY(getY()+ySpeed);
        return this.getXY() ;
    }
    
    

    
}
