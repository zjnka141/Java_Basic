package grocery;

public class Shoe extends Item {
    private String name;
    private int size;
    private String type;
    private double price;
    private double discount;
    private GroceryBill bill;

    public Shoe() {
    }

    public Shoe(String name, int size, String type, double price, double discount, GroceryBill bill) {
        this.name = name;
        this.size = size;
        this.type = type;
        this.price = price;
        this.discount = discount;
        this.bill = bill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public double getPrice() {
        return price * (1 - getDiscount());
    }

    @Override
    public double getDiscount() {
        if (type.equalsIgnoreCase("summer") &&
                ((bill.getDateOfOrder().getMonth() + 1) >= 10 && (bill.getDateOfOrder().getMonth() + 1) <= 12 || (bill.getDateOfOrder().getMonth() + 1) == 1)) {
            return discount;
        } else if (type.equalsIgnoreCase("winter") &&
                ((bill.getDateOfOrder().getMonth() + 1) >= 5 && (bill.getDateOfOrder().getMonth() + 1) <= 8)){
            return discount;
        }
        else{
            return 0;
        }
    }

    @Override
    public String getInfo() {
        return name + " has price $" + price + " and discount " + getDiscount() + ". -> Total Price: $" + getPrice();
    }
}
