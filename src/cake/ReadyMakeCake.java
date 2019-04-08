package cake;

import grocery.Customer;

public class ReadyMakeCake extends Cake{
    protected int quatityEggs;
    private Customer customer;
    public ReadyMakeCake(String name, double rate, int quatityEggs) {
        super(name, rate);
        this.quatityEggs=quatityEggs;
    }
    public ReadyMakeCake(String name, double rate, int quatityEggs, Customer customer) {
        super(name, rate);
        this.quatityEggs=quatityEggs;
        this.customer=customer;
    }
    @Override
    public double calcPrice(){
        return rate*quatityEggs;
    }
    @Override
    public String toString(){
        return name + "\trate: " + rate+"\tquantityEggs: "+quatityEggs+"\t\tprice: "+calcPrice();
    }

    @Override
    public double getPrice() {
        return calcPrice()*(1-getDiscount());
    }

    @Override
    public double getDiscount() {
        if (quatityEggs > 5) {
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
