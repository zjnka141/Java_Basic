package laptrinhhuongdoituong;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle>{
    @Override
    public int compare(Circle o1, Circle o2) {
        if(o1.getRadius()>o2.getRadius()){
            return 1;
        }else if (o1.getRadius()<o2.getRadius()){
            return -1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Circle c1=new Circle(8);
        Circle c2=new Circle(8);
        CircleComparator circleComparator=new CircleComparator();
        if(circleComparator.compare(c1,c2)==1){
            System.out.println("Circle c1 lon hon c2");
        }else if(circleComparator.compare(c1,c2)==-1){
            System.out.println("Circle c2 lon hon c1");
        }else{
            System.out.println("Circle c1 bang c2");
        }
    }


}
class Circle  {
    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }
}