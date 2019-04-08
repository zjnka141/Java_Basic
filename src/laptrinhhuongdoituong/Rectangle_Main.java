package laptrinhhuongdoituong;

import java.util.Scanner;

public class Rectangle_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter width: ");
        float width = sc.nextFloat();
        System.out.print("Enter height: ");
        float height = sc.nextFloat();
        Rectangle rec = new Rectangle(width, height);
        System.out.println("Area: " + rec.getArea());
        System.out.println("Perimeter: " + rec.getPerimeter());
    }
}
