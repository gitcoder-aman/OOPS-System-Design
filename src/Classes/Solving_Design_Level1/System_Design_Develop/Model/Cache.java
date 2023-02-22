package Classes.Solving_Design_Level1.System_Design_Develop.Model;

import java.util.HashMap;
import java.util.LinkedList;

import Classes.Solving_Design_Level1.System_Design_Develop.constants.EvicationPolicy;

public class Cache {
    
    private int size;
    private EvicationPolicy evicationPolicy;
    private LinkedList<Object>dataStore;
    private HashMap<Object,Object>cacheStore;

    public Cache(int size, EvicationPolicy evicationPolicy) {
        this.size = size;
        this.evicationPolicy = evicationPolicy;
        this.dataStore = new LinkedList<>();
        this.cacheStore = new HashMap<>();
    }

    public boolean clear(){
        try{
            this.dataStore = new LinkedList<>();
            this.cacheStore = new HashMap<>();
            return true;

        }catch(Exception e){
            System.out.println("Searching went wrong while clearing cache.");
        }
        return false;
    }

    public int getSize(){
        return size;
    }

    public HashMap<Object, Object> getCacheStore() {
        return cacheStore;
    }
    public LinkedList<Object> getDataStore() {
        return dataStore;
    }

    public EvicationPolicy getEvicationPolicy() {
        return evicationPolicy;
    }
    
    
}
