package Classes.Solving_Design_Level1.System_Design_Develop.dao;

import Classes.Solving_Design_Level1.System_Design_Develop.Model.Cache;
import Classes.Solving_Design_Level1.System_Design_Develop.constants.EvicationPolicy;

public class CacheDao {
    private static CacheDao cacheDao = null;
    private Cache cache = null;

    private CacheDao(){

    }
     public static CacheDao getInstance(){
        if(cacheDao == null){
            cacheDao = new CacheDao();
        }
        return cacheDao;
     }
     public Cache creatCache(int size, EvicationPolicy evicationPolicy){
        cache = new Cache(size, evicationPolicy);
        return cache;
     }
     public Object get(Object obj){
        Object result = cache.getCacheStore().get(obj);
        if(result == null) return null;

        //if Object is exists, return result
        //Update data store, in according to Evication Policy
        cache.getDataStore().remove(obj);
        cache.getDataStore().addFirst(obj);  // LRU - Least Recently used
        return result;
     }
     public Boolean put(Object key, Object val){

        try{
            //Check if we have empty space in cache
            if(cache.getSize() == cache.getDataStore().size()){
                Object last = cache.getDataStore().removeLast();
                cache.getCacheStore().remove(last);
            }
            //remove key from LL if exists beforhand
            cache.getDataStore().remove(key);
            //place it in front
            cache.getDataStore().addFirst(key);
            //insert into map
            cache.getCacheStore().put(key,val);

            return true;
             
        }catch(Exception e){
            System.out.println("Something went wrong while adding element.");
        }
        return false;
     }

     public Boolean delete(Object obj){
        if(cache.getDataStore().size() == 0) return true;

        try{
            cache.getDataStore().remove(obj);
            cache.getCacheStore().remove(obj);
            return true;
        }catch(Exception e){
            System.out.println("Something went wrong while removing element.");
        }
        return false;  
     }
     public Boolean clear(){
        return cache.clear();
     }
}
