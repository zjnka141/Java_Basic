package cake;

import grocery.Customer;
import grocery.Item;

public class Cake extends Item {
    protected String name;
    protected double rate;
    public Cake() {
    }

    public Cake(String name, double rate) {
        this.name = name;
        this.rate = rate;
    }

    public double calcPrice() {
        return -1;
    }

    @Override
    public String toString() {
        return name + "\t" + rate;
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public double getDiscount() {
        return 0;
    }

    @Override
    public String getInfo() {
        return "Cake " + name + " has price $" + calcPrice() + " and discount " + getDiscount() + " -> Total price: $" + getPrice();
    }
}
