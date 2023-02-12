package Classes.Adapter_Pattern.example1;

public class Main {
    public static void main(String[] args) {
        
        //first
        RoundHole hole = new RoundHole(5);
        RoundPeg peg = new RoundPeg(5);

        System.out.println("Answer is : "+ hole.fits(peg));

        SquarePeg small_sqpeg = new SquarePeg(5);
        SquarePeg large_sqpeg = new SquarePeg(10);
        //Get error because impactable type  
        // hole.fits(small_sqpeg);

        //Client
        //converting to SquarePeg to RoundPeg using Adapter  (upcasting)
        RoundPeg small_sqPageAdapter = new SquarePegAdapter(small_sqpeg);
        RoundPeg large_sqPageAdapter = new SquarePegAdapter(large_sqpeg);

        System.out.println("Second Answer is : "+ hole.fits(small_sqPageAdapter));
        System.out.println("Third Answer is : "+ hole.fits(large_sqPageAdapter));

    }
}
