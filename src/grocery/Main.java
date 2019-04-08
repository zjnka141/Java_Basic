package grocery;

import cake.Cake;
import cake.OrderCake;
import cake.ReadyMakeCake;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        SimpleDateFormat df= new SimpleDateFormat("dd-MM-yyyy");

        Customer tom = new Customer("Tom", "123 Pocal", "0123456789");
        Customer peter = new Customer("Peter", "423 WallStreet", "099099273");
        Date dateOfTom=null;
        Date dateOfPeter=null;
        try {
            dateOfTom = df.parse("23-6-2019");
            dateOfPeter = df.parse("08-11-2019");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        // Declare Tom's Bill
        GroceryBill billOfTom=new GroceryBill(tom,dateOfTom);
        Shoe shoe1=new Shoe("Nike",38,"winter",38,0.5,billOfTom);
        Shoe shoe2=new Shoe("Addidas",40,"summer",45,0.5,billOfTom);
        Cake cake1=new ReadyMakeCake("Custar",10,6,tom);
        Cake cake2=new OrderCake("Chocopie",10,0.1,tom);
        billOfTom.add(shoe1);
        billOfTom.add(shoe2);
        billOfTom.add(cake1);
        billOfTom.add(cake2);
        System.out.println(billOfTom.printReceipt());

        // Declare Petre's Bill
        GroceryBill billOfPeter=new GroceryBill(tom,dateOfPeter);
        Shoe shoe3=new Shoe("Rock",39,"winter",38,0.1,billOfPeter);
        Shoe shoe4=new Shoe("Flash",39,"summer",45,0.1,billOfPeter);
        Cake cake3=new ReadyMakeCake("Cokkie",10,2,peter);
        Cake cake4=new OrderCake("Plank",10,1.2,peter);
        billOfPeter.add(shoe3);
        billOfPeter.add(shoe4);
        billOfPeter.add(cake3);
        billOfPeter.add(cake4);
        System.out.println(billOfPeter.printReceipt());
    }

}
