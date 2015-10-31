package Shop;


import java.time.DateTimeException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Store {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        FoodProduct cigars = new FoodProduct("420 Blaze it fgt", 6.90, 1400, AgeRestriction.Adult,new Date(2000,4,12));
        try{

            Customer pecata = new Customer("Pecata", 27, 44);
            PurchaseManager.processPurchase( cigars,pecata);

            products.add(cigars);
        }catch (IllegalAccessError e){
            System.out.println(e.getMessage());
        }
        catch (DateTimeException time){
            System.out.println(time.getMessage());
        }catch (ArithmeticException badMath){
            System.out.println(badMath.getMessage());
        }

        try{
            Customer gopeto = new Customer("Gopeto", 18, 0.44);
            PurchaseManager.processPurchase( cigars,gopeto);
        }catch (IllegalAccessError e){
            System.out.println(e.getMessage());
        }
        catch (DateTimeException time){
            System.out.println(time.getMessage());
        }catch (ArithmeticException badMath){
            System.out.println(badMath.getMessage());
        }


        FoodProduct voda = new FoodProduct("voda",1,33,AgeRestriction.None,new Date(2090,1,12));
        Computer pc = new Computer("Samsung",1000,10,AgeRestriction.None);
        ElectronicsProduct gun = new Appliance("Gun",1000,10,AgeRestriction.Adult);
        FoodProduct duner = new FoodProduct("Duner",1.50,100,AgeRestriction.None,new Date(2015,11,12));
        FoodProduct banichka = new FoodProduct("Banica",1.2,15,AgeRestriction.None,new Date(2015,11,1));
        FoodProduct whiskey = new FoodProduct("John Walker", 30.90, 1400, AgeRestriction.Adult,new Date(2090,4,12));
        FoodProduct vodka = new FoodProduct("Flirt", 4.90, 11, AgeRestriction.Adult,new Date(2090,4,12));
        FoodProduct vodka2 = new FoodProduct("Sobieski", 12, 33, AgeRestriction.Adult,new Date(2090,4,12));
        products.add(gun);
        products.add(vodka);
        products.add(vodka2);
        products.add(voda);
        products.add(pc);
        products.add(duner);
        products.add(banichka);
        products.add(cigars);
        products.add(whiskey);
        System.out.println( "______________________________________________________________________");
        System.out.println("Food Product with soonest expiration date:");
        try {


            products.stream()
                    .filter(x -> x instanceof FoodProduct)
                    .map(x -> (FoodProduct) x)
                    .sorted((a, b) -> a.compareTo(b))
                    .limit(1)
                    .forEach(System.out::println);
            System.out.println( "______________________________________________________________________");
            System.out.println(" Products with adult age restriction oreder by price:");
            products.stream()
                    .filter(x -> x.getRestriction() == AgeRestriction.Adult)
                    .sorted((a, b) -> a.compareTo(b, AgeRestriction.Adult))
                    .forEach(System.out::println);

        }catch (IllegalArgumentException argument){
            System.out.println(argument.getMessage());
        }

    }
}
