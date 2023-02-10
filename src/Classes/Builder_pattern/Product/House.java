package Classes.Builder_pattern.Product;

public class House {
    
    private String basement;
    private String structure;
    private String interior;
    private String roof;

    
    public void setStructure(String structure) {
        this.structure = structure;
    }
    public void setRoof(String roof) {
        this.roof = roof;
    }

    public void setInterior(String interior) {
        this.interior = interior;
    }

    public void setBasement(String basement){
        this.basement = basement;
    }
    

}
