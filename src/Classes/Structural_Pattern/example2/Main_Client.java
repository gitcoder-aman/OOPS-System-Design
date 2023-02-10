package Classes.Structural_Pattern.example2;

public class Main_Client {
    public static void main(String[] args) {
        CreditCard_Target targetInterface = new BankCustomerAdapter();
        targetInterface.giveBankDetail();  //taking the all data from user
        System.out.println(targetInterface.getCreditCard());
    }
}
