package ngonngulaptrinh;

import java.util.Scanner;

public class SuDungToanTu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float height,width;
        System.out.print("Enter the height: ");
        height=sc.nextFloat();
        System.out.print("Enter the width: ");
        width=sc.nextFloat();
        float area=width*height;
        System.out.println("Area: "+area);
    }
}
