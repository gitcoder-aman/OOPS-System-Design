package Classes.Solving_Design_FoodKart2.Utils;

public class IdGenerator {
    private static int id = 0;

    public static int getId(){
        id++;
        return id;
    }
}
