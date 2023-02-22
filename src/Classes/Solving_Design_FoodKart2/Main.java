package Classes.Solving_Design_FoodKart2;

import java.util.List;

import Classes.Solving_Design_FoodKart2.Constants.enumGender;
import Classes.Solving_Design_FoodKart2.Model.OrderModel;
import Classes.Solving_Design_FoodKart2.Model.RestaurantModel;
import Classes.Solving_Design_FoodKart2.Model.ReviewModel;
import Classes.Solving_Design_FoodKart2.Model.UserModel;
import Classes.Solving_Design_FoodKart2.Services.OrderService;
import Classes.Solving_Design_FoodKart2.Services.RestroService;
import Classes.Solving_Design_FoodKart2.Services.UserService;

public class Main {
    public static void main(String[] args) {
        System.out.println("Execution started:");
        UserService userService = UserService.getInstance();
        RestroService restroService = RestroService.getInstance();
        OrderService orderService = OrderService.getInstance();

        UserModel userModel1 = userService.registerUser(45748375394L, "Aman", 100001L, enumGender.MALE);
        UserModel userModel2 = userService.registerUser(23877242382L, "Rohit", 100002L, enumGender.MALE);
        // UserModel userModel3 = userService.registerUser(34782748178L, "Mohit", 100003L, enumGender.MALE);


        // System.out.println();
        // //first user login
        UserModel login = userService.login(userModel1.getPhone());
        RestaurantModel r1 = restroService.registerRestaurant("FoodCourt1", "100001,100002,100004", "Burger", 100, 3);
        RestaurantModel r2 = restroService.registerRestaurant("FoodCourt2", "100001,100004", "Panner plate", 150, 2);

        //quantity is add in previous quantity
        r1 = restroService.updateQuantity("FoodCourt1", 5);

        // System.out.println();
        // //second user login
        // login = userService.login(userModel2.getPhone());
        // RestaurantModel r3 = restroService.registerRestaurant("FoodCourt3", "2,4", "Cake", 200, 6);

        // System.out.println();
        // //third user login
        // login = userService.login(userModel3.getPhone());
        // RestaurantModel r4 = restroService.registerRestaurant("FoodCourt4", "3,4", "Sahi Kawab", 120, 7);

        // System.out.println();
        // //first user login
        // login = userService.login(userModel1.getPhone());
        // restroService.showRestaurant("rating"); // r1 and r2 restaurant show

        // // only set date no expect any print value
        //simply order 4 total quantity is 8
        OrderModel orderModel =  orderService.placeOrder("FoodCourt1",4);
        //simply order 2 quantity is 4
        OrderModel orderModel1 = orderService.placeOrder("FoodCourt1",2);

        //restaurant has only 2
        OrderModel orderModel2 = orderService.placeOrder("FoodCourt1",3);

        // ordering to 2 which are save ordering
        OrderModel orderModel3 = orderService.placeOrder("FoodCourt1",2);

        //out of stock
        OrderModel orderModel4 = orderService.placeOrder("FoodCourt1",3);



        // ReviewModel reviewModel = restroService.rateRestaurant("FoodCourt1", 5, "Good");

        // System.out.println();
        // //now print the all data order and Review
        List<OrderModel>orderLists = orderService.listOrders();
        // restroService.showRestaurant("rating");


        System.out.println("Execution Ended");

    }
}
