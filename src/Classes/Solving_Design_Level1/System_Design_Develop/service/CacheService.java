package Classes.Solving_Design_Level1.System_Design_Develop.service;

import Classes.Solving_Design_Level1.System_Design_Develop.Model.Cache;
import Classes.Solving_Design_Level1.System_Design_Develop.constants.EvicationPolicy;
import Classes.Solving_Design_Level1.System_Design_Develop.dao.CacheDao;

public class CacheService {
    private static CacheService instance = null;

    private CacheService(){

    }
    public static CacheService getInstance(){ // singleton desing pattern use here 
        if(instance == null){
            instance = new CacheService();
        }
        return instance;
    }

    private CacheDao cacheDao = CacheDao.getInstance();

    public Cache init(int size, EvicationPolicy evicationPolicy){
        return cacheDao.creatCache(size, evicationPolicy);
    }

    public Object get(Object obj){
        return cacheDao.get(obj);
    }
    public boolean put(Object key, Object val){
        return cacheDao.put(key,val);
    }
    public boolean delete(Object key){
        return cacheDao.delete(key);
    }
}
