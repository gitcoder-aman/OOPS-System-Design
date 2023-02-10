package Classes.Singleton_pattern;

public class Singleton {
    
    //data member
    static Singleton instance = null;

    //constructor private
    private Singleton(){

    }
    static synchronized Singleton getInstance(){   //make thread safe through using synchronized keyword
       
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
    public void sayHello(){
        System.out.println("Hi, I am  a Singleton Class");
        System.out.println(instance);
    }
}
