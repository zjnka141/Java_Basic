package mangvaphuongthuc;

import java.util.Arrays;
import java.util.Scanner;

public class MaxInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        do {
            System.out.println("Enter the size of array: ");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("Size should not exceed 20");
            }
        } while (size > 20);
        int[] number=new int[size];
        for(int i=0;i<size;i++){
            System.out.print("number["+i+"]=");
            number[i]=sc.nextInt();
        }
        System.out.println("Array:"+Arrays.toString(number));
        Arrays.sort(number);
        System.out.println("Max is "+number[number.length-1]);


    }
}
