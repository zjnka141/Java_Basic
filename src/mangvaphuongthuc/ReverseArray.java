package mangvaphuongthuc;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
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
        int[] number = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("number[" + i + "]=");
            number[i] = sc.nextInt();
        }
        System.out.println("Initial Array: "+ Arrays.toString(number));
        for (int i = 0; i < size / 2; i++) {
            int temp = number[i];
            number[i] = number[size - i - 1];
            number[size - i - 1] = temp;
        }
        System.out.println("Array after reversing: "+ Arrays.toString(number));
    }
}
