package Shop;

import Interfaces.Expireable;

import java.util.Calendar;
import java.util.Date;

public class FoodProduct extends Product implements Expireable,Comparable{
    private Date expiration;

    public FoodProduct(String name, double price, int quantity, AgeRestriction restriction, Date expiration) {
        super(name, price, quantity, restriction);
        this.expiration=expiration;
    }

    private void checkExpiration(){
       //
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE,-15);
        Date period = cal.getTime();
        if(this.expiration.after(period)){
            this.setPrice(this.getPrice()-this.getPrice()*0.7);
        }
    }



    @Override
    public Date getExpirationDate() {
        return this.expiration;
    }

    @Override
    public int compareTo(Object o) {
        FoodProduct product = (FoodProduct)o;
        if(this.expiration.after(product.getExpirationDate())){
            return 1;
        }else if(this.expiration.before(product.getExpirationDate())){
            return -1;
        }else {
            return 0;
        }
    }


    public int compareTo(Product product,AgeRestriction restriction) throws IllegalArgumentException{

        if(product.getPrice()>this.getPrice()){
            return -1;
        }else  if(product.getPrice()<this.getPrice()) {
            return 1;
        }else return 0;
        }





    @Override
    public String toString() {
        return "FoodProduct{" +
                "name='" + this.getName() + '\'' +
                ", price=" + this.getPrice() +
                ", quantity=" + this.getPrice() +
                ", restriction=" + this.getRestriction() +
                ", expiration date=" + this.getExpirationDate() +
                '}';
    }
}
