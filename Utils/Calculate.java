package Utils;

import BasicOopsClass.Human;

public class Calculate {
    void print(){
        Human obj = new Human();
        // obj.age = 0;     //no access because age is default access modifier and outside package have not acess.

        obj.body = 2;
        // obj.weight = 10;
        System.out.println(obj.body);
    }

    public static void main(String[] args) {
        Calculate obj = new Calculate();
    
        obj.print();
    }
}

