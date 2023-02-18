package Classes.Solving_Design_Level1.Observer_Pattern;

import Classes.Solving_Design_Level1.Observer_Pattern.Listener.EmailNotificationListener;
import Classes.Solving_Design_Level1.Observer_Pattern.Listener.LogOpenListener;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();

        editor.events.subscribe("open", new LogOpenListener("path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@gmail.com"));

        try{
            editor.openFile("test.txt");
            editor.saveFile();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
