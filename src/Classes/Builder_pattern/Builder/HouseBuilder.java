package Classes.Builder_pattern.Builder;

import Classes.Builder_pattern.Product.House;

/**
 * HouseBuilder
 */
public interface HouseBuilder {

    public void buildBasement();
    public void buildStructure();
    public void buildRoof();
    public void buildInterior();

    public House getHouse();
    
}