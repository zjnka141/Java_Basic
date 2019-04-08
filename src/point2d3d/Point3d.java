package point2d3d;

public class Point3d extends Point2d{
    private float z;

    public Point3d() {
    }

    public Point3d(float z) {
        this.z = z;
    }

    public Point3d(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x,float y,float z){
        super.setX(x);
        super.setY(y);
        this.z=z;
    }

    public float[] getXYZ(){
        float[] result={super.getX(),super.getY(),this.z};
        return result;
    }

    @Override
    public String toString(){
        return "("+super.getX()+","+super.getY()+","+this.z+")";
    }
}
