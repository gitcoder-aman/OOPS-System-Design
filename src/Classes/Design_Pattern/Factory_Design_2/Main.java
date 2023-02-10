package Classes.Design_Pattern.Factory_Design_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        shapeFactory shapeFactory = new shapeFactory();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the shape in (CIRCLE,RECTANGLE,SQUARE)");
        String shapeName = sc.nextLine();
        Shape shape = shapeFactory.getShape(shapeName);

        shape.draw();

    }
}
