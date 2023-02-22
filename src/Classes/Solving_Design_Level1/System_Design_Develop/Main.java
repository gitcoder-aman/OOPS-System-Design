package Classes.Solving_Design_Level1.System_Design_Develop;

import Classes.Solving_Design_Level1.System_Design_Develop.Model.Cache;
import Classes.Solving_Design_Level1.System_Design_Develop.constants.EvicationPolicy;
import Classes.Solving_Design_Level1.System_Design_Develop.service.CacheService;

public class Main {
    public static void main(String[] args) {
        CacheService cacheService = CacheService.getInstance();
        Cache cache = cacheService.init(10, EvicationPolicy.LRU);
        cacheService.put("HelloJi","First Project done!");
        System.out.println(cacheService.get("HelloJi"));

    }
}
