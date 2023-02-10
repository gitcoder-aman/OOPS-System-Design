package Classes.Design_Pattern.Factory_Design_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PlanFactory factory = new PlanFactory();

        //take input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of plan for which the bill will be genereted");

        String planName = sc.nextLine();

        System.out.println("Enter the name of units for bill will be calculated");

        int units = sc.nextInt();

        //object creation
        Plan plan = factory.getPlan(planName);

        System.out.println("PlanName is :");
        System.out.println(planName);

        System.out.println("Rate is :");
        plan.getRate();
        System.out.println(plan.rate);

        System.out.println("Total bill is : ");
        plan.calculateBill(units);

    }
}
