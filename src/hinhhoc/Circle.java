package hinhhoc;

public class Circle extends Shape {
    private float radius=1.0f;
    public Circle(){
    }
    public Circle(float radius){
        this.radius=radius;
    }
    public Circle(float radius,String color, boolean filled) {
        super(color,filled);
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    @Override
    public String toString(){
        return "This circle has radius "+this.radius+" and "+(isFilled()?"filled ":"not filled ")+"with color "+getColor();
    }
}
