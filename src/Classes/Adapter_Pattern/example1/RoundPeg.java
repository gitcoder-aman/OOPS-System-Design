package Classes.Adapter_Pattern.example1;

//Adaptee
public class RoundPeg {
    public double radius;

    public RoundPeg(){

    }
    public RoundPeg(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return this.radius;
    }
}

