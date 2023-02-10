package BasicOopsClass.Encapsulation;

public class Capsule {
    private int type;
    private int HowMany;

    
    // public Capsule(int type, int howMany) {
    //     this.type = type;
    //     HowMany = howMany;
    // }
    public int getType() {
        return type;
    }
    public void setType(int type) {
        this.type = type;
    }
    public int getHowMany() {
        return HowMany;
    }
    public void setHowMany(int howMany) {
        HowMany = howMany;
    }
}
