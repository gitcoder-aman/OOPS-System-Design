package Classes.Design_Pattern.Factory_Design_1;

public class InstituationPlan extends Plan {

    @Override
    void getRate() {
        this.rate = 5;
        System.out.println("Rate Updated to "+ this.rate);
    }
    
}
