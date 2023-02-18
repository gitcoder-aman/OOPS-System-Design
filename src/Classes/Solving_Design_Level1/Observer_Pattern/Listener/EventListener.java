package Classes.Solving_Design_Level1.Observer_Pattern.Listener;

import java.io.File;

public interface EventListener {
    
    void update(String eventType, File file);
}
