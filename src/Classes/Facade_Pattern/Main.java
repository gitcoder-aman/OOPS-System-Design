package Classes.Facade_Pattern;

import java.util.Scanner;

public class Main {
    private static int choice;

    public static void main(String[] args) {
        do{
            System.out.println("============= Mobile Shop =============");
            System.out.println("               1.IPHONE                ");
            System.out.println("               2.SAMSUNG               ");
            System.out.println("               3.BLACKBERRY            ");
            System.out.println("               4.EXIT                  ");

            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            ShopKeeper_facade sk = new ShopKeeper_facade();

            switch (choice) {
                case 1:
                    sk.iphoneSale();
                    break;
                case 2:
                    sk.samsungSale();
                    break;
                case 3:
                    sk.blackberrySale();
                    break;
                default:
                System.out.println("Nothing you purchased:");
                System.exit(choice);
                    return;
            }
        }while(choice != 4);
    }
}
