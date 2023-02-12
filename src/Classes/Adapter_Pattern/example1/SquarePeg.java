package Classes.Adapter_Pattern.example1;

/**
 * SquarePeg
 */
//Adaptee
public class SquarePeg {

    public double width;

    public SquarePeg(int width){
        this.width = width;
    }
    public double getWidth(){
        return this.width;
    }
}