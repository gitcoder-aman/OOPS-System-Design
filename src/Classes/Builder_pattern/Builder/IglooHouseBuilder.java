package Classes.Builder_pattern.Builder;

import Classes.Builder_pattern.Product.House;

/**
 * IglooHouseBuilder
 */
public class IglooHouseBuilder implements HouseBuilder {

    private House house;

    public IglooHouseBuilder(){
        this.house = new House();
    }
    
    @Override
    public void buildBasement(){
        house.setBasement("Ice Bars");
    }

    @Override
    public void buildStructure(){
        house.setStructure("Ice Blocks");
    }

    @Override
    public void buildRoof() {
      house.setRoof("Ice Dome");
        
    }

    @Override
    public void buildInterior() {
       house.setInterior("Ice carving");
    }

    @Override
    public House getHouse() {
        return this.house;
    }

}