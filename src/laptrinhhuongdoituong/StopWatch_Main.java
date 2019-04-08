package laptrinhhuongdoituong;

import java.util.Scanner;

public class StopWatch_Main {
    public static void main(String[] args) {
        StopWatch watch=new StopWatch();
        System.out.print("Enter anything to Start: ");
        Scanner sc= new Scanner(System.in);
        String choose=sc.nextLine();
        watch.start();
        System.out.print("Enter anything to Stop: ");
        choose=sc.nextLine();
        watch.end();
        System.out.println("Run time is "+watch.getElapsedTime()+" miliseconds");
    }


}
