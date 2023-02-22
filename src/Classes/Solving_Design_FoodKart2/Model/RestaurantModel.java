package Classes.Solving_Design_FoodKart2.Model;

import java.util.ArrayList;
import java.util.List;

public class RestaurantModel {
    private int rastaurId;
    private String name;
    private String item;
    private int quantity;
    private int price;
    private List<Long>listPincode;
    private List<ReviewModel>listReview = new ArrayList<>();
    private float rating;
    
    private Integer createdBy;  // Restaurant owner id 
    
    public Integer getCreatedBy() {
        return createdBy;
    }
    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    
    public int getId() {
        return rastaurId;
    }
    public void setId(int rastaurId) {
        this.rastaurId = rastaurId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getItem() {
        return item;
    }
    public void setItem(String item) {
        this.item = item;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public List<Long> getListPincode() {
        return listPincode;
    }
    public void setListPincode(List<Long> listPincode) {
        this.listPincode = listPincode;
    }
    public List<ReviewModel> getListReview() {
        return listReview;
    }
    public void setListReview(List<ReviewModel> listReview) {
        this.listReview = listReview;
    }
    public float getRating() {
        return rating;
    }
    public void setRating(float rating) {
        this.rating = rating;
    }

    
}
