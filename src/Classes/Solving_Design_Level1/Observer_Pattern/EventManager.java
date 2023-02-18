package Classes.Solving_Design_Level1.Observer_Pattern;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Classes.Solving_Design_Level1.Observer_Pattern.Listener.EventListener;

public class EventManager {
    Map<String,List<EventListener>>listeners = new HashMap<>();

    public EventManager(String ... operations){
        for(String operation : operations){
            this.listeners.put(operation, new ArrayList<>());
        }
    }

    public void subscribe(String EventType, EventListener listener){
        List<EventListener>users = listeners.get(EventType);
        users.add(listener);
    }
    public void unsubscribe(String EvenType, EventListener listener){
        List<EventListener>users = listeners.get(EvenType);
        users.remove(listener);
    }

    public void notify(String eventType, File file){
        List<EventListener>users = listeners.get(eventType);
        for(EventListener listener  : users){
            listener.update(eventType, file);
        }
    }
}
