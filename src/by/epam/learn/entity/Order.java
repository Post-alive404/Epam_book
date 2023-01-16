package by.epam.learn.entity;

public class Order {

    private long orderId;
    static int bonus;
    public final int CURRENT_RANGE = (int)(Math.random()*42);
    //private final MutableType mutable = new MutableType();
    private double price;

    public Order(long orderId, double price){
        this.orderId = orderId;
        this.price = price;
    }
    public final static int PURCHASE_TAX = 5;
    public double calculatePrice(double price, int counter){
        double amount;
        amount = (price-bonus)*counter;
        double tax = amount*PURCHASE_TAX/100;
        return amount+tax;
    }

    public long getOrderId(){
        return orderId;
    }
}
