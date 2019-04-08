package studentmanager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        int choose = 1;
        while (choose != 0) {
            System.out.println("\n/****************************************/\n" +
                    "1. Add student.\n" +
                    "2. Edit student by id.\n" +
                    "3. Delete student by id.\n" +
                    "4. Sort student by gpa.\n" +
                    "5. Sort student by name.\n" +
                    "6. Show student.\n" +
                    "0. Exit.\n" +
                    "/****************************************/\n");
            System.out.print("Choose: ");
            Scanner scanner = new Scanner(System.in);
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    manager.addStudent();
                    break;
                case 2:
                    manager.editStudent();
                    break;
                case 3:
                    manager.deleteStudent();
                    break;
                case 4:
                    manager.sortByGpa();
                    break;
                case 5:
                    manager.sortByName();
                    break;
                case 6:
                    System.out.printf("|%5s | ", "ID");
                    System.out.printf("%10s | ", "Name");
                    System.out.printf("%3s | ", "Age");
                    System.out.printf("%20s | ", "Address");
                    System.out.printf("%4s |\n", "GPA");
                    System.out.println("---------------------------------------------------------");
                    manager.showStudent();
                    break;
                default:
                    System.out.print("Choose invalid! Try again: ");
            }
        }
    }
}
