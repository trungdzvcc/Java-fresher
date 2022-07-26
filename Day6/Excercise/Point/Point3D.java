package Day6.Excercise.Point;

public class Point3D extends Point2D {
    private float z =0;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setZYZ(float x, float y, float z) {
        setXY(x, y);
        this.z = z;
        
    }
    public float[] getXYZ() {
        float[] XYZ = new float[3];
        XYZ[0] = this.getX();
        XYZ[1] = this.getY();
        XYZ[2] = this.getZ();
        return XYZ;
    }

    @Override
    public String toString() {
        return "Point3D [x = " + getX() + "]" + " y= " + getY() + "]" +" z= " + getZ() + "]";
    }
    
    
    
}
