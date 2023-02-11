package Classes.Facade_Pattern;

/**
 * Blackberry
 */
public class Blackberry implements MobileShop{

    @Override
    public void modelNo() {
       System.out.println("BlackBerry Z10"); 
    }

    @Override
    public void price() {
        System.out.println(" RS: 55000.00 ");
    }

    
}