package ngonngulaptrinh;

import java.util.Arrays;
import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        String[] mapNumber = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelfth"};
        String run="y";
        while (run.equals("y")) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number (max 3 digits): ");
            String num = sc.nextLine();
            String[] arrayNumber = num.split("");
            String readNumber = "";
            if (arrayNumber.length == 1) {
                readNumber = mapNumber[Integer.parseInt(arrayNumber[0])];
            } else if (arrayNumber.length == 2) {
                readNumber=getNumberTwoDigits(arrayNumber,mapNumber);
            } else{
                readNumber=getNumberTwoDigits(Arrays.copyOfRange(arrayNumber,1,3),mapNumber);
                readNumber=mapNumber[Integer.parseInt(arrayNumber[0])]+" hundred and "+readNumber;
            }
            System.out.println(readNumber);
            System.out.println("Continue (y/n)?");
            run=sc.nextLine();
        }
    }
    public static String getNumberTwoDigits(String[] arrayNumber,String[] mapNumber){
        String readNumber="";
        if (arrayNumber[0].equals("1")) {
            if (Integer.parseInt(arrayNumber[1]) < 3) {
                readNumber = mapNumber[Integer.parseInt(arrayNumber[0] + arrayNumber[1])];
            } else {
                readNumber = (mapNumber[Integer.parseInt(arrayNumber[1])] + "teen")
                        .replace("five", "fif")
                        .replace("three", "thir");
            }
        }else{
            readNumber = (mapNumber[Integer.parseInt(arrayNumber[0])]
                    .replace("two","twen")
                    .replace("five", "fif")
                    .replace("three", "thir")+"ty-"+mapNumber[Integer.parseInt(arrayNumber[1])])
                    .replace("zero","");
        }
        return readNumber;
    }
}
