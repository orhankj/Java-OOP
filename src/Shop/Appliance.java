package Shop;

import java.time.Period;

public class Appliance extends ElectronicsProduct {

    public Appliance(String name, double price, int quantity, AgeRestriction restriction) {
        super(name, price, quantity, restriction, Period.ofMonths(6));
    }

    private void reevaluatePrice(){
        if(this.getQuantity()<50){
            this.setPrice(this.getPrice()-this.getPrice()*1.05);
        }

    }

    @Override
    public String toString() {
        return "Appliance{" +
                "name='" + this.getName() + '\'' +
                ", price=" + this.getPrice() +
                ", quantity=" + this.getQuantity() +
                ", restriction=" + this.getRestriction() +
                '}';
    }
}
