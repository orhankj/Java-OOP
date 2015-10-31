package Shop;


import java.time.Period;

public class Computer extends ElectronicsProduct {

    public Computer(String name, double price, int quantity, AgeRestriction restriction) {
        super(name, price, quantity, restriction, Period.ofMonths(24));
    }

    private void reevalueatePrice(){
        if(this.getQuantity()>1000){
            this.setPrice(this.getPrice()-this.getPrice()*0.9);
        }
    }
}
