package cake;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cake[] cakes=new Cake[5];
        cakes[0]=new OrderCake("Choco",2.3,1.2);
        cakes[1]=new ReadyMakeCake("BigEgg",0.5,3);
        cakes[2]=new OrderCake("Solite",1.8,3.4);
        cakes[3]=new OrderCake("Custar",2.5,0.4);
        cakes[4]=new ReadyMakeCake("SmallEgg",1,1);
        double total=0;
        double totalReadyCake=0;
        int quantityReadyCake=0;
        Cake highestPriceCake=cakes[0];
        for (Cake cake : cakes){
            total+=cake.calcPrice();
            if(cake instanceof ReadyMakeCake){
                quantityReadyCake++;
                totalReadyCake+=cake.calcPrice();
            }
            if(cake.calcPrice()>highestPriceCake.calcPrice()){
                highestPriceCake=cake;
            }
        }
        System.out.printf("\nTotal price: $%.2f",total);
        System.out.printf("\nTotal price of ReadyMakeCake: $%.2f |",totalReadyCake);
        System.out.printf(" Quantity of ReadyMakeCake: "+quantityReadyCake);
        System.out.println("\nThe cake has the highest price is: "+highestPriceCake);
    }
}
