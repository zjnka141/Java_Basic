package grocery;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GroceryBill {
    private Customer customer;
    private Date dateOfOrder;
    List<Item> listItem=new ArrayList<Item>();
    public GroceryBill() {
    }

    public GroceryBill(Customer customer, Date dateOfOrder) {
        this.customer = customer;
        this.dateOfOrder = dateOfOrder;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Date getDateOfOrder() {
        return dateOfOrder;
    }

    public void setDateOfOrder(Date dateOfOrder) {
        this.dateOfOrder = dateOfOrder;
    }

    public void add(Item item){
        listItem.add(item);
    }

    public double getTotal(){
        double total=0;
        for( Item item:listItem){
            total+=item.getPrice();
        }
        return total;
    }
    public String printReceipt(){
        String receipt="";
        for(Item item:listItem){
            receipt+="\n"+item.getInfo();
        }
        return receipt;
    }
}
