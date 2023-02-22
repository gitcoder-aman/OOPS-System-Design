package Classes.Solving_Design_FoodKart2.Services;

import Classes.Solving_Design_FoodKart2.Constants.enumGender;
import Classes.Solving_Design_FoodKart2.Data.UserDao;
import Classes.Solving_Design_FoodKart2.Model.UserModel;

public class UserService {
    public static UserService instance = null;

    private UserService() {
    }

    public static UserService getInstance(){

        if(instance == null){
            instance = new UserService();
        }
        return instance;
    }

    UserDao userdao = UserDao.getInstance();

    public UserModel registerUser(Long phone, String name, Long pincode, enumGender gender){
        if(phone == null || phone < 100){
            System.out.println("Phone number can not be null !");
            return null;
        }else if(pincode == null || pincode < 6){
            System.out.println("Invalid value for pincode.");
            return null;
        }else if(name.isEmpty()){
            System.out.println("Invalid value for name!");
            return null;
        }

        return userdao.registUser(phone,name,pincode,gender);

    }

    public UserModel login(Long id){
       return userdao.login(id);
    }

    
}
