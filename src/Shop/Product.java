package Shop;


import Interfaces.Buyable;

public abstract class Product implements Buyable,Comparable {
    private String name;
    private double price;
    private int quantity;
   private AgeRestriction restriction;

    public Product(String name, double price, int quantity, AgeRestriction restriction) throws ArithmeticException{
        if(price<0){
            throw new ArithmeticException("Price cannot be negative!");
        }
        if(quantity<0){
            throw new ArithmeticException("Quantity cannot be negative!");
        }
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.restriction = restriction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price)  throws ArithmeticException{
        if(price<0){
            throw new ArithmeticException("Price cannot be negative!");
        }
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) throws ArithmeticException{
        if(quantity<0){
            throw new ArithmeticException("Quantity cannot be negative!");
        }
        this.quantity = quantity;
    }

    public AgeRestriction getRestriction() {
        return restriction;
    }

    public void setRestriction(AgeRestriction restriction) {
        this.restriction = restriction;
    }

    public int compareTo(Product product,AgeRestriction restriction) {
     return 0;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", restriction=" + restriction +
                '}';
    }
}
