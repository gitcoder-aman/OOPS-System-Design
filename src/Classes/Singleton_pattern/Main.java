package Classes.Singleton_pattern;

public class Main {
    public static void main(String[] args) {
        
        Singleton singleton = Singleton.getInstance();
        singleton.sayHello();

        Singleton singleton2 = Singleton.getInstance();
        singleton2.sayHello();     //in this here allocated same memory for singeton or singleton2

    }
}
