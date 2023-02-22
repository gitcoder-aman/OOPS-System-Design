package Classes.Solving_Design_FoodKart2.Model;

import java.util.ArrayList;
import java.util.List;

import Classes.Solving_Design_FoodKart2.Constants.enumGender;

public class UserModel {
    private int userId;
    private long phone;
    private String name;
    private long pincode;
    private enumGender gender;

    private List<RestaurantModel> listRestaurant = new ArrayList<>();
    private List<OrderModel>listOrder = new ArrayList<>();

    public UserModel(int userId,long phone, String name, long pincode, enumGender gender){
        this.userId = userId;
        this.phone = phone;
        this.name = name;
        this.pincode = pincode;
        this.gender = gender;
    }
    
    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public long getPhone() {
        return phone;
    }
    public void setPhone(long phone) {
        this.phone = phone;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public long getPincode() {
        return pincode;
    }
    public void setPincode(long pincode) {
        this.pincode = pincode;
    }
    public enumGender getGender() {
        return gender;
    }
    public void setGender(enumGender gender) {
        this.gender = gender;
    }
    public List<RestaurantModel> getListRestaurant() {
        return listRestaurant;
    }
    public void setListRestaurant(List<RestaurantModel> listRestaurant) {
        this.listRestaurant = listRestaurant;
    }
    public List<OrderModel> getListOrder() {
        return listOrder;
    }
    public void setListOrder(List<OrderModel> listOrder) {
        this.listOrder = listOrder;
    }

    
}
