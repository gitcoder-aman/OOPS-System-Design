package BasicOopsClass.Abstraction;

public abstract class Shape {

    String color;

    public Shape(){
        this.color = "BLUE";
        System.out.println("Inside shape constructor");
    }
    public abstract int area();
}

class Square extends Shape{

    int side;

    public Square(){
        super();
        System.out.println("Inside the constructor");
        side = 4;
    }
    @Override
    public int area() {
       
        return side*side;
    }

}
