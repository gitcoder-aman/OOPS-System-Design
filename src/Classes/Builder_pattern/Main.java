package Classes.Builder_pattern;

import Classes.Builder_pattern.Builder.HouseBuilder;
import Classes.Builder_pattern.Builder.IglooHouseBuilder;
import Classes.Builder_pattern.Director.CivilEngineer;
import Classes.Builder_pattern.Product.House;

public class Main {
    public static void main(String[] args) {
        //We want to build House Type igloo
    HouseBuilder iglooBuilder = new IglooHouseBuilder();

    //tell that to our Director i.e Civil Engineer
    CivilEngineer engineer = new CivilEngineer(iglooBuilder);

    //engineer starts constructing house
    engineer.constructHouse();

    House house = engineer.getHouse();

    //print the house
    System.out.println("Builder Constructed: "+ house);
    }
}
