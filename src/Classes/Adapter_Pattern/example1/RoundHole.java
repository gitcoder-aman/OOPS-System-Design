package Classes.Adapter_Pattern.example1;

public class RoundHole {
    public double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public boolean fits(RoundPeg peg){
        return this.getRadius() >= peg.getRadius();
    }
    
}
