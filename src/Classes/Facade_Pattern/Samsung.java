package Classes.Facade_Pattern;

/**
 * Blackberry
 */
public class Samsung implements MobileShop{

    @Override
    public void modelNo() {
       System.out.println("Samsung glaxay Tab 3"); 
    }

    @Override
    public void price() {
        System.out.println(" RS: 45000.00 ");
    }

    
}