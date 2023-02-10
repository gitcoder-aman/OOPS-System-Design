package Classes.Builder_pattern.Builder;

import Classes.Builder_pattern.Product.House;

public class TreeHouseBuilder implements HouseBuilder {
    private House house;

    @Override
    public void buildBasement() {
        house.setBasement("Wooden Poles");
    }

    @Override
    public void buildStructure() {
        house.setStructure("Wood and Ice");
    }

    @Override
    public void buildRoof() {
        house.setRoof("wood,caribou and seal skins");
    }

    @Override
    public void buildInterior() {
        house.setInterior("Fire Wood");
    }

    @Override
    public House getHouse() {
        return this.house;
    }
    
}
