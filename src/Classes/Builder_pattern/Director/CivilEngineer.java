package Classes.Builder_pattern.Director;

import Classes.Builder_pattern.Builder.HouseBuilder;
import Classes.Builder_pattern.Product.House;

public class CivilEngineer {
    
    private HouseBuilder houseBuilder;

    public CivilEngineer(HouseBuilder houseBuilder){
        this.houseBuilder = houseBuilder;
    }

    public House getHouse(){
        return this.houseBuilder.getHouse();
    }

    public void constructHouse(){
        this.houseBuilder.buildBasement();
        this.houseBuilder.buildStructure();
        this.houseBuilder.buildInterior();
        this.houseBuilder.buildRoof();
    }
}
