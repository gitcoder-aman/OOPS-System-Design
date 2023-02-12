package Classes.Adapter_Pattern.example1;

//Adapter class 
public class SquarePegAdapter extends RoundPeg {
    
    private SquarePeg squarePeg;

    public SquarePegAdapter(){
        super();
    }
    public SquarePegAdapter(SquarePeg s){
        this.squarePeg = s;
    }
    @Override
    public double getRadius(){
        return squarePeg.getWidth() * Math.sqrt(2)/2;    //formula of square radius
    }
}
