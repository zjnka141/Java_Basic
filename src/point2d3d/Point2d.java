package point2d3d;

public class Point2d {
    private float x;
    private float y;

    public Point2d() {
    }

    public Point2d(float x, float y) {
        this.x = x;
        this.y = y;
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

    public void setXY(float x,float y){
        this.x=x;
        this.y=y;
    }

    public float[] getXY(){
        float[] result={this.x,this.y};
        return result;
    }

    @Override
    public String toString(){
        return "("+this.x+","+this.y+")";
    }
}
