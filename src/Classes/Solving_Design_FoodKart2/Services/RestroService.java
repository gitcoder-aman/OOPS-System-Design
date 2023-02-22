package Classes.Solving_Design_FoodKart2.Services;

import java.util.List;

import Classes.Solving_Design_FoodKart2.Data.UserDao;
import Classes.Solving_Design_FoodKart2.Model.RestaurantModel;
import Classes.Solving_Design_FoodKart2.Model.ReviewModel;

public class RestroService {
    public static RestroService instance = null;

    private RestroService() {
    }

    public static RestroService getInstance() {
        if (instance == null) {
            instance = new RestroService();
        }
        return instance;
    }

    UserDao userDao = UserDao.getInstance();

    public RestaurantModel registerRestaurant(String name, String pincodes, String item, int price, int quantity) {
        if (price <= 0 || quantity < 0) {
            System.out.println("Invaid value for mandatory fields.");

            //TODO:remove all null returns with Exception

            return null; // Bad pratice send the null data , just thorws exception
        } else if (name.isEmpty()) {
            System.out.println("Invalid value for name");
            return null;
        }
        return userDao.registerRestaurant(name, pincodes, item, price, quantity);
    }
    public ReviewModel rateRestaurant(String name, Integer rating, String comment){
        if(rating == null || rating > 5 || rating <=0){
            System.out.println("Invalid values for mandatory fields");
            return null;
        }
        return userDao.rateRestaurant(name,rating,comment);
    }

    public RestaurantModel updateQuantity(String name,int quantity){
        if(quantity <= 0){
            System.out.println("Invalid value for mandatory fields");
            return null;
        }
        return userDao.updateQuantity(name,quantity);
    }
    public List<RestaurantModel>showRestaurant(String sortBy){
        
        // if(sortBy.equals("price") || sortBy.equals("rating")){
            
        // }else{
        //     System.out.println("your wrong parameter for sorting");
        // }
        return userDao.showRestaurant(sortBy);
    }

}
