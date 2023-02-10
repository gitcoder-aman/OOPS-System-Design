package Utils;

import BasicOopsClass.Human;

public class Female extends Human{

    void print(){
        System.out.println(weight);
    }
    
    public static void main(String[] args) {
        System.out.println(weight);  // i'm access to able because extend the Human (this is subClass in out side package).
    }
}
