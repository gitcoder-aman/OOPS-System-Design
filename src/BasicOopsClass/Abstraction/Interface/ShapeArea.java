package BasicOopsClass.Abstraction.Interface;

public class ShapeArea implements area_interface{

    @Override
    public void square() {

        int side = 4;
        int areaofSquare = side*side;

        System.out.println(areaofSquare);
        
    }

    @Override
    public void circle() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void triangle() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void rectangle() {
        // TODO Auto-generated method stub
        
    }
    public static void main(String[] args) {
        ShapeArea obj = new ShapeArea();
        obj.square();
    }
    
}
