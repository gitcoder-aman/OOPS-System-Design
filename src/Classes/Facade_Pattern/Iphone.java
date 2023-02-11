package Classes.Facade_Pattern;

/**
 * Blackberry
 */
public class Iphone implements MobileShop{

    @Override
    public void modelNo() {
       System.out.println("IPhone 13 "); 
    }

    @Override
    public void price() {
        System.out.println(" RS: 136000.00 ");
    }

    
}