// scratch class for quiz 2 functions

import java.util.*;

public class quiz2{
    public static void main(String[] args){

        Map<String, String> map = new HashMap<>();
        map.put("123","John Smith");
        map.put("111","George Smith");
        map.put("123", "Steve Yao");
        map.put("222", "Steve Yao");
        
        System.out.println(map.get("123")+" "+map.get("111")+" "+map.get("222"));



/*        HashSet<String> newSet = 
            new HashSet<String>(Arrays.asList(new String[]{"red", "green", "blue"}));
        //System.out.println(newSet);

        Set<String> set1 = new HashSet<>();
        set1.add("ATL");
        set1.add("MAC");
        set1.add("SAV");
        Set<String> set2 = new HashSet<>();
        set2.add("ATL");
        set2.add("MAC");
        set2.add("SAV");
        Set<String> set3 = new HashSet<>();
        set3.add("ATL");
        set3.add("SAV");
        set3.add("MAC");
        
        System.out.println(set1.equals(set2)+" "+set1.equals(set3));*/
    }
}

