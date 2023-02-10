package Classes.Design_Pattern.Factory_Design_1;

public class DemesticPlan extends Plan {

    @Override
    void getRate() {
        this.rate = 3;
        System.out.println("Rate Updated to "+ this.rate);
    }
    
}
