package studentmanager;

import java.sql.SQLOutput;
import java.util.*;

public class StudentManager {
    private List<Student> studentList = new ArrayList<Student>();
    static int count = 0;
    public static Scanner scanner = new Scanner(System.in);

    public StudentManager() {
    }

    public StudentManager(List<Student> studentList) {
        this.studentList = studentList;
    }

    public String inputId() {
        System.out.print("Enter id: ");
        return scanner.nextLine();
    }

    public String inputName() {
        System.out.print("Enter name: ");
        return scanner.nextLine();
    }

    public int inputAge() {
        System.out.print("Enter age: ");
        while (true) {
            try {
                int age = Integer.parseInt(scanner.nextLine());
                if (age < 0 || age > 150) {
                    throw new NumberFormatException();
                }
                return age;
            } catch (NumberFormatException ex) {
                System.out.print("Invalid! Input age again: ");
            }
        }
    }

    public String inputAddress() {
        System.out.print("Enter address: ");
        return scanner.nextLine();
    }

    public float inputGpa() {
        System.out.print("Enter GPA: ");
        while (true) {
            try {
                float gpa = Float.parseFloat(scanner.nextLine());
                if (gpa < 0 || gpa > 10) {
                    throw new NumberFormatException();
                }
                return gpa;
            } catch (NumberFormatException ex) {
                System.out.print("Invalid! Input GPA again: ");
            }
        }
    }

    public void addStudent() {
        String id = this.inputId();
        String name = this.inputName();
        int age = this.inputAge();
        String address = this.inputAddress();
        float gpa = this.inputGpa();
        Student student = new Student(id, name, age, address, gpa);
        this.studentList.add(student);
        this.count++;
    }

    public void editStudent() {
        System.out.print("Enter id of student need to edit: ");
        String id = this.inputId();
        boolean isExisted = false;
        for (Student student : studentList) {
            if (student.getId().equals(id)) {
                isExisted = true;
                student.setName(inputName());
                student.setAge(inputAge());
                student.setAddress(inputAddress());
                student.setGpa(inputGpa());
                break;
            }
        }
        if (!isExisted) {
            System.out.println("ID is not existed in list");
        }
    }

    public void deleteStudent(){
        System.out.print("Enter id of student need to delete: ");
        String id= inputId();
        boolean isExisted=false;
        for(Student student:studentList){
            if(student.getId().equals(id)){
                isExisted=true;
                studentList.remove(student);
                break;
            }
        }
        if(!isExisted){
            System.out.print("ID is not existed in list");
        }
    }

    public void sortByName(){
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }

    public void sortByGpa(){
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getGpa()>o2.getGpa()){
                    return 1;
                }else if(o1.getGpa()<o2.getGpa()){
                    return -1;
                }else{
                    return 0;
                }
            }
        });
    }

    public void showStudent() {
        for (Student student : studentList) {
            System.out.printf("|%5s | ", student.getId());
            System.out.printf("%10s | ", student.getName());
            System.out.printf("%3d | ", student.getAge());
            System.out.printf("%20s | ", student.getAddress());
            System.out.printf("%4.2f |\n", student.getGpa());
        }
    }
}
