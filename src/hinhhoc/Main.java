package hinhhoc;

public class Main {
    public static void main(String[] args) {
        Shape shape=new Shape("red",false);
        System.out.println(shape);
        Shape circle=new Circle(2.3f,"red",false);
        System.out.println(((Circle) circle).getRadius());
        System.out.println(circle);
    }
}
