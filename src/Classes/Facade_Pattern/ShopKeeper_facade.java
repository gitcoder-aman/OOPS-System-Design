package Classes.Facade_Pattern;

public class ShopKeeper_facade {
    
    private MobileShop iphone;
    private MobileShop samsung;
    private MobileShop blackberry;

    public ShopKeeper_facade(){
        iphone = new Iphone();
        samsung = new Samsung();
        blackberry = new Blackberry();
    }
    public void iphoneSale(){
        iphone.modelNo();
        iphone.price();
    }
    public void samsungSale(){
        samsung.modelNo();
        samsung.price();
    }
    public void blackberrySale(){
        blackberry.modelNo();
        blackberry.price();
    }
}

