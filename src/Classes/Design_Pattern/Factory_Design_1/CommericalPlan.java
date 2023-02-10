package Classes.Design_Pattern.Factory_Design_1;

public class CommericalPlan extends Plan {

    @Override
    void getRate() {
        this.rate = 4;
        System.out.println("Rate Updated to "+ this.rate);
    }
    
}
