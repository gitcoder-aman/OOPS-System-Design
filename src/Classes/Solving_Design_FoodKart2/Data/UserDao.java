package Classes.Solving_Design_FoodKart2.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

import Classes.Solving_Design_FoodKart2.Constants.enumGender;
import Classes.Solving_Design_FoodKart2.Model.OrderModel;
import Classes.Solving_Design_FoodKart2.Model.RestaurantModel;
import Classes.Solving_Design_FoodKart2.Model.ReviewModel;
import Classes.Solving_Design_FoodKart2.Model.UserModel;
import Classes.Solving_Design_FoodKart2.Utils.IdGenerator;

public class UserDao {
    public static UserDao instance = null;

    private UserDao() {
    }

    public static UserDao getInstance() {
        if (instance == null) {
            instance = new UserDao();
        }
        return instance;
    }

    private HashMap<Integer, UserModel> userHashMap = new HashMap<>();
    private HashMap<Long, Integer> phoneNumberMap = new HashMap<>();
    private HashMap<String, RestaurantModel> restaurantNameMap = new HashMap<>();

    private UserModel loggedInUser = null; // Keeping logeed In user ,Initially no user is there logging.

    public UserModel registerUser(Long phone, String name, Long pincode, enumGender gender) {
        if (phoneNumberMap.containsKey(phone)) {
            UserModel userModel = userHashMap.get(phoneNumberMap.get(phone));
            System.out.println(
                    "User already exists with phone number " + phone + "with user id: " + userModel.getUserId());
            return userModel;
        }

        // if a new user
        UserModel userModel = new UserModel(IdGenerator.getId(), phone, name, pincode, gender);
        phoneNumberMap.put(phone, userModel.getUserId());
        userHashMap.put(userModel.getUserId(), userModel);
        System.out.println("Successfully create user with user ID : " + userModel.getUserId());

        return userModel;
    }

    public UserModel login(Long phone) {
        if (!phoneNumberMap.containsKey(phone)) {
            System.out.println("No User exist with phone " + phone);
            return null;

            // TODO: Exception throws with the message
        }
        // if the user registred the user
        System.out.println(phoneNumberMap.get(phone));
        UserModel userModel = userHashMap.get(phoneNumberMap.get(phone));

        loggedInUser = userModel;
        System.out.println("Successfully logged in user with user id : " + userModel.getUserId());

        return userModel;
    }

    public RestaurantModel registerRestaurant(String rastauName, String pincodes, String item, int price,
            int quantity) {
        if (loggedInUser == null) {
            System.out.println("No logged In user found,request cann't be served");
            return null;
        }
        if (restaurantNameMap.containsKey(rastauName)) {
            System.out.println("Restaurant already exist with given name, please give unique name");
            return null;
        }
        List<String> pincodeList = Arrays.asList(pincodes.split(","));

        List<Long> pins = new ArrayList<>();
        if (!pincodeList.isEmpty()) {

            for (String s : pincodeList) {
                if (!s.chars().allMatch(Character::isDigit)) {
                    System.out.println("Invalid pincode provided.");
                    return null;
                }
                pins.add(Long.parseLong(s));
            }
        }

        // TODO: check the feasibility of Builder pattern here
        RestaurantModel restaurantModel = new RestaurantModel();
        restaurantModel.setId(IdGenerator.getId());
        restaurantModel.setName(rastauName);
        restaurantModel.setItem(item);
        restaurantModel.setQuantity(quantity);
        restaurantModel.setPrice(price);
        restaurantModel.setListPincode(pins);
        restaurantModel.setCreatedBy(loggedInUser.getUserId());

        // put restaurant data in restaurantMap // Restrau Map update kar diya
        restaurantNameMap.put(rastauName, restaurantModel);
        // update the loggedInUser of ListRestaurant
        loggedInUser.getListRestaurant().add(restaurantModel);

        System.out.println("Successfully registered restaurant id " + restaurantModel.getId());

        return restaurantModel;
    }
    // TODO: please correct the variable names with intitutive one

    public ReviewModel rateRestaurant(String rastauName, Integer rating, String comment) {
        RestaurantModel restaurantModel = restaurantNameMap.get(rastauName);
        if (restaurantModel == null) {
            System.out.println("No Restaurant found with the given name ");
            return null;
        }

        ReviewModel reviewModel = new ReviewModel();
        reviewModel.setId(IdGenerator.getId());
        reviewModel.setComment(comment);
        reviewModel.setScore(rating);

        // if first review
        if (restaurantModel.getListReview() == null || restaurantModel.getListReview().size() == 0) {
            restaurantModel.setRating(Float.valueOf(rating));
        } else {
            // update overall rating just a average calculate
            float currentScore = (restaurantModel.getRating() * restaurantModel.getListReview().size() + rating)
                    / restaurantModel.getListReview().size() + 1;
            restaurantModel.setRating(currentScore);
        }
        restaurantModel.getListReview().add(reviewModel);
        return reviewModel;
    }

    public RestaurantModel updateQuantity(String name, int quantity) {
        RestaurantModel restaurantModel = restaurantNameMap.get(name);
        if (restaurantModel == null) {
            System.out.println("No restaurant found with given name " + name);
            return null;
        }
        restaurantModel.setQuantity(restaurantModel.getQuantity() + quantity);
        System.out.println("Quantity have been updated ");
        return restaurantModel;
    }

    public List<RestaurantModel> showRestaurant(String sortBy) {

        List<RestaurantModel> r = loggedInUser.getListRestaurant();
        List<RestaurantModel> newRestaurant = new ArrayList<>();

        for (RestaurantModel restaurantModel : r) {
            if (restaurantModel.getListPincode().contains(loggedInUser.getPincode())
                    && restaurantModel.getQuantity() > 0) {
                newRestaurant.add(restaurantModel);
            }
        }
        if (sortBy.equalsIgnoreCase("rating")) {
            Collections.sort(newRestaurant, new SortByRating());

            // just print the all data
            for (RestaurantModel restaurantModel : newRestaurant) {
                System.out.println("Restaurant id:-> " + restaurantModel.getId() + " name-> "
                        + restaurantModel.getName() +
                        " price-> " + restaurantModel.getPrice() + " rating: -> " + restaurantModel.getRating());
            }
            return newRestaurant;
        }

        // by default price
        Collections.sort(newRestaurant, new SortByPrice());
        // just print the all data
        for (RestaurantModel restaurantModel : newRestaurant) {
            System.out.println("Restaurant id:-> " + restaurantModel.getId() + " name-> " + restaurantModel.getName() +
                    " price-> " + restaurantModel.getPrice() + " rating: -> " + restaurantModel.getRating());
        }
        return newRestaurant;

    }

    public OrderModel placeOrder(String name, Integer quantity) {
        RestaurantModel restaurantModel = restaurantNameMap.get(name);
        if (restaurantModel == null) {
            System.out.println("No restaurant found with given name : " + name);
            return null;
        }
        if (restaurantModel.getQuantity() == 0) {
            System.out.println("Restaurant is out of stock! please try later.");
            return null;
        }
        if (restaurantModel.getQuantity() < quantity) {
            System.out.println("Restaurant has only " + restaurantModel.getQuantity() + " ");
            return null;
        }
        OrderModel orderModel = new OrderModel();
        orderModel.setOrderId(IdGenerator.getId());
        orderModel.setItemName(restaurantModel.getItem());
        orderModel.setQuantity(quantity);
        orderModel.setUserId(loggedInUser.getUserId());
        orderModel.setPrice(quantity * restaurantModel.getPrice());

        // update quantitiy
        restaurantModel.setQuantity(restaurantModel.getQuantity() - quantity);
        // add to user order history
        loggedInUser.getListOrder().add(orderModel);
        return orderModel;
    }

    public List<OrderModel> listOrder() {
        for (OrderModel orderModel : loggedInUser.getListOrder()) {
            System.out.println("Order id: " + orderModel.getOrderId() + " item : " + orderModel.getItemName()
                    + " Quantity : " + orderModel.getQuantity() + " price: " + orderModel.getPrice());

        }
        return loggedInUser.getListOrder();
    }

    class SortByRating implements Comparator<RestaurantModel> {

        @Override
        public int compare(RestaurantModel o1, RestaurantModel o2) {

            if (o1.getRating() == 0.0 || o2.getRating() == 0.0)
                return 0;
            if (o1.getRating() > o2.getRating()) {
                return 1;
            } else if (o1.getRating() == o2.getRating()) {
                return 0;
            } else {
                return -1;
            }
        }
    }

    class SortByPrice implements Comparator<RestaurantModel> {

        @Override
        public int compare(RestaurantModel o1, RestaurantModel o2) {
            return o1.getPrice() - o2.getPrice();
        }
    }
}
