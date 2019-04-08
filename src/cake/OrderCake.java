package cake;

import grocery.Customer;

public class OrderCake extends Cake {
    protected double weight;
    private Customer customer;
    public OrderCake(String name, double rate, double weight) {
        super(name, rate);
        this.weight=weight;
    }
    public OrderCake(String name, double rate, double weight,Customer customer) {
        super(name, rate);
        this.weight=weight;
        this.customer=customer;
    }
    @Override
    public double calcPrice(){
        return rate*weight;
    }
    @Override
    public String toString(){
        return name + "\trate: " + rate+"\tweight: "+weight+"\t\tprice: "+calcPrice();
    }
    @Override
    public double getPrice(){
        return calcPrice()*(1-getDiscount());
    }
    @Override
    public  double getDiscount(){
        if(weight>1){
            if(customer.getName().equalsIgnoreCase("tom")){
                return 0.5;
            }else {
                return 0.2;
            }
        }else{
            return 0;
        }
    }
}
