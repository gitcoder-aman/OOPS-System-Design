package Classes.Solving_Design_FoodKart2.Services;

import java.util.List;

import Classes.Solving_Design_FoodKart2.Data.UserDao;
import Classes.Solving_Design_FoodKart2.Model.OrderModel;

public class OrderService {
    public static OrderService instance = null;

    private OrderService() {
    }

    //singleton pattern
    public static OrderService getInstance(){
        if(instance == null){
            instance = new OrderService();
        }
        return instance;
    }
    UserDao userDao = UserDao.getInstance();

    public OrderModel placeOrder(String name, Integer quantity){
        if(quantity <= 0){
            System.out.println("Invalid value for mandatory field");
            return null;
        }
        return userDao.placeOrder(name,quantity);
    }
    public List<OrderModel>listOrders(){
        return userDao.listOrder();
    }
    
}
