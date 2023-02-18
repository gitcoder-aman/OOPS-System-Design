package Classes.Solving_Design_Level1.Observer_Pattern.Listener;

import java.io.File;

public class EmailNotificationListener implements EventListener{

    private String email;

    public EmailNotificationListener(String email) {
        this.email = email;
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Email to "+email +": Someone has performed "+ eventType + 
        " Operation is the following file: "+file.getName());
    }
    
}
