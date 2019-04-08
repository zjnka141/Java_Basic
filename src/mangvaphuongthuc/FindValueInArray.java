package mangvaphuongthuc;

import java.util.Arrays;
import java.util.Scanner;

public class FindValueInArray {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        System.out.println("Enter search name: ");
        Scanner sc = new Scanner(System.in);
        String search = sc.nextLine();
        int index = Arrays.binarySearch(students, search);
        if (index < 0) {
            System.out.println("Not found!");
        } else {
            System.out.println("Index of search name in array is: "+index);
        }
    }

}
